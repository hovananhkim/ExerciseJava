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
            student.setId(this.id);
            student.setFirstName(this.firstName);
            student.setLastName(this.lastName);
            student.setClassName(this.className);
            student.setBirthday(this.birthday);
            student.setAddress(this.address);
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

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}