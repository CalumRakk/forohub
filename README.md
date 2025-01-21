ForoHub es una aplicación de foro web construida con Spring Boot. Permite a los usuarios crear, leer, actualizar y eliminar temas de discusión. La aplicación utiliza Spring Security para la autenticación y autorización, Spring Data JPA para la persistencia de datos y JWT para la gestión de tokens.

## Características

- CRUD de Tópicos: Crear, leer, actualizar y eliminar temas de foro.
- Autenticación: Autenticación de usuarios mediante un nombre de usuario y contraseña.
- Autorización: Los usuarios autenticados pueden realizar operaciones CRUD en los tópicos.
- Seguridad: Utiliza Spring Security y JWT para proteger los endpoints.
- Persistencia: Almacena los datos en una base de datos PostgreSQL.

## Tecnologías Utilizadas

- Spring Boot
- Spring Security
- Spring Data JPA
- Spring Boot DevTools
- Spring Validation
- JWT (Java Web Token)
- PostgreSQL
- Lombok
- Maven

## Cómo Ejecutar

1. **Clonar el repositorio:**

   ```bash
   git clone <URL_DEL_REPOSITORIO>
   ```

2. **Navegar al directorio del proyecto:**

   ```bash
   cd forohub
   ```

3. **Ejecutar la aplicación:**

   ```bash
   ./mvnw spring-boot:run
   ```

## API Endpoints

- **POST /login:** Autenticar un usuario y obtener un token JWT.
- **POST /topicos:** Crear un nuevo tópico.
- **GET /topicos/{id}:** Obtener un tópico por ID.
- **PUT /topicos/{id}:** Actualizar un tópico por ID.
- **DELETE /topicos/{id}:** Eliminar un tópico por ID.

## Configuración

- La configuración de la base de datos se encuentra en `src/main/resources/application.properties`.
- El secreto de JWT se encuentra en `src/main/resources/application.properties`.

## Documentación de Referencia

Para obtener más información, consulta la siguiente documentación:

- [Documentación oficial de Apache Maven](https://maven.apache.org/guides/index.html)
- [Guía de referencia del plugin Spring Boot Maven](https://docs.spring.io/spring-boot/3.4.1/maven-plugin)
- [Crear una imagen OCI](https://docs.spring.io/spring-boot/3.4.1/maven-plugin/build-image.html)
- [Spring Web](https://docs.spring.io/spring-boot/3.4.1/reference/web/servlet.html)
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.4.1/reference/using/devtools.html)
- [Spring Data JPA](https://docs.spring.io/spring-boot/3.4.1/reference/data/sql.html#data.sql.jpa-and-spring-data)
- [Validación](https://docs.spring.io/spring-boot/3.4.1/reference/io/validation.html)
- [Spring Security](https://docs.spring.io/spring-boot/3.4.1/reference/web/spring-security.html)
