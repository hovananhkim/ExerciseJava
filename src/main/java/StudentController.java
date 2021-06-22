import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class StudentController {
    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> addStudent(Student student) {
        students.add(student);
        return students;
    }

    public ArrayList<Student> deleteStudent(Student student) {
        students.remove(student);
        return students;
    }
    private static FileWriter file;
    public void saveToFile(String path){
        JSONArray studentList = new JSONArray();
        for (Student student:students){
            System.out.println(student.getId());
            JSONObject studentObject = new JSONObject();
            studentObject.put("id",student.getId());
            studentObject.put("firstname",student.getFirstName());
            studentList.add(studentObject);
        }
        try {
            System.out.println(System.getProperty("user.dir"));
           file = new FileWriter(System.getProperty("user.dir")+"/students.json");
            System.out.println(studentList.toJSONString());
           file.write(studentList.toJSONString());
           file.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Student getById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public ArrayList<Student> findByName(String firstName) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getFirstName().equals(firstName)) {
                result.add(student);
            }
        }
        return result;
    }

    public ArrayList<Student> findByClassName(String className) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getClassName().equals(className)) {
                result.add(student);
            }
        }
        return result;
    }
}