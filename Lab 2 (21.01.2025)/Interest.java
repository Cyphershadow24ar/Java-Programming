// Write a java program to find the accrued interest and final amount received for a savings scheme. Consider the values for the initial principal amount, // rate of interest, time, etc. from the user.

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal, rate, time, accruedInterest, finalAmount;

        // Input validation loop
        while (true) {
            System.out.print("Enter the Principal Amount: ");
            principal = sc.nextDouble();
            System.out.print("Enter the Annual Interest Rate (in %): ");
            rate = sc.nextDouble();
	    rate = rate/100;
            System.out.print("Enter the Time (in years): ");
            time = sc.nextDouble();

            if (principal > 0 && rate > 0 && time > 0) {
                break;
            } else {
                System.out.println("Invalid input. Please enter positive values.");
            }
        }

        // Accrued Interest Calculation
        accruedInterest = (principal * (rate/365) * time);

        // Final Amount Calculation
        finalAmount = principal + accruedInterest;

        // Display Results
        System.out.println("Accrued Interest: " + accruedInterest);
        System.out.println("Final Amount Received: " + finalAmount);

        sc.close(); // Close the scanner
    }
}

