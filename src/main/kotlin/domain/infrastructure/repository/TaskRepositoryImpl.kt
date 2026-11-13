package domain.infrastructure.repository

import domain.model.Task
import domain.model.TaskStatus
import domain.repository.TaskRepository
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.deleteWhere
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.experimental.newSuspendedTransaction
import org.jetbrains.exposed.sql.transactions.transaction
import org.jetbrains.exposed.sql.update
import java.time.LocalDateTime

object Tasks : Table() {
    val id = varchar("id", 36).uniqueIndex()
    val title = varchar("title", 255)
    val description = text("description")
    val status = enumeration("status", TaskStatus::class)
    val createdAt = varchar("created_at", 50)
    val updatedAt = varchar("updated_at", 50)

    override val primaryKey = PrimaryKey(id)
}

class TaskRepositoryImpl : TaskRepository {
    init {
        transaction {
            SchemaUtils.create(Tasks)
        }
    }

    override suspend fun save(task: Task): Task = newSuspendedTransaction {
        Tasks.insert { row ->
            row[Tasks.id] = task.id
            row[Tasks.title] = task.title
            row[Tasks.description] = task.description
            row[Tasks.status] = task.status
            row[Tasks.createdAt] = task.createdAt.toString()
            row[Tasks.updatedAt] = task.updatedAt.toString()
        }
        task
    }

    override suspend fun findById(id: String): Task? = newSuspendedTransaction {
        Tasks.select { Tasks.id eq id }
            .map { rowToTask(it) }
            .singleOrNull()
    }

    override suspend fun findAll(): List<Task> = newSuspendedTransaction {
        Tasks.selectAll().map { rowToTask(it) }
    }

    override suspend fun update(task: Task): Task = newSuspendedTransaction {
        Tasks.update({ Tasks.id eq task.id }) { row ->
            row[Tasks.title] = task.title
            row[Tasks.description] = task.description
            row[Tasks.status] = task.status
            row[Tasks.updatedAt] = task.updatedAt.toString()
        }
        task
    }

    override suspend fun delete(id: String): Unit = newSuspendedTransaction {
        Tasks.deleteWhere { Tasks.id eq id }
    }

    private fun rowToTask(row: ResultRow): Task {
        return Task(
            id = row[Tasks.id],
            title = row[Tasks.title],
            description = row[Tasks.description],
            status = row[Tasks.status],
            createdAt = LocalDateTime.parse(row[Tasks.createdAt]),
            updatedAt = LocalDateTime.parse(row[Tasks.updatedAt])
        )
    }
}