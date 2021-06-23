import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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

    @SuppressWarnings("unchecked")
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

    @SuppressWarnings("unchecked")
    public void loadFromFile(String path) {
        JSONParser jsonParser = new JSONParser();
        try (FileReader fileReader = new FileReader(path)) {
            Object obj = jsonParser.parse(fileReader);
            JSONArray studentJsonArray = (JSONArray) obj;
//            studentJsonArray.forEach(student ->parseStudentObject((JSONObject) student));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
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
    private void parseStudentObject(JSONObject studentJsonObject){
        Student student = new Student.StudentBuilder()
                .setId((Integer) studentJsonObject.get("id"))
                .setFirstName((String) studentJsonObject.get("firstname"))
                .build();
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