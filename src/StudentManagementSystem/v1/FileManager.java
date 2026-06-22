package StudentManagementSystem.v1;

import java.io.*;
import java.util.ArrayList;

public class FileManager {

    public void saveStudentsToFile(ArrayList<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {
            for (Student student : students) {
                writer.write(
                        student.getStudentID() + "," +
                                student.getFirstName() + "," +
                                student.getLastName() + "," +
                                student.getStudentAge() + "," +
                                student.getCourseName()
                );
                writer.newLine();
            }
            System.out.println("Students Saved Successfully");
        } catch (IOException e) {
            System.out.println("Error Saving Students");
        }
    }

    public ArrayList<Student> loadStudentsFromFile() {
        ArrayList<Student> loadedStudents = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader
                (new FileReader("students.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String firstName = data[1];
                String lastName = data[2];
                int age = Integer.parseInt(data[3]);
                String course = data[4];

                Student student = new Student(id,firstName,lastName,age,course);
                loadedStudents.add(student);
            }
            System.out.println("Saved Students Information Loaded Successfully");
        } catch (IOException e) {
            System.out.println("Error Loading of Students Information");
        }
        return loadedStudents;
    }
}
