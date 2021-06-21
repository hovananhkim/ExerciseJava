import java.util.Date;

public class Student {
    private int Id;
    private String firstName;
    private String lastName;
    private Date birthDay;
//    private Class className;
    private String address;
    public static class StudentBuilder{
        private int Id;
        private String firstName;
        private String lastName;

        public void setId(int id) {
            Id = id;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setBirthDay(Date birthDay) {
            this.birthDay = birthDay;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        private Date birthDay;
        //    private Class className;
        private String address;

    }
}
