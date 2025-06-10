# Practica03-AplicacionXP-KevinVillacis
# Documentación Técnica - Proyecto ToDoList

Este documento describe la evolución del proyecto y proporciona información relevante para los desarrolladores sobre las funcionalidades implementadas y las decisiones tomadas durante el proceso de desarrollo.

## Nuevas clases y métodos implementados

### 1. **`HomeController.java`**
   - Ruta `/about`: Implementación de la página "Acerca de" que muestra la versión y el nombre del desarrollador.

### 2. **`UsuarioController.java`**
   - Ruta `/registrados`: Muestra una lista de todos los usuarios registrados en la base de datos.

### 3. **`ManagerUserSession.java`**
   - Se implementó la gestión de la sesión del usuario logeado, incluyendo los métodos `logearUsuario()`, `usuarioLogeado()`, y `logout()`.

## Nuevas plantillas Thymeleaf añadidas

### 1. **`about.html`**
   - Página estática de información sobre la aplicación.

### 2. **`listadoUsuarios.html`**
   - Vista que muestra una tabla con los usuarios registrados (ID, email y nombre).

### 3. **`descripcionUsuario.html`**
   - Página detallada con la información de un usuario específico.

## Explicación de los tests implementados

Se implementaron pruebas automatizadas utilizando **MockMvc** para validar el correcto funcionamiento de las vistas y controladores. Por ejemplo:

```java
@Test
public void testGetAboutPage() throws Exception {
    this.mockMvc.perform(get("/about"))
        .andExpect(status().isOk())
        .andExpect(content().string(containsString("ToDoList")));
}
