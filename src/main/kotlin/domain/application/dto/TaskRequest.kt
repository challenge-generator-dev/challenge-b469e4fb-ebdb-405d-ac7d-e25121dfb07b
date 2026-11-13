package domain.application.dto

import domain.model.TaskStatus
import kotlinx.serialization.Serializable

@Serializable
data class TaskRequest(
    val title: String,
    val description: String,
    val status: TaskStatus? = null
) {
    init {
        require(title.isNotBlank()) { "Title cannot be blank" }
        require(description.isNotBlank()) { "Description cannot be blank" }
    }

    fun toDomain(): TaskCreateDomain {
        return TaskCreateDomain(
            title = title,
            description = description,
            status = status ?: TaskStatus.PENDING
        )
    }
}

@Serializable
data class TaskCreateDomain(
    val title: String,
    val description: String,
    val status: TaskStatus
)