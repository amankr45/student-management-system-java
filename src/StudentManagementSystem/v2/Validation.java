package StudentManagementSystem.v2;

public class Validation {

    public boolean validateID(int id){
        return id > 0;
    }

    public boolean validateName(String name){
        if(name == null || name.trim().isEmpty()){
            return false;
        }
        return name.matches("[a-zA-Z]+");
    }

    public boolean validateAge(int age){
        return age > 0 && age <= 120;
    }

    public boolean validateCourseName(String course){
        return course != null && !course.trim().isEmpty();
    }
}
