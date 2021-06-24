import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;

public class StudentPatternBuilderTest {
    private StudentController studentController = new StudentController();
    private final String path = "src/main/resources/students.json";

    @Test
    public void test_addStudent() throws IOException {
        Calendar birthday = Calendar.getInstance();
        birthday.set(1999, 1, 21);
        Student a = new Student.StudentBuilder()
                .setId(5)
                .setFirstName("Kim")
                .setLastName("Chon")
                .setBirthday(birthday)
                .setClassName("Class 5")
                .setAddress("Hoa Minh - Lien Chieu")
                .build();
        studentController.add(a);
        studentController.saveToFile(path);
    }
    @Test
    public void test_getFromFile() throws FileNotFoundException {
        studentController.loadFromFile(path);
        for (Student student:studentController.getAll()){
            System.out.println(student.getBirthday());
        }
    }
}