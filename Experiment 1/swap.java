import java.util.Scanner;

public class swap {
    public static void main(String args[]) {
        // Swapping 2 numbers using 3 variables 
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        num1 = sc.nextInt();

        System.out.print("Enter Number 2: ");
        num2 = sc.nextInt();

        System.out.println("Before swapping: "+ num1 + ", " + num2);

        // Using a temporary variable to swap
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping Numbers: " + num1 + ", " + num2);
    }
}
