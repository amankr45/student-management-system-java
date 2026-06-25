# Student Management System

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
| V3 (JDBC + PostgreSQL) | 🚧 Planned  |
| V4 (Spring Boot)       | 🚧 Planned  |
| V5 (Docker)            | 🚧 Planned  |


## Version Comparison

| Feature        | V1        | V2                  |
|----------------|-----------|---------------------|
| Data Structure | ArrayList | HashMap             |
| Search         | O(n)      | O(1)                |
| Find by ID     | O(n)      | O(1)                |
| Delete         | O(n)      | O(1)                |
| Storage        | Text File | CSV File            |
| Sorting        | ArrayList | HashMap + ArrayList |


## V1 Screenshots
![Add Student.png](Screenshot/Add%20Student.png) 
![Deleted Student Detail.png](Screenshot/Deleted%20Student%20Detail.png)
![Search Student By ID.png](Screenshot/Search%20Student%20By%20ID.png)
![Updated Name.png](Screenshot/Updated%20Name.png)
![View Student.png](Screenshot/View%20Student.png)

## V2 Screenshots (HashMap Version)
![Sort By ID.png](Screenshot/Sort%20By%20ID.png)
![Sort By Name.png](Screenshot/Sort%20By%20Name.png)

## Features

- Add Student
- View Students
- Search Student
- Update Student
- Delete Student
- Validation
- File Handling

### Common Features
- Add Student
- View Students
- Find Student by ID
- Update Student
- Delete Student
- Validation

## V2 Improvements

- Migrated from `ArrayList<Student>` to `HashMap<Integer, Student>`
- Optimized Search Operation from **O(n)** to **O(1)**
- Optimized Delete Operation from **O(n)** to **O(1)**
- Optimized Find Operation from **O(n)** to **O(1)**
- CSV-based Persistent Storage
- Improved Update Module
- Sorting by Student ID
- Sorting by Student Name

## Technologies Used

* Java
* OOP (Object-Oriented Programming)
* Collections Framework
* Comparator
* ArrayList (v1)
* HashMap (v2)
* File Handling
* Text(.txt) Based File Handling (v1)
* CSV File Handling
* Exception Handling
* Git & GitHub

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
    └── v2
        ├── Application.java
        ├── Student.java
        ├── StudentManager.java
        ├── Validation.java
        └── FileManager.java
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

## Future Roadmap

- [x] V1 - ArrayList
- [x] V2 - HashMap + CSV
- [ ] V3 - JDBC + PostgreSQL
- [ ] V4 - Spring Boot REST API
- [ ] V5 - Docker Containerization

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
