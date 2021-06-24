import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private Calendar birthday;
    private String className;
    private String address;

    public static class StudentBuilder {
        private long id;
        private String firstName;
        private String lastName;
        private Calendar birthday;
        private String className;
        private String address;

        public StudentBuilder setId(long id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder setBirthday(Calendar birthday) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            this.birthday = birthday;
            return this;
        }

        public StudentBuilder setClassName(String className) {
            this.className = className;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            Student student = new Student();
            student.id = this.id;
            student.firstName = this.firstName;
            student.lastName = this.lastName;
            student.className = this.className;
            student.birthday = this.birthday;
            student.address = this.address;
            return student;
        }
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public String getClassName() {
        return className;
    }

    public String getAddress() {
        return address;
    }
}