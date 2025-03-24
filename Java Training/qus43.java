import java.util.Scanner;

public class qus43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Correct Scanner initialization

        // Taking user input
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        System.out.print("Enter Name: ");
        String name = sc.nextLine(); // Allow full name input

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        sc.close(); // Close scanner after reading all inputs

        // Calling the display method
        Display.display(id, name, salary);
    }
}

class Display {
    public static void display(int id, String name, double salary) {
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
