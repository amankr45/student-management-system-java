package StudentManagementSystem.v3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

    public void addStudent(Student student) {
        String sql = """
                INSERT INTO students 
                (student_id,first_name,last_name,age,course_name)
                VALUES(?, ?, ?, ?, ?);
                """;
        try(Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ){
            preparedStatement.setInt(1,student.getStudentID());
            preparedStatement.setString(2,student.getFirstName());
            preparedStatement.setString(3,student.getLastName());
            preparedStatement.setInt(4,student.getStudentAge());
            preparedStatement.setString(5,student.getCourseName());

            int rowAffected = preparedStatement.executeUpdate();
            if(rowAffected > 0){
                System.out.println("Student Details Added Successfully to Database");
            }
        }catch (SQLException e) {
            if ("23505".equals(e.getSQLState())) {
                System.out.println("Student ID already exists");
            } else {
                System.out.println(e.getMessage());
            }
        }
    }

    public Student findStudentById(int id){
        String sql = """
                SELECT * FROM students WHERE student_id = ?;
                """;
        try(Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ){
            preparedStatement.setInt(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                int studentId =  resultSet.getInt("student_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                int age = resultSet.getInt("age");
                String courseName = resultSet.getString("course_name");

                return new Student(studentId,firstName,lastName,age,courseName);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void viewStudents(){
        String sql = """
                SELECT * FROM students;
                """;
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ){
            ResultSet resultSet = preparedStatement.executeQuery();
            boolean found = false;
            while(resultSet.next()){
                found = true;
                int studentId = resultSet.getInt("student_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                int age = resultSet.getInt("age");
                String courseName = resultSet.getString("course_name");

                Student student = new Student(studentId,firstName,lastName,age,courseName);
                System.out.println(student);
                System.out.println("-------------------------------");
            }

            if(!found){
                System.out.println("No Students Found");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void updateStudent(Student student){
        String sql = """
                UPDATE students 
                SET first_name = ?,
                last_name = ?,
                age = ?,
                course_name = ?
                WHERE student_id = ?;
                """;
        try(Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ){

            preparedStatement.setString(1,student.getFirstName());
            preparedStatement.setString(2,student.getLastName());
            preparedStatement.setInt(3,student.getStudentAge());
            preparedStatement.setString(4,student.getCourseName());
            preparedStatement.setInt(5,student.getStudentID());

            int rowsAffected = preparedStatement.executeUpdate();
            if(rowsAffected > 0){
                System.out.println("Student Details are Updated");
            }else{
                System.out.println("Student Details are not Updated");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void deleteStudentById(int id){
        String sql = """
                DELETE FROM students WHERE student_id = ?;
                """;
        try(Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ){
            preparedStatement.setInt(1,id);

            int rowAffected = preparedStatement.executeUpdate();
            if(rowAffected > 0){
                System.out.println("Student Details Deleted");
            }else{
                System.out.println("Student Not Found");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public int getTotalStudents(){
        String sql = """
                SELECT COUNT(*) AS total_students FROM students;
                """;
        try(Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ){
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return resultSet.getInt("total_students");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public void sortById(){
        String sql = """
                SELECT * FROM students ORDER BY student_id ASC;
                """;
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ){
            ResultSet resultSet = preparedStatement.executeQuery();
            boolean found = false;
            while(resultSet.next()){
                found = true;
                int studentId = resultSet.getInt("student_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                int age = resultSet.getInt("age");
                String courseName = resultSet.getString("course_name");

                Student student = new Student(studentId,firstName,lastName,age,courseName);
                System.out.println(student);
                System.out.println("-------------------------------");
            }

            if(!found){
                System.out.println("No Students Found");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void sortByName(){
        String sql = """
                SELECT * FROM students ORDER BY first_name ASC;
                """;
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ){
            ResultSet resultSet = preparedStatement.executeQuery();
            boolean found = false;
            while(resultSet.next()){
                found = true;
                int studentId = resultSet.getInt("student_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                int age = resultSet.getInt("age");
                String courseName = resultSet.getString("course_name");

                Student student = new Student(studentId,firstName,lastName,age,courseName);
                System.out.println(student);
                System.out.println("-------------------------------");
            }

            if(!found){
                System.out.println("No Students Found");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
