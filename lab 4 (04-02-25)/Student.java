// 6: Create a class Student with attributes name, rollNumber, subject [], and
// totalMarks.
// Write methods to calculate total marks and grade the student based on
// their performance (e.g., O, E, A, B, C, etc.).
// Create multiple Student objects and print out their marks and grades
// secured

public class Student {
    private String name;
    private int rollNumber;
    private String[] subject;
    private int totalMarks;

    public Student(String name, int rollNumber, String[] subject, int totalMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subject = subject;
        this.totalMarks = totalMarks;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Total Marks: " + this.totalMarks);
        System.out.println("Grade: " + this.calculateGrade());
    }

    public String calculateGrade() {
        if (this.totalMarks >= 90) {
            return "O";
        } else if (this.totalMarks >= 80) {
            return "E";
        } else if (this.totalMarks >= 70) {
            return "A";
        } else if (this.totalMarks >= 60) {
            return "B";
        } else if (this.totalMarks >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        String[] subjects = { "Maths", "Science", "English", "History", "Geography" };
        Student student1 = new Student("John Doe", 1, subjects, 450);
        student1.displayDetails();

        Student student2 = new Student("Jane Doe", 2, subjects, 350);
        student2.displayDetails();
    }
}