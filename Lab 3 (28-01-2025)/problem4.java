// Write a program to sum the marks secured in 5 subjects and display the secured grade.
// Using the marks of 5 subjects find total marks secured and display the grade using the following condition.
// 1. O-(400-500)
// 2. E-(300-400)
// 3. A-(250-300)
// 4. B-(200-250)
// 5. F-(0-199)

// Marks of all subjects must be within 0-100.
// Must display proper message for any invalid input. 

import java.util.Scanner;

public class problem4 {

    // Function to calculate the grade
    public static String calculateGrade(int totalMarks) {
        if (totalMarks >= 400 && totalMarks <= 500) {
            return "O";
        } else if (totalMarks >= 300 && totalMarks < 400) {
            return "E";
        } else if (totalMarks >= 250 && totalMarks < 300) {
            return "A";
        } else if (totalMarks >= 200 && totalMarks < 250) {
            return "B";
        } else if (totalMarks >= 0 && totalMarks < 200) {
            return "F";
        } else {
            return "Invalid Total Marks";
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int totalMarks = 0;

        System.out.println("Enter marks for 5 subjects (0-100):");

        // Input marks for 5 subjects
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            int mark = scanner.nextInt();

            // Check for valid input
            if (mark < 0 || mark > 100) {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
                return;
            }

            marks[i] = mark;
            totalMarks += mark;
        }

        // Display total marks
        System.out.println("Total Marks Secured: " + totalMarks);

        // Calculate and display grade
        String grade = calculateGrade(totalMarks);
        System.out.println("Secured Grade: " + grade);

        scanner.close();
    }
}

