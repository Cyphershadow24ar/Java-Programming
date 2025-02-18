/* WAP to create a method to create a method named 'multiply' and overload it such that- 
For 2 inputs, multiply of 2 numbers are done 
For 3 inputs, multiply of 3 numbers are done 
For other numbers, multiply them all 
For multiple parameters (more than 3, pass array to the method)  */

import java.util.Scanner;

class Mul {
    // Method for two numbers
    int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method for three numbers
    int multiply(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    // Method for an array of numbers
    int multiply(int arr[]) {
        int temp = 1;
        for (int i = 0; i < arr.length; i++) {  // Fixed loop
            temp *= arr[i];
        }
        return temp;
    }
}

public class problem2 { // Class name matches the filename
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mul obj = new Mul();
        
        System.out.println("Please enter first number: ");
        int a = scan.nextInt();
        System.out.println("Please enter second number: ");
        int b = scan.nextInt();
        System.out.println("Multiply 2 numbers: " + obj.multiply(a, b));

        System.out.println("Please enter third number: ");
        int c = scan.nextInt();
        System.out.println("Multiply 3 numbers: " + obj.multiply(a, b, c));

        System.out.println("Please enter the number of array elements: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        System.out.println("Multiply array elements: " + obj.multiply(arr));
        scan.close();
    }
}
