public class Student {
    String firstName;
    String lastName;
    int StudentID;


    public Student(String firstName, String lastName, int StudentID) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.StudentID = StudentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", studentID=" + StudentID + "]";
    }
}

