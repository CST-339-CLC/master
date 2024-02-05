# EMS (Event Management System) - Registration module

This is a Spring Boot application that provides a user registration module. It uses Thymeleaf for dynamic page
generation, Spring MVC for handling HTTP requests, and JPA for object-relational mapping.

## Project Structure

The project has the following structure:

```
EMS
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   ├── gcu
│   │   │   │   │   ├── controller
│   │   │   │   │   │   └── UserController.java
│   │   │   │   │   ├── model
│   │   │   │   │   │   └── User.java
│   │   │   │   │   └── Application.java
│   │   ├── resources
│   │   │   ├── templates
│   │   │   │   └── registration.html
│   │   │   ├── application.properties
│   │   │   └── static
│   │   │       ├── css
│   │   │       └── js
├── pom.xml
└── README.md
```

## Setup

To run this project, you need to have Java and Maven installed on your machine.

1. Clone the repository.
2. Navigate to the project directory.
3. Run `mvn spring-boot:run` to start the application.

The application will start on the default port 8080. You can access the registration page
at `http://localhost:8080/registration`.

## Features

- User registration: Users can register by providing their first name, last name, email address, phone number, and login
  credentials.
- Data validation: The application validates the user input both on the client-side (using HTML5 and JavaScript) and on
  the server-side (using Spring's validation framework).
- Responsive design: The registration page is responsive and accessible on various devices.

## Technologies

- Spring Boot
- Spring MVC
- Thymeleaf
- JPA
- HTML5
- CSS
- JavaScript

For more details, please refer to the individual files in the project.
