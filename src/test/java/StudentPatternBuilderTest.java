import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

public class StudentPatternBuilderTest {
    private StudentController studentController = new StudentController();
    private final String root_path = "src/main/resources/students.json";
    private final String path = "src/main/resources/temp_students.json";

    @Test
    public void test_studentController() throws IOException {
        studentController.loadFromFile(root_path);
        Calendar birthday = Calendar.getInstance();
        birthday.set(1999, 5, 20);
        Student student = new Student.StudentBuilder()
                .setId(10)
                .setFirstName("abc")
                .setLastName("xyz")
                .setBirthday(birthday)
                .setClassName("Class 6")
                .setAddress("Hue Viet Nam")
                .build();
        studentController.add(student);
        ArrayList<Student> students = studentController.getAll();
        ArrayList<Student> students2 = studentController.findByName("Quang");
        ArrayList<Student> students3 = studentController.findByClassName("Class5");
        Student student1 = studentController.getById(2);
        studentController.delete(student);
        studentController.deleteAt(1);
        studentController.saveToFile(path);
    }
}