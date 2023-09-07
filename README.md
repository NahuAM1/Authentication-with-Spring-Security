# Autenticación con Spring Security y JWT

Este proyecto es una implementación de autenticación utilizando Spring Security y JSON Web Tokens (JWT).

## Descripción

La autenticación es un componente esencial de muchas aplicaciones web y sistemas. Este proyecto se centra en proporcionar una solución de autenticación segura y escalable utilizando Spring Security y JWT (JSON Web Tokens). Spring Security es un marco de seguridad ampliamente utilizado en aplicaciones Java y Spring, mientras que JWT es un estándar abierto que permite la autenticación y autorización seguras mediante tokens firmados.

## Contenido del paquete

El proyecto está organizado en varios paquetes que contienen diferentes clases y componentes relacionados con la autenticación:

- `com.example.authapp.entity`: Contiene las entidades de datos, incluyendo `Role` y `User`.

- `com.example.authapp.repository`: Contiene la interfaz `UserRepository` para acceder a los datos de usuario.

- `com.example.authapp.security.auth`: Contiene componentes relacionados con la autenticación, como `AuthController`, `AuthResponse`, `AuthService`, `LoginRequest` y `RegisterRequest`.

- `com.example.authapp.security.config`: Contiene la configuración de seguridad de la aplicación, incluyendo `ApplicationConfig` y `SecurityConfig`.

- `com.example.authapp.security.jwt`: Contiene componentes relacionados con JWT, como `JwtAuthenticationFilter` y `JwtService`.

- `com.example.authapp.AuthappApplication`: La clase principal que inicia la aplicación.

## Ejecución del proyecto

Para ejecutar este proyecto, sigue estos pasos:

1. Clona este repositorio en tu máquina local.

2. Configura la base de datos en `application.properties` con las credenciales apropiadas.

3. Ejecuta la aplicación utilizando tu entorno de desarrollo favorito o mediante la línea de comandos.

4. Accede a la aplicación a través de la URL y utiliza las rutas de autenticación proporcionadas en `AuthController` para probar la funcionalidad de autenticación y autorización.

## Contribuciones

¡Las contribuciones son bienvenidas! Si deseas contribuir a este proyecto, crea una bifurcación y envía una solicitud de extracción con tus cambios.

## Licencia

Este proyecto se distribuye bajo la licencia [MIT](LICENSE). Si utilizas este proyecto o su código, asegúrate de cumplir con los términos de la licencia.

---
# Authentication with Spring Security and JWT

This project is an implementation of authentication using Spring Security and JSON Web Tokens (JWT).

## Description

Authentication is a critical component of many web applications and systems. This project focuses on providing a secure and scalable authentication solution using Spring Security and JSON Web Tokens (JWT). Spring Security is a widely-used security framework in Java and Spring applications, while JWT is an open standard for secure authentication and authorization using signed tokens.

## Package Contents

The project is organized into various packages that contain different classes and components related to authentication:

- `com.example.authapp.entity`: Contains data entities, including `Role` and `User`.

- `com.example.authapp.repository`: Contains the `UserRepository` interface for accessing user data.

- `com.example.authapp.security.auth`: Contains authentication-related components such as `AuthController`, `AuthResponse`, `AuthService`, `LoginRequest`, and `RegisterRequest`.

- `com.example.authapp.security.config`: Contains application security configuration, including `ApplicationConfig` and `SecurityConfig`.

- `com.example.authapp.security.jwt`: Contains JWT-related components, such as `JwtAuthenticationFilter` and `JwtService`.

- `com.example.authapp.AuthappApplication`: The main class that initializes the application.

## Running the Project

To run this project, follow these steps:

1. Clone this repository to your local machine.

2. Configure the database in `application.properties` with the appropriate credentials.

3. Run the application using your favorite development environment or command line.

4. Access the application via the URL and use the authentication routes provided in `AuthController` to test authentication and authorization functionality.

## Contributions

Contributions are welcome! If you wish to contribute to this project, create a fork and submit a pull request with your changes.

## License

This project is distributed under the [MIT License](LICENSE). If you use this project or its code, make sure to comply with the terms of the license.

---
¡Gracias por utilizar nuestro proyecto de autenticación con Spring Security y JWT!

Thank you for using our Authentication with Spring Security and JWT project !
