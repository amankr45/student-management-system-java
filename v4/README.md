# Student Management System - V4

> **Version 4 of the Student Management System built using Spring Framework, Spring JDBC, PostgreSQL, and Maven.**

This version represents the final evolution of the Student Management System in this repository. The application is migrated from manual object creation and plain JDBC to the **Spring Framework**, using **Dependency Injection**, **Spring IoC Container**, and **Spring JDBC** to build a cleaner, more maintainable, and layered application.

Unlike the previous versions, object creation and dependency management are handled by the Spring IoC Container, significantly reducing boilerplate code and improving the overall architecture.

---

# New Improvements over V3

* Migrated from plain JDBC to Spring JDBC
* Introduced the Spring IoC Container
* Implemented Dependency Injection
* Replaced manual object creation with Spring-managed beans
* Added Java-based Spring configuration
* Externalized database configuration using properties files
* Integrated Maven for dependency management and project build
* Improved layered architecture

---

# Features

* Add Student
* Get Student by ID
* View All Students
* Update Student
* Delete Student
* Input Validation
* Exception Handling
* PostgreSQL Database Integration
* Spring-managed Components
* Externalized Database Configuration

---

# Technologies Used

## Programming Language

* Java 21

## Framework

* Spring Framework
* Spring Core
* Spring JDBC

## Database

* PostgreSQL
* SQL

## Build Tool

* Maven

## Spring Concepts

* IoC (Inversion of Control)
* Dependency Injection
* Constructor Injection
* Java Configuration
* Component Scanning
* Bean Management
* JdbcTemplate
* DataSource
* PropertySource
* Environment

## Other

* Layered Architecture
* DAO Design Pattern
* Exception Handling
* Git
* GitHub

---

# Project Structure

```text
v4/
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── aman
│   │   │           └── studentmanagementsystem
│   │   │               ├── config
│   │   │               ├── console
│   │   │               ├── constants
│   │   │               ├── dao
│   │   │               ├── exception
│   │   │               ├── model
│   │   │               ├── service
│   │   │               └── StudentManagementSystemApplication.java
│   │   │
│   │   └── resources
│   │       └── database.properties
│   │
│   └── test
│
└── pom.xml
```

---

# Architecture

```text
StudentManagementSystemApplication
                │
                ▼
        Spring IoC Container
                │
                ▼
      ConsoleApplication
                │
                ▼
        StudentService
                │
                ▼
          StudentDAO
                │
                ▼
         JdbcTemplate
                │
                ▼
          PostgreSQL
```

---

# Spring Concepts Practiced

* Spring IoC Container
* Dependency Injection
* Constructor Injection
* Java-based Configuration
* `@Configuration`
* `@Bean`
* `@Component`
* `@Service`
* `@Repository`
* `@ComponentScan`
* `JdbcTemplate`
* `DataSource`
* `@PropertySource`
* `Environment`

---

# How to Run

## 1. Create the PostgreSQL database

Create the database and required `students` table.

## 2. Configure database connection

Update the values in:

```text
src/main/resources/database.properties
```

Example:

```properties
db.driver=org.postgresql.Driver
db.url=jdbc:postgresql://localhost:5434/student_management_system
db.username=your_username
db.password=your_password
```

## 3. Build the project

```bash
mvn clean compile
```

## 4. Run the application

```bash
mvn exec:java -Dexec.mainClass=com.aman.studentmanagementsystem.StudentManagementSystemApplication
```

---

# Screenshots

Add screenshots of:

* Main Menu
* Add Student
* Get Student by ID
* View All Students
* Update Student
* Delete Student

---

# Learning Outcomes

Through this version, I learned:

* Spring Framework fundamentals
* Spring IoC Container
* Dependency Injection
* Constructor Injection
* Spring Bean Management
* Java-based Configuration
* Spring JDBC
* JdbcTemplate
* DataSource Configuration
* Externalized Configuration
* Maven Project Structure
* Layered Architecture
* Clean Separation of Concerns

---

# Key Takeaways

This version demonstrates the transition from traditional Java application development to the Spring Framework.

Major improvements include:

* Automatic dependency management through the Spring IoC Container.
* Cleaner and more maintainable architecture.
* Reduced boilerplate JDBC code using `JdbcTemplate`.
* Externalized configuration using properties files.
* Maven-based dependency and build management.

This version serves as a solid foundation for learning Spring Boot and building enterprise Java applications.
