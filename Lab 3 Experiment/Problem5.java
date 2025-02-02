// Write a program to find the minimum product of any two elements in an array.

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
    public static int findMinProduct(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements!");
            return Integer.MAX_VALUE;
        }

        Arrays.sort(arr); // Sort array

        // Minimum product is either from the two smallest numbers or two largest negative numbers
        int minProduct = Math.min(arr[0] * arr[1], arr[arr.length - 1] * arr[arr.length - 2]);

        return minProduct;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find and print minimum product
        int minProduct = findMinProduct(arr);
        System.out.println("Minimum product of any two elements: " + minProduct);

        scanner.close();
    }
}

