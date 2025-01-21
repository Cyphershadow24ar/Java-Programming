import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        int num1, num2; 
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first number");
        num1 = sc.nextInt();

        System.out.println("Enter second number");
        num2 = sc.nextInt();

        System.out.println("Before Swapping: " + num1 + ", " + num2);

        // Swapping logic
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swapping: " + num1 + ", " + num2);

        sc.close(); // Close the Scanner to avoid resource leaks
    }
}


