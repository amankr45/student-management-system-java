# Student Management System

> **A Java backend learning project that evolves from Core Java to Spring Framework through four progressively improved versions of the same application.**

This repository demonstrates my learning journey by continuously improving the same **Student Management System** instead of creating separate projects for every new technology. Each version introduces new concepts while improving the architecture, maintainability, and scalability of the application.

---

# Project Evolution

| Version | Focus                          | Technologies                                | Status      |
|---------|--------------------------------|---------------------------------------------|-------------|
| **V1**  | Core Java Fundamentals         | Java, OOP, ArrayList                        | ✅ Completed |
| **V2**  | Collections & File Persistence | HashMap, CSV File Handling                  | ✅ Completed |
| **V3**  | Database Integration           | JDBC, PostgreSQL                            | ✅ Completed |
| **V4**  | Spring Framework               | Spring Core, Spring JDBC, PostgreSQL, Maven | ✅ Completed |

---

# Technologies Used

## Core Java

* Java 21
* Object-Oriented Programming (OOP)
* Collections Framework
* Exception Handling
* File Handling

## Database

* JDBC
* PostgreSQL
* SQL
* Prepared Statements

## Spring Framework

* Spring Core
* Dependency Injection (DI)
* Inversion of Control (IoC)
* Java Configuration
* Component Scanning
* Spring JDBC
* JdbcTemplate
* Externalized Configuration

## Build Tool

* Maven

## Version Control

* Git
* GitHub

---

# Repository Structure


```text
StudentManagementSystem/
│
├── README.md
├── .gitignore
├── Screenshot/
│
├── v1/
│   ├── README.md
│   ├── students.txt
│   └── src/
│       └── StudentManagementSystem/
│           └── v1/
│               ├── Application.java
│               ├── Student.java
│               ├── StudentManager.java
│               ├── Validation.java
│               └── FileManager.java
│
├── v2/
│   ├── README.md
│   ├── Students.csv
│   └── src/
│       └── StudentManagementSystem/
│           └── v2/
│               ├── Application.java
│               ├── Student.java
│               ├── StudentManager.java
│               ├── Validation.java
│               └── FileManager.java
│
├── v3/
│   ├── README.md
│   ├── lib/
│   │   └── postgresql-42.7.11.jar
│   └── src/
│       └── StudentManagementSystem/
│           └── v3/
│               ├── Application.java
│               ├── DatabaseConnection.java
│               ├── StudentDAO.java
│               ├── StudentManager.java
│               ├── Student.java
│               ├── Validation.java
│               └── ConnectionTest.java
│
└── v4/
    ├── README.md
    ├── pom.xml
    ├── .mvn/
    └── src/
        └── main/
            ├── java/
            │   └── com/
            │       └── aman/
            │           └── studentmanagementsystem/
            │               ├── config/
            │               ├── console/
            │               ├── constants/
            │               ├── dao/
            │               ├── exception/
            │               ├── model/
            │               ├── service/
            │               └── StudentManagementSystemApplication.java
            │
            └── resources/
                └── database.properties
```

---

# Learning Progress

Throughout this project I learned:

* Core Java
* Object-Oriented Programming
* Collections Framework
* ArrayList
* HashMap
* File Handling
* Exception Handling
* JDBC
* PostgreSQL
* SQL CRUD Operations
* DAO Design Pattern
* Layered Architecture
* Maven
* Spring Core
* Dependency Injection
* Inversion of Control (IoC)
* Spring JDBC
* Externalized Configuration

---

# Version Highlights

## V1

* Built a menu-driven Student Management System using Core Java.
* Used `ArrayList` for in-memory data storage.
* Implemented CRUD operations and file persistence.

## V2

* Replaced `ArrayList` with `HashMap` for faster lookups.
* Added CSV file storage.
* Improved project structure and performance.

## V3

* Migrated persistence from files to PostgreSQL.
* Implemented JDBC for database connectivity.
* Introduced the DAO (Data Access Object) pattern.

## V4

* Migrated the project to Spring Framework.
* Implemented Dependency Injection using the Spring IoC Container.
* Replaced manual JDBC code with Spring `JdbcTemplate`.
* Externalized database configuration using properties files.
* Followed a layered architecture using Service, DAO, Configuration, and Console components.

---

# Screenshots

Each version contains its own screenshots and documentation inside its respective directory.

---

# How to Run

Navigate to the required version directory and follow the instructions provided in its `README.md`.

For **V4**:

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass=com.aman.studentmanagementsystem.StudentManagementSystemApplication
```

---

# Repository Goal

The objective of this repository is to demonstrate the gradual evolution of a backend application while learning modern Java development practices.

Instead of building multiple unrelated projects, the same application is continuously improved to understand how software evolves as new technologies are introduced.

---

# Author

**Aman Kumar**
