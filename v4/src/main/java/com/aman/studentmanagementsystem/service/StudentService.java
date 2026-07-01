package com.aman.studentmanagementsystem.service;

import com.aman.studentmanagementsystem.dao.StudentDAO;
import com.aman.studentmanagementsystem.exception.InvalidStudentException;
import com.aman.studentmanagementsystem.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentDAO studentDAO;

    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public int saveStudent(Student student) {
        validateStudent(student);
        return studentDAO.saveStudent(student);
    }

    public Student getStudentById(int studentId) {
        return studentDAO.getStudentById(studentId);
    }

    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    public int updateStudent(Student student) {
        validateStudent(student);
        return studentDAO.updateStudent(student);
    }

    public int deleteStudent(int studentId) {
        return studentDAO.deleteStudent(studentId);
    }

    private void validateStudent(Student student) {

        if (student.getStudentId() <= 0) {
            throw new InvalidStudentException(
                    "Student ID must be greater than zero."
            );
        }

        if (student.getFirstName() == null ||
                student.getFirstName().trim().isEmpty()) {

            throw new InvalidStudentException(
                    "First Name cannot be empty."
            );
        }

        if (student.getLastName() == null ||
                student.getLastName().trim().isEmpty()) {

            throw new InvalidStudentException(
                    "Last Name cannot be empty."
            );
        }

        if (student.getAge() < 16 ||
                student.getAge() > 100) {

            throw new InvalidStudentException(
                    "Age must be between 16 and 100."
            );
        }

        if (student.getCourseName() == null ||
                student.getCourseName().trim().isEmpty()) {

            throw new InvalidStudentException(
                    "Course Name cannot be empty."
            );
        }
    }
}