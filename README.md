# Landing-page
Productividad basada en herramientas tecnológicas
 # Proyecto de Landing Page

## Descripción
Este proyecto consiste en una **Landing Page** para una empresa de fletes. Su objetivo es proporcionar una plataforma sencilla para que los usuarios contacten a la empresa y soliciten cotizaciones.

La aplicación está construida utilizando **Spring Boot**, **Thymeleaf**, **H2 Database** y **Spring Data JPA** para gestionar el almacenamiento de contactos. El propósito de la aplicación es permitir que los clientes contacten a la empresa para obtener más información sobre los servicios de fletes.

## Problema Identificado
La empresa de fletes carecía de una plataforma en línea que permitiera a los clientes contactar de manera eficiente. Los clientes necesitaban una forma simple de dejar sus datos y recibir información sobre los servicios disponibles.

## Solución
Se desarrolló una aplicación web con una landing page que incluye un formulario de contacto. Los datos ingresados por los usuarios se almacenan en una base de datos en memoria H2. La aplicación también expone un servicio REST para manejar los contactos y mostrar la información ingresada a través de un backend eficiente utilizando **Spring Boot** y **Spring Data JPA**.

## Arquitectura
La arquitectura de la aplicación se basa en los siguientes componentes:
- **Spring Boot**: Framework utilizado para desarrollar la aplicación.
- **H2 Database**: Base de datos en memoria utilizada para almacenar los contactos.
- **Spring Data JPA**: administración de datos y comunicación con la base de datos.
- **Thymeleaf**: Motor de plantillas utilizado para la interfaz de usuario.
- **RestController**: Permite la interacción con la API REST para gestionar los contactos.

## Tabla de Contenidos
- [Descripción](#descripción)
- [Problema Identificado](#problema-identificado)
- [Solución](#solución)
- [Arquitectura](#arquitectura)
- [Requerimientos](#requerimientos)
- [Instalación](#instalación)
- [Configuración](#configuración)
- [Uso](#uso)
- [Contribución](#contribución)
- [Roadmap](#roadmap)

## Requerimientos
- **Java 17** o superior
- **Spring Boot** 2.7.5
- **H2 Database** (base de datos en memoria)
- **Maven** para la gestión de dependencias

### Paquetes Adicionales
- **Spring Boot Starter Web**
- **Spring Boot Starter Data JPA**
- **Spring Boot Starter Thymeleaf**
- **H2 Database**

## Instalación

### Cómo instalar el ambiente de desarrollo
1. Clona este repositorio:
   ```bash
   git clone https://github.com/diego2u/Landing-page.git


Ejecuta el siguiente comando para instalar las dependencias con Maven:

mvn clean install

## ¿Cómo ejecutar pruebas manualmente?

mvn test

## ¿Cómo implementar la solución en producción en un ambiente local o en la nube como Heroku?

mvn spring-boot:run

## Configuración

### Configuración del producto (archivos de configuración)
- **`application.properties`**: Configuración de la base de datos, puerto del servidor y otros parámetros de la aplicación.

### Configuración de los requerimientos
- **Java 17 o superior**.
- **Maven 3.6.3 o superior**.

### Configuración de la base de datos ###
La base de datos está configurada para usar H2 en memoria:
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password

## Uso 

### Sección de referencia para usuario final
El usuario puede acceder a la **landing page** a través de la URL proporcionada (local o en producción). Puede llenar el formulario de contacto con su nombre, correo electrónico y mensaje, y los datos se almacenarán en la base de datos.

### Sección de referencia para usuario administrador
El administrador puede ver los contactos almacenados en la base de datos accediendo a la consola **H2** en **`http://localhost:8081/h2-console`** y utilizando las credenciales:
- **Usuario**: `sa`
- **Contraseña**: `password`

## Contribución

Si deseas contribuir a este proyecto, sigue estos pasos:

1. Clona el repositorio:
  
   git clone https://github.com/Diego2u/Landing-page.git

2. Crea un nuevo branch para tu funcionalidad:
git checkout -b nueva-funcionalidad

3. Realiza los cambios y haz un commit

## Roadmap

- Finalizar el desarrollo del formulario y el front-end
- Agregar validaciones adicionales en el formulario de contacto.
- Implementar un sistema de autenticación de usuarios.
- Desplegar la aplicación en producción en **Heroku** o **AWS**