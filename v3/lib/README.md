# Student Management System - V3

> **Version 3 of the Student Management System built using Core Java, JDBC, and PostgreSQL.**

This version migrates the Student Management System from **CSV file storage** to a **PostgreSQL database** using **JDBC**. It introduces a layered architecture with a dedicated **DAO (Data Access Object)** layer, making the application more scalable, maintainable, and closer to real-world backend applications.

---

# New Improvements over V2

* Replaced CSV file storage with PostgreSQL
* Implemented JDBC for database connectivity
* Introduced the DAO (Data Access Object) pattern
* Added SQL-based CRUD operations
* Used `PreparedStatement` for secure database queries
* Used `ResultSet` for retrieving database records
* Improved project architecture

---

# Features

* Add Student
* View All Students
* Search Student by ID
* Update Student Details
* Delete Student
* Sort Students by ID
* Sort Students by Name
* Total Student Count
* Input Validation
* Persistent Storage using PostgreSQL

---

# Technologies Used

## Programming Language

* Java 21

## Database

* PostgreSQL
* SQL

## Database Connectivity

* JDBC
* DriverManager
* Connection
* PreparedStatement
* ResultSet

## Design

* DAO Design Pattern
* Layered Architecture

## Other

* Exception Handling
* Git
* GitHub

---

# Project Structure

```text
v3/
│
├── Application.java
├── Student.java
├── StudentManager.java
├── StudentDAO.java
├── DatabaseConnection.java
├── Validation.java
└── SQL Scripts
```

---

# Architecture

```text
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
```

---

# Database Operations

This version performs all CRUD operations using SQL.

* INSERT
* SELECT
* UPDATE
* DELETE

All database interactions are performed using **PreparedStatement** to improve security and prevent SQL injection.

---

# Concepts Practiced

* JDBC API
* PostgreSQL
* SQL CRUD Operations
* PreparedStatement
* ResultSet
* DriverManager
* Database Connections
* DAO Design Pattern
* Layered Architecture
* Exception Handling

---

# How to Run

## 1. Create the PostgreSQL database

Create a database and the required `students` table.

## 2. Update database credentials

Modify the database configuration inside the project with your PostgreSQL credentials.

## 3. Compile the project

```bash
javac *.java
```

## 4. Run the application

```bash
java Application
```

Or open the project in IntelliJ IDEA and run the `Application` class.

---

# Screenshots

## Add Student

![Add Student Query.png](../../Screenshot/Add%20Student%20Query.png)
---

## Find Student by ID

![Find Student By Id Query.png](../../Screenshot/Find%20Student%20By%20Id%20Query.png)

---

## View All Students

![View Students Query.png](../../Screenshot/View%20Students%20Query.png)
---

## Update Student

![Update Student Details Query.png](../../Screenshot/Update%20Student%20Details%20Query.png)
---

## Delete Student
![Delete Student By Id Query.png](../../Screenshot/Delete%20Student%20By%20Id%20Query.png)

---

## Sort Students by ID

![Sort By Id Query.png](../../Screenshot/Sort%20By%20Id%20Query.png)

---

## Sort Students by Name
![Sort By Name Query.png](../../Screenshot/Sort%20By%20Name%20Query.png)

---

## Total Student Count

![Total Students Count Query.png](../../Screenshot/Total%20Students%20Count%20Query.png)
---

# Learning Outcomes

Through this version, I learned:

* How Java applications communicate with relational databases.
* How to establish database connections using JDBC.
* How to execute SQL queries from Java.
* How to use `PreparedStatement` for parameterized queries.
* How to retrieve data using `ResultSet`.
* How to organize database logic using the DAO Design Pattern.
* How to build a layered application architecture.

---

# Limitations

* Manual dependency management.
* Manual object creation.
* Manual database configuration.
* No Dependency Injection.
* No IoC Container.
* No Spring Framework.

These limitations are addressed in **V4**, where the project is migrated to the **Spring Framework** with **Dependency Injection**, **Spring JDBC**, and **externalized configuration**.
