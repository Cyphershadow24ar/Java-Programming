// Write a java program to print "N" prime numbers within the range of X (lower limit) and Y (upper limit). Prompt the values of X, Y, and N from the user. Ensure that the value Y is greater // than X and all the numbers are positive whole numbers. For any invalid input, ask for the input again.

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X, Y, N;

        // Prompt for valid input for X and Y
        while (true) {
            System.out.print("Enter the lower limit (X): ");
            X = sc.nextInt();
            System.out.print("Enter the upper limit (Y): ");
            Y = sc.nextInt();

            if (X > 0 && Y > 0 && Y > X) {
                break;
            } else {
                System.out.println("Invalid input. Ensure X > 0, Y > 0, and Y > X.");
            }
        }

        // Prompt for valid input for N
        while (true) {
            System.out.print("Enter the number of primes to display (N): ");
            N = sc.nextInt();

            if (N > 0) {
                break;
            } else {
                System.out.println("Invalid input. N must be a positive number.");
            }
        }

        System.out.println("The first " + N + " prime numbers in the range " + X + " to " + Y + " are:");
        int count = 0;

        // Find and print prime numbers in the range
        for (int i = X; i <= Y && count < N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        // If fewer primes are found
        if (count < N) {
            System.out.println("\nOnly " + count + " prime numbers found in the given range.");
        }

        sc.close();
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 1 is not a prime number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
