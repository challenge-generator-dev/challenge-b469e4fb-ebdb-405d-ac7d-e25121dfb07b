package domain.infrastructure.routes

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.util.*
import io.ktor.http.*
import domain.application.dto.TaskRequest
import domain.application.dto.TaskResponse
import domain.application.service.TaskService
import domain.model.TaskStatus
import domain.infrastructure.repository.TaskRepositoryImpl
import kotlinx.serialization.json.Json

fun Routing.taskRoutes() {
    val taskService = TaskService(TaskRepositoryImpl())

    route("/tasks") {
        get {
            // TODO(reto): Implementar listado de todas las tareas
            // LLamar a taskService.getAllTasks() y retornar como JSON
        }

        post {
            // TODO(reto): Implementar creación de tarea
            // Recibir TaskRequest del body, convertir a dominio,
            // llamar a taskService.createTask() y retornar 201 Created
        }

        get("/{id}") {
            // TODO(reto): Implementar obtención de tarea por ID
            // Extraer id de path parameter, llamar a taskService.getTaskById()
            // Retornar 200 OK con la tarea o 404 Not Found si no existe
        }

        put("/{id}") {
            // TODO(reto): Implementar actualización de tarea
            // Extraer id de path parameter, recibir TaskRequest del body,
            // llamar a taskService.updateTask() y retornar 200 OK o 404
        }

        delete("/{id}") {
            // TODO(reto): Implementar eliminación de tarea
            // Extraer id de path parameter, llamar a taskService.deleteTask()
            // Retornar 204 No Content si se eliminó o 404 si no existía
        }
    }
}