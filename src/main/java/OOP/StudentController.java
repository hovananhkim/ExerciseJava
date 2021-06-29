package OOP;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class StudentController {
    private HashMap<Long, Student> map = new HashMap<>();

    public void add(Student student) {
        map.put(student.getId(), student);
    }

    public void delete(Student student) {
        map.remove(student.getId(), student);
    }

    public void deleteAt(long index) {
        map.remove(index);
    }

    public void saveToFile(String path) throws IOException {
        String json = new Gson().toJson(map);
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(json);
        fileWriter.flush();
    }

    public void loadFromFile(String path) throws FileNotFoundException {
        FileReader fileReader = new FileReader(path);
        String json = new Scanner(fileReader).useDelimiter("\\Z").next();
        HashMap<Long, Student> students = new Gson().fromJson(json, new TypeToken<HashMap<Long, Student>>() {
        }.getType());
        this.map.clear();
        this.map.putAll(students);
    }

    public ArrayList<Student> getAll() {
        ArrayList<Student> students = new ArrayList<>();
        for (Student student : map.values()) {
            students.add(student);
        }
        return students;
    }

    public Student getById(long id) {
        return map.get(id);
    }

    public ArrayList<Student> findByName(String firstName) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : map.values()) {
            if (student.getFirstName().equals(firstName)) {
                result.add(student);
            }
        }
        return result;
    }

    public ArrayList<Student> findByClassName(String className) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : map.values()) {
            if (student.getClassName().equals(className)) {
                result.add(student);
            }
        }
        return result;
    }
}