import java.util.Scanner;

public class qus34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Declare and initialize Scanner
        System.out.print("Enter your age: ");
        int age = sc.nextInt();  // Read user input
        sc.close();  // Close scanner to prevent resource leaks
        
        Person.canVote(age);  // Correct method call
    }
}

class Person {
    public static void canVote(int age) {
        if (age >= 18) {
            System.out.println("You can vote.");
        } else {
            System.out.println("You can't vote.");
        }
    }
}
