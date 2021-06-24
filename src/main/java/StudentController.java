import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class StudentController {
    private ArrayList<Student> students = new ArrayList<>();

    public void add(Student student) {
        students.add(student);
    }

    public void delete(Student student) {
        students.remove(student);
    }

    public void deleteAt(int index) {
        students.remove(index);
    }

    public void saveToFile(String path) throws IOException {
        String json = new Gson().toJson(students);
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(json);
        fileWriter.flush();
    }

    public void loadFromFile(String path) throws FileNotFoundException {
        FileReader fileReader = new FileReader(path);
        String json = new Scanner(fileReader).useDelimiter("\\Z").next();
        ArrayList<Student> students = new Gson().fromJson(json, new TypeToken<ArrayList<Student>>() {
        }.getType());
        this.students.clear();
        this.students.addAll(students);
    }

    public ArrayList<Student> getAll(){
        return students;
    }

    public Student getById(long id) {
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