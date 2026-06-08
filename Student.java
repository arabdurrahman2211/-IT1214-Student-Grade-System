public class Student {
    private String studentId;
    private String studentName;
    private double marks;

    public Student(String studentId, String studentName, double marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getMarks() {
        return marks;
    }

    public void displayStudent() {
        System.out.println("ID: " + studentId + " | Name: " + studentName + " | Marks: " + marks);
    }
}