package domain.repository

import domain.model.Task

interface TaskRepository {
    suspend fun save(task: Task): Task
    suspend fun findById(id: String): Task?
    suspend fun findAll(): List<Task>
    suspend fun update(task: Task): Task
    suspend fun delete(id: String)
}