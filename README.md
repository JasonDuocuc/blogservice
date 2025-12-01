# HuertoHogar - Backend Service

Servicio API REST desarrollado en Spring Boot para la gestión de contenidos de la aplicación móvil "HuertoHogar". Este microservicio se encarga de administrar los consejos y tips de jardinería que se visualizan en la app.

## Equipo de Desarrollo
* Pancho Torres
* Jason Mancilla
* Manuel Vallegos

## Descripción Técnica
Este proyecto implementa un controlador REST (`BlogController`) que permite realizar operaciones CRUD (Crear, Leer, Actualizar y Borrar) sobre los consejos de huerto.

### Especificaciones
* **Lenguaje:** Java / Spring Boot.
* **Puerto Base:** 8080.
* **Persistencia:** Gestión de datos en memoria (Simulación de base de datos con Listas y AtomicInteger para identificadores).
* **Formato de Intercambio:** JSON.

## Documentación de API (Endpoints)
El recurso principal se encuentra bajo la ruta `/api/blog`.

### 1. Obtener todos los consejos
Recupera el listado completo de tips de jardinería almacenados.
* **Método:** `GET`
* **URL:** `/api/blog`

### 2. Crear un nuevo consejo
Permite a la aplicación móvil subir un nuevo tip al servidor.
* **Método:** `POST`
* **URL:** `/api/blog`
* **Cuerpo (JSON):**
  ```json
  {
    "titulo": "Nombre del consejo",
    "contenido": "Descripción detallada del consejo..."
  }
