# Gestión de tareas con API REST en Kotlin

En el dominio de la gestión de tareas, debes construir una API REST en Kotlin utilizando Ktor para permitir la creación, listado y actualización de tareas. El sistema debe manejar y validar las operaciones de manera eficiente, asegurando la integridad de los datos y la disponibilidad del servicio.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | API REST de tareas con Kotlin y Ktor |
| **Nivel** | senior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 10 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y entregará cada archivo con su ruta.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y entregará cada archivo con su ruta. Guárdalos en la carpeta donde quieras trabajar, respetando las rutas.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no entrega todos los archivos al terminar el análisis, escríbele: "entrégame todos los archivos con su ruta".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Configuración y creación de endpoints básicos

**Objetivo:** Establecer la estructura básica de la API REST y crear los endpoints para crear y listar tareas.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Define la estructura de datos para una tarea, incluyendo atributos como título, descripción y estado.
- Implementa los endpoints REST para crear y listar tareas, asegurando que las operaciones sean idempotentes y robustas ante entradas inválidas.

**Entregable:** API REST con endpoints para crear y listar tareas, incluyendo validaciones básicas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la mejor forma de representar las tareas en la API.
- Piensa en cómo manejar errores de validación y entradas inválidas.

</details>

### Fase 2: Actualización de tareas y manejo de errores

**Objetivo:** Implementar el endpoint para actualizar tareas y mejorar el manejo de errores en la API.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Añade el endpoint para actualizar el estado y la descripción de una tarea existente.
- Mejora el manejo de errores para cubrir casos como tareas no encontradas o atributos inválidos.

**Entregable:** API REST actualizada con endpoint para modificar tareas y mejorado manejo de errores.

<details>
<summary>Pistas de conocimiento</summary>

- Evalúa diferentes estrategias para el manejo de errores y elige la más adecuada para tu API.
- Considera cómo comunicar los errores al cliente de una manera clara y útil.

</details>

### Fase 3: Optimización y decisiones de diseño

**Objetivo:** Optimizar la API y tomar decisiones de diseño para mejorar su rendimiento y escalabilidad.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Identifica áreas de optimización en tu API, como la reducción de la latencia en las respuestas.
- Toma decisiones de diseño para mejorar la escalabilidad y el rendimiento de la API, considerando trade-offs entre consistencia y disponibilidad.

**Entregable:** API REST optimizada con decisiones de diseño documentadas para mejorar el rendimiento y la escalabilidad.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga técnicas de optimización para APIs REST.
- Evalúa los trade-offs entre consistencia y disponibilidad en el contexto de tu API.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una tarea en el contexto de tu API y cómo la representarías en tu sistema?
- **paraQueSirve**: ¿Para qué sirve cada endpoint en tu API y cómo contribuyen a la gestión de tareas?
- **comoSeUsa**: ¿Cómo se usa tu API para crear, listar y actualizar tareas? Describe el flujo de una tarea desde su creación hasta su actualización.
- **erroresComunes**: ¿Qué errores comunes puedes encontrar al implementar tu API y cómo los manejas?
- **queDecisionesImplica**: ¿Qué decisiones de diseño tomaste para mejorar el rendimiento y la escalabilidad de tu API y por qué?

## Criterios de Evaluacion

- Implementación correcta de endpoints para crear, listar y actualizar tareas.
- Manejo adecuado de errores y entradas inválidas.
- Optimización y decisiones de diseño documentadas para mejorar el rendimiento y la escalabilidad.

## Como trabajar con un asistente de IA

Hay dos caminos, elegi uno:

- **AGENTS.md** (recomendado) — instrucciones nativas del repo. Abri esta carpeta con tu agente local (Claude Code, Cursor, Codex, Copilot, Gemini) y las carga solo. Sabe que archivos faltan y con que comando se verifica, y completa el scaffold escribiendo en disco.
- **PROMPT_MEJORA.md** — para copiar y pegar en un chat (claude.ai, ChatGPT) si no tenes un agente en el IDE. Declara lo mismo que AGENTS.md; los archivos que te devuelva el chat los guardas en esta carpeta respetando las rutas.

Ninguno de los dos resuelve las fases del reto: eso es tu trabajo.

## Verificacion

El proyecto esta listo para trabajar cuando este comando corre sin errores:

```bash
mvn clean compile
```

---

*Reto generado automaticamente por Challenge Generator - Pragma*
