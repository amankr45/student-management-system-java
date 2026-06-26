# Student Management System

> **Each version builds upon the previous one to demonstrate the evolution from Core 
> Java collections to enterprise backend development using industry-standard 
> technologies.**

> This project demonstrates the evolution of a Student Management
> System from basic Java collections to enterprise-level
> backend development.

A console-based Student Management System developed in Core Java. 
This project is being progressively evolved from basic 
Java collections to enterprise-level backend development 
using JDBC, Spring Boot, PostgreSQL, and Docker.

## Current Status

| Version                | Status      |
|------------------------|-------------|
| V1 (ArrayList)         | ✅ Completed |
| V2 (HashMap + CSV)     | ✅ Completed |
| V3 (JDBC + PostgreSQL) | ✅ Completed |
| V4 (Spring Boot)       | 🚧 Planned  |
| V5 (Docker)            | 🚧 Planned  |


## Version Comparison Table

| Feature            | V1        | V2       | V3                  |
|--------------------|-----------|----------|---------------------|
| Data Structure     | ArrayList | HashMap  | PostgreSQL Database |
| Search             | O(n)      | O(1)     | SQL Query           |
| Find by ID         | O(n)      | O(1)     | SQL Query           |
| Delete             | O(n)      | O(1)     | SQL Query           |
| Persistent Storage | Text File | CSV File | PostgreSQL          |
| JDBC               | ❌         | ❌        | ✅                   |
| DAO Layer          | ❌         | ❌        | ✅                   |


## Project Evolution

| Version | Major Improvement     |
|---------|-----------------------|
| V1      | Core Java + ArrayList |
| V2      | HashMap + CSV         |
| V3      | JDBC + PostgreSQL     |
| V4      | Spring Boot           |
| V5      | Docker                |

## V1 Screenshots
![Add Student.png](Screenshot/Add%20Student.png) 
![Deleted Student Detail.png](Screenshot/Deleted%20Student%20Detail.png)
![Search Student By ID.png](Screenshot/Search%20Student%20By%20ID.png)
![Updated Name.png](Screenshot/Updated%20Name.png)
![View Student.png](Screenshot/View%20Student.png)

## V2 Screenshots (HashMap Version)
![Sort By ID.png](Screenshot/Sort%20By%20ID.png)
![Sort By Name.png](Screenshot/Sort%20By%20Name.png)

## V3 Screenshots (JDBC + PostgreSQL)
![Add Student Query.png](Screenshot/Add%20Student%20Query.png) 
![Delete Student By Id Query.png](Screenshot/Delete%20Student%20By%20Id%20Query.png)
![Find Student By Id Query.png](Screenshot/Find%20Student%20By%20Id%20Query.png)
![Update Student Details Query.png](Screenshot/Update%20Student%20Details%20Query.png)
![View Students Query.png](Screenshot/View%20Students%20Query.png)
![Total Students Count Query.png](Screenshot/Total%20Students%20Count%20Query.png)
![Sort By Id Query.png](Screenshot/Sort%20By%20Id%20Query.png)
![Sort By Name Query.png](Screenshot/Sort%20By%20Name%20Query.png)

## Features

### Common Features

- Add Student
- View Students
- Find Student by ID
- Update Student
- Delete Student
- Validation
- Sort by ID
- Sort by Name
- Total Student Count

### V1

- ArrayList
- Text File Storage

### V2

- HashMap
- CSV File Storage

### V3

- PostgreSQL Database Integration
- JDBC-based Persistence
- SQL CRUD Operations
- DAO Layer
- PreparedStatement
- ResultSet
- Database Connection

## Technologies Used

- Java
- OOP
- Collections Framework
- ArrayList 
- HashMap 
- JDBC
- PostgreSQL
- SQL
- File Handling
- CSV File Handling
- Exception Handling
- Git & GitHub

## Project Structure

```text

src/
└── StudentManagementSystem
    ├── v1
    │   ├── Application.java
    │   ├── Student.java
    │   ├── StudentManager.java
    │   ├── Validation.java
    │   └── FileManager.java
    │
    ├── v2
    │   ├── Application.java
    │   ├── Student.java
    │   ├── StudentManager.java
    │   ├── Validation.java
    │   └── FileManager.java
    │
    └── v3
        ├── Application.java
        ├── Student.java
        ├── StudentManager.java
        ├── StudentDAO.java
        ├── DatabaseConnection.java
        └── Validation.java
```

## Version Evolution

### V1

- Data Structure: ArrayList
- Time Complexity (Search): O(n)
- Storage: Text File

### V2

- Data Structure: HashMap
- Time Complexity (Search): O(1)
- Storage: CSV File
- Better Project Architecture
 

### V3

- Database: PostgreSQL
- Persistence: JDBC
- DAO Layer
- SQL CRUD Operations
- PreparedStatement
- ResultSet

## Future Roadmap

- [x] V1 - ArrayList
- [x] V2 - HashMap + CSV
- [x] V3 - JDBC + PostgreSQL
- [ ] V4 - Spring Boot REST API
- [ ] V5 - Docker Containerization


## Architecture Evolution

```text
V1
-----------------
Application
     │
     ▼
StudentManager
     │
     ▼
ArrayList
-----------------


V2
-----------------
Application
     │
     ▼
StudentManager
     │
     ▼
HashMap
     │
     ▼
CSV File
-----------------


V3
-----------------
Application
     │
     ▼
StudentManager
     │
     ▼
StudentDAO
     │
     ▼
JDBC
     │
     ▼
PostgreSQL
----------------
```

## What I Learned

### V1

- OOP
- Collections
- ArrayList
- File Handling

### V2

- HashMap
- CSV Handling
- Comparator
- Better Project Architecture
- CRUD Optimization
- HashMap Performance
- Time Complexity Optimization

### V3

- JDBC
- PostgreSQL
- SQL
- PreparedStatement
- ResultSet
- CRUD Operations using SQL
- DAO Design Pattern
- Database Connectivity

## Design Evolution

V1 focused on learning Core Java collections using ArrayList.

V2 improved the architecture by replacing ArrayList with HashMap and introduced CSV-based persistence.

V3 migrated the application from file-based storage to PostgreSQL using JDBC and introduced a dedicated DAO layer for database access.

Future versions will evolve this project into a Spring Boot REST API and finally a Dockerized application.