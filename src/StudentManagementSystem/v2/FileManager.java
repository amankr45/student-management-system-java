package StudentManagementSystem.v2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileManager {

    public void saveStudentsToFile(HashMap<Integer,Student> studentHashMap){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Students.csv"))){
            for(Map.Entry<Integer,Student> studentEntry : studentHashMap.entrySet()) {
                Student student = studentEntry.getValue();

                bufferedWriter.write(
                    student.getStudentID() + "," +
                        student.getFirstName() + "," +
                        student.getLastName() + "," +
                        student.getStudentAge() + "," +
                        student.getCourseName()
                );
                bufferedWriter.newLine();
            }
            System.out.println("Students saved Successfully");
        }catch(IOException e){
            System.out.println("Error Saving Students");
        }
    }

    public HashMap<Integer,Student> loadStudentsFromFile(){
        HashMap<Integer,Student> studentHashMap = new HashMap<>();

        try(BufferedReader bufferedReader = new BufferedReader
                (new FileReader("Students.csv"))){

            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String firstName = data[1];
                String lastName = data[2];
                int age = Integer.parseInt(data[3]);
                String course = data[4];

                Student student = new Student(
                        id,firstName,lastName,age,course
                );

                studentHashMap.put(id,student);
            }
            System.out.println("Saved Students Information Loaded Successfully");
        }catch(IOException e){
            System.out.println("Error Loading Information from File");
        }
        return studentHashMap;
    }
}
