# Prompt para Mejorar el Codigo Base

Copia y pega el contenido del bloque de abajo en un asistente de IA (Claude, ChatGPT)
para obtener el proyecto completo y arrancable. Guarda los archivos que te devuelva en la
carpeta del repo, respetando exactamente las rutas.

Si preferis trabajar en tu editor con un agente local (Claude Code, Cursor, Copilot), usa `AGENTS.md` en vez de este archivo: dice lo mismo pero para que escriba los archivos en disco.

## Las dos reglas que no se negocian

1. **Completa el boilerplate.** Todo lo que el proyecto necesita para compilar y arrancar: manifiesto de dependencias, punto de entrada, configuracion, capa de interfaz, y las capas del patron arquitectonico declarado. Eso es andamiaje y es tu trabajo.
2. **NO resuelvas el reto.** Los entregables de las fases son el trabajo de la persona. El hueco pedagogico se deja como esta: el proyecto arranca, pero lo que el reto pide implementar NO esta implementado.

Dicho de otra forma: si algo impide compilar, arreglalo. Si algo es logica de negocio incompleta, validaciones ausentes, un secreto hardcodeado o un patron mejorable, dejalo exactamente como esta — es lo que la persona tiene que encontrar.

## Superficie de practica — NO resuelvas

Estos archivos SON el ejercicio de la persona. No los implementes; deja stubs.

- `src/main/kotlin/domain/infrastructure/plugins/Routing.kt` — La fase "Configuración y creación de endpoints básicos" se implementa aqui: este archivo es el ejercicio.
- `src/main/kotlin/domain/infrastructure/routes/TaskRoutes.kt` — La fase "Actualización de tareas y manejo de errores" se implementa aqui: este archivo es el ejercicio.

## Lo que le falta a este proyecto

Esto NO lo tenes que adivinar: salio de comparar el proyecto contra la arquitectura declarada del reto y de un analisis estatico del codigo. Completalo TODO.

### Imports sin uso — no rompen la compilacion

Limpieza opcional: el proyecto compila igual con ellos:

- `src/main/kotlin/domain/infrastructure/routes/TaskRoutes.kt` — `TaskRequest`
- `src/main/kotlin/domain/infrastructure/routes/TaskRoutes.kt` — `TaskResponse`
- `src/main/kotlin/domain/infrastructure/routes/TaskRoutes.kt` — `TaskStatus`

## Como saber que terminaste

```bash
mvn clean compile
```

Ese comando corriendo sin errores es la definicion de "listo".

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Backend, Especialidad Desarrollador, Tecnología Kotlin, Senior L2

### Brecha de conocimiento
Construir una API REST en Kotlin con Ktor para gestionar tareas, Implementa endpoints REST en Kotlin con Ktor para crear, listar y actualizar tareas

### Misión / candidato
Exponer la gestion de tareas por HTTP

### Reto
- Tema: API REST de tareas con Kotlin y Ktor
- Seniority: senior-l2
- Tipo: practical
- Título: Gestión de tareas con API REST en Kotlin
- Tiempo estimado: 10 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Configuración y creación de endpoints básicos — objetivo: Establecer la estructura básica de la API REST y crear los endpoints para crear y listar tareas. — entregable (NO resolver): API REST con endpoints para crear y listar tareas, incluyendo validaciones básicas.
- Fase 2: Actualización de tareas y manejo de errores — objetivo: Implementar el endpoint para actualizar tareas y mejorar el manejo de errores en la API. — entregable (NO resolver): API REST actualizada con endpoint para modificar tareas y mejorado manejo de errores.
- Fase 3: Optimización y decisiones de diseño — objetivo: Optimizar la API y tomar decisiones de diseño para mejorar su rendimiento y escalabilidad. — entregable (NO resolver): API REST optimizada con decisiones de diseño documentadas para mejorar el rendimiento y la escalabilidad.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (entrega de archivos).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Entrega de archivos
Entregá cada archivo con su ruta completa, respetando exactamente la estructura de rutas
indicada por los marcadores: un bloque por archivo, precedido por su ruta. No generes ZIPs
ni archivos adjuntos.
La entrega debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: Entregá los archivos completos al finalizar. No preguntes si el usuario
quiere recibirlos. Simplemente entregalos; No debes desplegar en el chat el resumen de lo que arreglaste, solo entregá los archivos.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del último archivo entregado
No preguntes si el usuario quiere los archivos: simplemente entregalos siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

// === ARCHIVO: pom.xml ===
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.example</groupId>
  <artifactId>ktor-skeleton</artifactId>
  <version>1.0.0</version>
  <packaging>jar</packaging>
  
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <kotlin.version>1.9.22</kotlin.version>
    <ktor.version>2.3.12</ktor.version>
    <jvm.target>21</jvm.target>
  </properties>

  <dependencies>
    <dependency>
      <groupId>io.ktor</groupId>
      <artifactId>ktor-server-core-jvm</artifactId>
      <version>${ktor.version}</version>
    </dependency>
    <dependency>
      <groupId>io.ktor</groupId>
      <artifactId>ktor-server-netty-jvm</artifactId>
      <version>${ktor.version}</version>
    </dependency>
    <dependency>
      <groupId>org.jetbrains.kotlin</groupId>
      <artifactId>kotlin-test-junit</artifactId>
      <version>${kotlin.version}</version>
      <scope>test</scope>
    </dependency>
      <dependency>
          <groupId>com.h2database</groupId>
          <artifactId>h2</artifactId>
          <version>2.5.252</version>
      </dependency>
      <dependency>
          <groupId>io.ktor</groupId>
          <artifactId>ktor-serialization-kotlinx-json-jvm</artifactId>
          <version>2.3.12</version>
      </dependency>
      <dependency>
          <groupId>io.ktor</groupId>
          <artifactId>ktor-server-content-negotiation-jvm</artifactId>
          <version>2.3.12</version>
      </dependency>
      <dependency>
          <groupId>io.ktor</groupId>
          <artifactId>ktor-server-status-pages-jvm</artifactId>
          <version>2.3.12</version>
      </dependency>
      <dependency>
          <groupId>org.jetbrains.exposed</groupId>
          <artifactId>exposed-core</artifactId>
          <version>0.61.0</version>
      </dependency>
      <dependency>
          <groupId>org.jetbrains.exposed</groupId>
          <artifactId>exposed-dao</artifactId>
          <version>0.61.0</version>
      </dependency>
      <dependency>
          <groupId>org.jetbrains.exposed</groupId>
          <artifactId>exposed-jdbc</artifactId>
          <version>0.61.0</version>
      </dependency>
      <dependency>
          <groupId>org.jetbrains.kotlinx</groupId>
          <artifactId>kotlinx-coroutines-core</artifactId>
          <version>1.8.1</version>
      </dependency>
      <dependency>
          <groupId>org.jetbrains.kotlinx</groupId>
          <artifactId>kotlinx-serialization-json</artifactId>
          <version>1.6.3</version>
      </dependency>
  </dependencies>

  <build>
    <sourceDirectory>${project.basedir}/src/main/kotlin</sourceDirectory>
    <testSourceDirectory>${project.basedir}/src/test/kotlin</testSourceDirectory>
    <plugins>
      <plugin>
        <groupId>org.jetbrains.kotlin</groupId>
        <artifactId>kotlin-maven-plugin</artifactId>
        <version>${kotlin.version}</version>
        <configuration>
          <compilerPlugins>
            <plugin>kotlinx-serialization</plugin>
          </compilerPlugins>
        </configuration>
        <dependencies>
          <dependency>
            <groupId>org.jetbrains.kotlin</groupId>
            <artifactId>kotlin-maven-serialization</artifactId>
            <version>${kotlin.version}</version>
          </dependency>
        </dependencies>
        <executions>
          <execution>
            <id>compile</id>
            <goals>
              <goal>compile</goal>
            </goals>
          </execution>
          <execution>
            <id>test-compile</id>
            <goals>
              <goal>test-compile</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.11.0</version>
        <configuration>
          <source>${jvm.target}</source>
          <target>${jvm.target}</target>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>

// === ARCHIVO: src/main/kotlin/com/example/Application.kt ===
package com.example

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.routing.*
import domain.infrastructure.routes.taskRoutes

fun main() {
    embeddedServer(Netty, port = 8080, module = Application::module).start(wait = true)
}

fun Application.module() {
    routing {
        taskRoutes()
    }
}

// === ARCHIVO: mvnw ===
#!/bin/sh
"exec" "$(dirname "$0")/mvnw" "$@"

// === ARCHIVO: mvnw.cmd ===
@REM
@REM Copyright 2007 The Apache Software Foundation.
@REM
@REM Licensed under the Apache License, Version 2.0 (the "License");
@REM you may not use this file except in compliance with the License.
@REM You may obtain a copy of the License at
@REM
@REM     http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing, software
@REM distributed under the License is distributed on an "AS IS" BASIS,
@REM WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@REM See the License for the specific language governing permissions and
@REM limitations under the License.

@IF "%MAVEN_SKIP_RC%" == "" @
@call :chkMHome
@IF ERRORLEVEL 1 @
@call "%MAVEN_PROJECTBASEDIR%\.mvn\jvm.config" %MAVEN_CMD_LINE_ARGS%
@goto :continue

@:chkMHome
@REM Check for Maven home defined inside Maven wrapper distribution
@IF "%MAVEN_HOME%" == "" (
  @SET MAVEN_HOME=%~dp0\.mvn\wrapper\maven-wrapper
)

@:continue
@set CMD_LINE_ARGS=%*
@set MAVEN_JAVA_EXE="%JAVA_HOME%\bin\java.exe"
@set WRAPPER_JAR="%MAVEN_HOME%\maven-wrapper.jar"
@set WRAPPER_PROPS="%MAVEN_HOME%\maven-wrapper.properties"
@set WRAPPER_LOG="%MAVEN_HOME%\maven-wrapper.log"

@if exist %MAVEN_JAVA_EXE% (
  if exist %WRAPPER_JAR% (
    %MAVEN_JAVA_EXE% %MAVEN_OPTS% -classpath %WRAPPER_JAR% -Dmaven.multiModuleProjectDirectory="%MAVEN_PROJECTBASEDIR%" org.apache.maven.wrapper.MavenWrapperMain %CMD_LINE_ARGS%
  ) else (
    @echo Could not locate maven-wrapper.jar, using basic mvn commands
    @call mvn %CMD_LINE_ARGS%
  )
) else (
  @echo Could not locate java.exe, please check JAVA_HOME
)

// === ARCHIVO: .mvn/wrapper/maven-wrapper.properties ===
distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.6/apache-maven-3.9.6-bin.zip
wrapperUrl=https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.3.0/maven-wrapper-3.3.0.jar

// === ARCHIVO: src/main/kotlin/domain/domain/model/Task.kt ===
package domain.model

import java.time.LocalDateTime
import java.util.UUID

data class Task(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val description: String,
    val status: TaskStatus = TaskStatus.PENDING,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now()
) {
    init {
        require(title.isNotBlank()) { "Title cannot be blank" }
        require(description.isNotBlank()) { "Description cannot be blank" }
    }

    fun update(title: String, description: String, status: TaskStatus): Task {
        return copy(
            title = title,
            description = description,
            status = status,
            updatedAt = LocalDateTime.now()
        )
    }
}

enum class TaskStatus {
    PENDING,
    IN_PROGRESS,
    COMPLETED
}

// === ARCHIVO: src/main/kotlin/domain/domain/repository/TaskRepository.kt ===
package domain.repository

import domain.model.Task

interface TaskRepository {
    suspend fun save(task: Task): Task
    suspend fun findById(id: String): Task?
    suspend fun findAll(): List<Task>
    suspend fun update(task: Task): Task
    suspend fun delete(id: String)
}

// === ARCHIVO: src/main/kotlin/domain/application/dto/TaskRequest.kt ===
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

// === ARCHIVO: src/main/kotlin/domain/application/dto/TaskResponse.kt ===
package domain.application.dto

import domain.model.Task
import domain.model.TaskStatus
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object LocalDateTimeSerializer : KSerializer<LocalDateTime> {
    private val formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME

    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("LocalDateTime", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: LocalDateTime) {
        encoder.encodeString(value.format(formatter))
    }

    override fun deserialize(decoder: Decoder): LocalDateTime {
        return LocalDateTime.parse(decoder.decodeString(), formatter)
    }
}

@Serializable
data class TaskResponse(
    val id: String,
    val title: String,
    val description: String,
    val status: TaskStatus,
    @Serializable(with = LocalDateTimeSerializer::class)
    val createdAt: LocalDateTime,
    @Serializable(with = LocalDateTimeSerializer::class)
    val updatedAt: LocalDateTime
) {
    companion object {
        fun fromDomain(task: Task): TaskResponse {
            return TaskResponse(
                id = task.id,
                title = task.title,
                description = task.description,
                status = task.status,
                createdAt = task.createdAt,
                updatedAt = task.updatedAt
            )
        }
    }

    fun toDomain(): Task {
        return Task(
            id = id,
            title = title,
            description = description,
            status = status,
            createdAt = createdAt,
            updatedAt = updatedAt
        )
    }
}

@Serializable
data class TaskListResponse(
    val tasks: List<TaskResponse>
)

// === ARCHIVO: src/main/kotlin/domain/application/service/TaskService.kt ===
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

// === ARCHIVO: src/main/kotlin/domain/infrastructure/repository/TaskRepositoryImpl.kt ===
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

// === ARCHIVO: src/main/kotlin/domain/infrastructure/plugins/Routing.kt ===
// TODO(reto): archivo stubbeado; implementa los cuerpos.
package domain.infrastructure.plugins

import io.ktor.server.routing.*
import io.ktor.server.application.*
import domain.infrastructure.routes.taskRoutes

fun Application.configureRouting() {
  TODO("reto: configureRouting")
}

// === ARCHIVO: src/main/kotlin/domain/infrastructure/routes/TaskRoutes.kt ===
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
```
