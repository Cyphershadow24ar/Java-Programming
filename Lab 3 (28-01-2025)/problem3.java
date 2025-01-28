// Write a program to find a particular elements with an array.

import java.util.Scanner;

public class problem3 {

    // Function to search for an element in an array
    public static void findElement(int[] arr, int target) {
        boolean found = false;

        // Traverse the array to find the target
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element " + target + " found at index: " + i);
                found = true;
                break; // Exit the loop once the element is found
            }
        }

        // If the element is not found
        if (!found) {
            System.out.println("Element " + target + " is not present in the array.");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Example array
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        // Print the array elements
        System.out.println("Array elements:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Get the element to search for from the user
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the element to search for: ");
        int target = Scanner.nextInt();

        // Search for the element in the array
        findElement(array, target);
        
        Scanner.close();
    }
}
