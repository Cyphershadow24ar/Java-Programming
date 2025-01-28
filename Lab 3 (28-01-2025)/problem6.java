// Write a program to check if two arrays are equal-meaning their length, order, and elements are the same.abstract 
// Example: 
// arr=[10,20,30,40,50,60,70,105]
// arr1=[10,20,30,40,50,60,70,105]
// EQUAL

import java.util.Scanner;

public class problem6 {

    // Function to check if two arrays are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        // Check if lengths are equal
        if (arr1.length != arr2.length) {
            return false;
        }

        // Check if elements are equal in order
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        // If all checks passed, the arrays are equal
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size and elements of the first array
        System.out.print("Enter the size of the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input size and elements of the second array
        System.out.print("Enter the size of the second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Check if the arrays are equal
        if (areArraysEqual(arr1, arr2)) {
            System.out.println("The arrays are EQUAL.");
        } else {
            System.out.println("The arrays are NOT EQUAL.");
        }

        scanner.close();
    }
}

