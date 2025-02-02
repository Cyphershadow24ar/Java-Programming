// Write a program to move all the zeros of an array to the end of the array.

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;

        // Traverse the array, moving non-zero elements forward
        for (int num : arr) {
            if (num != 0) {
                arr[nonZeroIndex++] = num;
            }
        }

        // Fill remaining positions with zeros
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
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

        // Move zeros to end
        moveZerosToEnd(arr);

        // Print result
        System.out.println("Array after moving zeros to end: " + Arrays.toString(arr));

        scanner.close();
    }
}

