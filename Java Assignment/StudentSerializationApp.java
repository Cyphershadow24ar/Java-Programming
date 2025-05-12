import java.io.*;
import java.util.Scanner;

// Serializable Student class
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private transient String password; // Not serialized

    public Student(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", password='" + password + "'}";
    }
}

// Main class
public class StudentSerializationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "student.ser";

        System.out.println("Choose an option:");
        System.out.println("1. Serialize Student");
        System.out.println("2. Deserialize Student");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                // Serialization
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                System.out.print("Enter student age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // consume newline
                System.out.print("Enter student password: ");
                String password = scanner.nextLine();

                Student student = new Student(name, age, password);

                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
                    oos.writeObject(student);
                    System.out.println("Student has been serialized to " + filename);
                } catch (IOException e) {
                    System.out.println("Serialization failed: " + e.getMessage());
                }
                break;

            case 2:
                // Deserialization
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
                    Student deserializedStudent = (Student) ois.readObject();
                    System.out.println("Deserialized Student:");
                    System.out.println(deserializedStudent);
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("Deserialization failed: " + e.getMessage());
                }
                break;

            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}
