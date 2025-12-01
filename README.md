# HuertoHogar - Backend Service

Servicio API REST desarrollado en Spring Boot para la gestión de contenidos de la aplicación móvil. Este microservicio administra los consejos y tips de jardinería.

## Equipo de Desarrollo
* Pancho Torres
* Jason Mancilla
* Manuel Vallegos

## Descripción Técnica
Este proyecto implementa un controlador REST (`BlogController`) que permite realizar operaciones CRUD sobre los consejos de huerto, sirviendo como fuente de datos para la aplicación móvil.

### Especificaciones
* **Lenguaje:** Java / Spring Boot.
* **Puerto Base:** 8080.
* **Persistencia:** Gestión de datos en memoria (Simulación de base de datos).
* **Formato:** JSON.

## Documentación de API (Endpoints)
El recurso principal se encuentra bajo la ruta `/api/blog`.

### Endpoints Disponibles
* `GET /api/blog`
  * **Descripción:** Recupera el listado completo de tips de jardinería.
* `POST /api/blog`
  * **Descripción:** Permite subir un nuevo tip al servidor.
* `PUT /api/blog/{id}`
  * **Descripción:** Actualiza el título o contenido de un consejo específico.
* `DELETE /api/blog/{id}`
  * **Descripción:** Elimina un registro del sistema mediante su ID.

## Instrucciones de Ejecución
1. Clonar el repositorio.
2. Abrir el proyecto en **IntelliJ IDEA**.
3. Sincronizar las dependencias (`pom.xml`).
4. Ejecutar la clase principal `BlogserviceApplication`.
5. El servicio iniciará en `http://localhost:8080`.
