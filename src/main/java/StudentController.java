import java.io.FileWriter;
import java.io.IOException;
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

    public ArrayList<Student> deleteStudent(int i) {
        students.remove(i);
        return students;
    }

    public void saveToFile(String path) {
        JSONArray studentJsonArray = new JSONArray();
        for (Student student : students) {
            JSONObject studentObject = new JSONObject();
            studentObject.put("id", student.getId());
            studentObject.put("firstname", student.getFirstName());
            studentObject.put("lastname", student.getLastName());
            studentObject.put("classname", student.getClassName());
//            studentObject.put("birthday", student.getLastName());
            studentObject.put("address", student.getAddress());
            studentJsonArray.add(studentObject);
        }
        try {
            FileWriter studentsJson = new FileWriter(path);
            studentsJson.write(studentJsonArray.toJSONString());
            studentsJson.flush();
        } catch (IOException e) {
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