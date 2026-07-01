package com.aman.studentmanagementsystem.dao;

import com.aman.studentmanagementsystem.exception.DuplicateStudentException;
import com.aman.studentmanagementsystem.exception.StudentNotFoundException;
import com.aman.studentmanagementsystem.model.Student;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAO {

    private static final String INSERT_STUDENT = """
            INSERT INTO students (
                student_id,
                first_name,
                last_name,
                age,
                course_name
            )
            VALUES (?, ?, ?, ?, ?)
            """;

    private static final String GET_STUDENT_BY_ID = """
            SELECT
                student_id,
                first_name,
                last_name,
                age,
                course_name
            FROM students
            WHERE student_id = ?
            """;

    private static final String GET_ALL_STUDENTS = """
            SELECT
                student_id,
                first_name,
                last_name,
                age,
                course_name
            FROM students
            """;

    private static final String UPDATE_STUDENT = """
            UPDATE students
            SET
                first_name = ?,
                last_name = ?,
                age = ?,
                course_name = ?
            WHERE student_id = ?
            """;

    private static final String DELETE_STUDENT = """
            DELETE FROM students
            WHERE student_id = ?
            """;

    private final JdbcTemplate jdbcTemplate;

    private final RowMapper<Student> studentRowMapper = (rs, rowNum) -> {
        Student student = new Student();

        student.setStudentId(rs.getInt("student_id"));
        student.setFirstName(rs.getString("first_name"));
        student.setLastName(rs.getString("last_name"));
        student.setAge(rs.getInt("age"));
        student.setCourseName(rs.getString("course_name"));

        return student;
    };

    public StudentDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveStudent(Student student) {
        try {
            return jdbcTemplate.update(
                    INSERT_STUDENT,
                    student.getStudentId(),
                    student.getFirstName(),
                    student.getLastName(),
                    student.getAge(),
                    student.getCourseName()
            );
        } catch (DuplicateKeyException e) {
            throw new DuplicateStudentException(
                    "Student with ID " + student.getStudentId() + " already exists."
            );
        }
    }

    public Student getStudentById(int studentId) {
        try {
            return jdbcTemplate.queryForObject(
                    GET_STUDENT_BY_ID,
                    studentRowMapper,
                    studentId
            );
        } catch (EmptyResultDataAccessException e) {
            throw new StudentNotFoundException(
                    "Student with ID " + studentId + " not found."
            );
        }
    }

    public List<Student> getAllStudents() {
        return jdbcTemplate.query(
                GET_ALL_STUDENTS,
                studentRowMapper
        );
    }

    public int updateStudent(Student student) {
        try {
            int affectedRows = jdbcTemplate.update(
                    UPDATE_STUDENT,
                    student.getFirstName(),
                    student.getLastName(),
                    student.getAge(),
                    student.getCourseName(),
                    student.getStudentId()
            );

            if (affectedRows == 0) {
                throw new StudentNotFoundException(
                        "Student with ID " + student.getStudentId() + " not found."
                );
            }

            return affectedRows;

        } catch (DuplicateKeyException e) {
            throw new DuplicateStudentException("Duplicate Student ID.");
        }
    }

    public int deleteStudent(int studentId) {

        int affectedRows = jdbcTemplate.update(
                DELETE_STUDENT,
                studentId
        );

        if (affectedRows == 0) {
            throw new StudentNotFoundException(
                    "Student with ID " + studentId + " not found."
            );
        }

        return affectedRows;
    }
}