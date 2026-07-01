package com.aman.studentmanagementsystem.console;

import org.springframework.stereotype.Component;

@Component
public class MenuPrinter {
    public void printMenu() {
        System.out.println("""
=========================================
      Student Management System
=========================================

1. Add Student
2. Get Student By ID
3. View All Students
4. Update Student
5. Delete Student
6. Exit

""");

    }
}
