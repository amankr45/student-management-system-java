package StudentManagementSystem.v1;

import java.util.ArrayList;
import java.io.*;
import java.util.Comparator;

public class StudentManager {
   private final ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {

        if (isDuplicateId(student.getStudentID())) {
            System.out.println("Student ID Already Exists");
            return;
        }

        if (!validation.validateId(student.getStudentID())) {
            System.out.println("Invalid Student ID");
            return;
        }

        if (!validation.validateName(student.getFirstName())) {
            System.out.println("Invalid First Name");
            return;
        }

        if (!validation.validateName(student.getLastName())) {
            System.out.println("Invalid Last Name");
            return;
        }

        if (!validation.validateAge(student.getStudentAge())) {
            System.out.println("Invalid Age");
            return;
        }

        if (!validation.validateCourse(student.getCourseName())) {
            System.out.println("Invalid Course Name");
            return;
        }

        students.add(student);
        System.out.println("Student details added Successfully");
    }

    public void viewStudents(){
        if(students.isEmpty()){
            System.out.println("No Students Found");
            return;
        }

        for(Student student : students){
            System.out.println(student);
            System.out.println("-----------------------------------------");
        }
    }

    public void searchStudentByID(int id){
        for(Student student : students){
            if(student.getStudentID() == id){
                System.out.println("Student Found");
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    public void deleteStudentByID(int id){
        for(int i=0; i<students.size(); i++){
            if(students.get(i).getStudentID() == id){
                students.remove(i);
                System.out.println("Successfully deleted Student details");
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    private final Validation validation = new Validation();
    private boolean isDuplicateId(int id) {
        for (Student student : students) {
            if (student.getStudentID() == id) {
                return true;
            }
        }
        return false;
    }

    private final FileManager fileManager = new FileManager();
    public void saveStudents(){
        System.out.println("Student Count : " + students.size());
        fileManager.saveStudentsToFile(students);
    }

    public void loadStudents(){
        students.clear();
        students.addAll(fileManager.loadStudentsFromFile());
    }

    public int getTotalStudents(){
        return students.size();
    }

    public Student findStudentById(int id){
        for(Student student : students){
            if(student.getStudentID() == id){
                return student;
            }
        }
        return null;
    }

    public void sortStudentsById (){
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getStudentID() - o2.getStudentID();
            }
        });
        System.out.println("Students Sorted By ID Successfully");
    }

    public void sortStudentsName(){
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
            }
        });
        System.out.println("Students Name is Sorted Successfully");
    }
}
