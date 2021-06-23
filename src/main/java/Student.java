import java.util.Calendar;

public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private Calendar birthDay;
    private String className;
    private String address;

    public static class StudentBuilder {
        private long id;
        private String firstName;
        private String lastName;
        private Calendar birthDay;
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

        public StudentBuilder setBirthDay(Calendar birthDay) {
            this.birthDay = birthDay;
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
            student.birthDay = this.birthDay;
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

    public Calendar getBirthDay() {
        return birthDay;
    }

    public String getClassName() {
        return className;
    }

    public String getAddress() {
        return address;
    }
}