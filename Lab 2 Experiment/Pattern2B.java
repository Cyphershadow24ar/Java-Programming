// Write a program to print the following patterns:
// ABCDE
// ABCD
// ABC
// AB
// A

import java.util.Scanner;

public class Pattern2B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for columns
                System.out.print((char) ('A' + j - 1)); // Convert to character and print
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close(); // Close the scanner
    }
}
