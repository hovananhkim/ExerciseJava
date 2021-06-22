import sun.util.calendar.BaseCalendar;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Student a = new Student.StudentBuilder()
                .setId(1)
                .setFirstName("Kim")
                .setLastName("Ho")
                .setClassName("Class 1")
                .setAddress("Hoa Minh - Lien Chieu")
                .build();
        StudentController studentController = new StudentController();
        studentController.addStudent(a);
        String path = "src/main/resources/students.json";
        studentController.saveToFile(path);
    }
}