# Student Management System - V2

> **Version 2 of the Student Management System built using Core Java, HashMap, and CSV file persistence.**

This version improves upon **V1** by replacing the `ArrayList` with a `HashMap` for faster student lookups and introducing **CSV file storage** for persistent data management. The project architecture is also improved to make the code more modular and maintainable.

---

# New Improvements over V1

* Replaced `ArrayList` with `HashMap`
* Faster search using Student ID
* CSV file persistence
* Improved project structure
* Better CRUD performance
* Sorting by Student ID
* Sorting by Student Name
* Total Student Count

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
* Save Student Data to CSV File
* Load Student Data from CSV File

---

# Technologies Used

* Java 21
* Object-Oriented Programming (OOP)
* Collections Framework
* HashMap
* Comparator
* CSV File Handling
* Exception Handling

---

# Project Structure

```text
v2/
│
├── Application.java
├── Student.java
├── StudentManager.java
├── Validation.java
├── FileManager.java
└── students.csv
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
 HashMap
     │
     ▼
FileManager
     │
     ▼
 students.csv
```

---

# Concepts Practiced

* HashMap
* Key-Value Data Storage
* Collections Framework
* Comparator
* Sorting
* CSV File Handling
* CRUD Operations
* Exception Handling
* Better Code Organization

---

# Performance Improvements

| Operation    | V1 (ArrayList) | V2 (HashMap) |
| ------------ | -------------- | ------------ |
| Search by ID | O(n)           | O(1)         |
| Update by ID | O(n)           | O(1)         |
| Delete by ID | O(n)           | O(1)         |

---

# How to Run

Compile the project:

```bash
javac *.java
```

Run the application:

```bash
java Application
```

Or open the project in IntelliJ IDEA and run the `Application` class.

---

# Screenshots

## Sort Students by ID

![Sort By ID](../Screenshot/Sort%20By%20ID.png)

---

## Sort Students by Name

![Sort By Name](../Screenshot/Sort%20By%20Name.png)

---

# Learning Outcomes

Through this version, I learned:

* How `HashMap` improves search performance.
* The difference between sequential and key-based data access.
* How to store structured data using CSV files.
* How to sort objects using `Comparator`.
* How to improve project organization as an application grows.

---

# Limitations

* Data is still stored in files.
* File I/O becomes inefficient as the dataset grows.
* No relational database support.
* No SQL queries.
* No JDBC.

These limitations are addressed in the next version by migrating the application to **PostgreSQL** using **JDBC**.
