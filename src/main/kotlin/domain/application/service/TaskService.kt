package domain.application.service

import domain.application.dto.TaskCreateDomain
import domain.application.dto.TaskResponse
import domain.model.Task
import domain.model.TaskStatus
import domain.repository.TaskRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class TaskService(private val taskRepository: TaskRepository) {

    suspend fun createTask(taskCreateDomain: TaskCreateDomain): TaskResponse {
        return withContext(Dispatchers.IO) {
            val task = Task(
                title = taskCreateDomain.title,
                description = taskCreateDomain.description,
                status = taskCreateDomain.status
            )
            val savedTask = taskRepository.save(task)
            TaskResponse.fromDomain(savedTask)
        }
    }

    suspend fun getAllTasks(): List<TaskResponse> {
        return withContext(Dispatchers.IO) {
            taskRepository.findAll().map { TaskResponse.fromDomain(it) }
        }
    }

    suspend fun getTaskById(id: String): TaskResponse? {
        return withContext(Dispatchers.IO) {
            taskRepository.findById(id)?.let { TaskResponse.fromDomain(it) }
        }
    }

    suspend fun updateTask(id: String, title: String, description: String, status: TaskStatus): TaskResponse? {
        return withContext(Dispatchers.IO) {
            val existingTask = taskRepository.findById(id) ?: return@withContext null
            val updatedTask = existingTask.update(title, description, status)
            taskRepository.update(updatedTask)
            TaskResponse.fromDomain(updatedTask)
        }
    }

    suspend fun deleteTask(id: String): Boolean {
        return withContext(Dispatchers.IO) {
            taskRepository.findById(id)?.let {
                taskRepository.delete(id)
                true
            } ?: false
        }
    }
}