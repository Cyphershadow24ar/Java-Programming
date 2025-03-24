import java.util.Scanner;

public class qus44 {
    public static void main(String[] args) {1
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine(); // Allow full name

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Fee: ");
        double fee = sc.nextDouble();

        sc.close(); // Close Scanner after all inputs

        // Calling methods
        Display.show(id, name, course, fee);
        Display.studetails(name, course, fee);
    }
}

class Display {
    public static void show(int id, String name, String course, double fee) {
        System.out.println("\nStudent Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Fee: " + fee);
    }

    public static void studetails(String name, String course, double fee) {
        System.out.println("\nStudent Course Details:");
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Fee: " + fee);
    }
}


