// Write a program to find the minimum and maximum within all the elements of an array.

public class problem2 {

    // Function to find the minimum and maximum in an array
    public static void findMinAndMax(int[] arr) {
        // Initialize min and max with the first element of the array
        int min = arr[0];
        int max = arr[0];

        // Traverse the array to find the minimum and maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print the results
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }

    // Main method
    public static void main(String[] args) {
        // Example array
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array elements:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Find and display the minimum and maximum
        findMinAndMax(array);
    }
}

