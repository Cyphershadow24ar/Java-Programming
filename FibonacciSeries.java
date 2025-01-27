import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();

        if (terms < 0) {
            System.out.println("Number of terms cannot be negative.");
        } else if (terms == 0) {
            System.out.println("No terms to display.");
        } else {
            System.out.println("Non-Recursive Fibonacci:");
            nonRecursiveFibonacci(terms);

            System.out.println("\nRecursive Fibonacci:");
            for (int i = 0; i < terms; i++) {
                System.out.print(recursiveFibonacci(i) + " ");
            }
        }

        scanner.close();
    }
    static void nonRecursiveFibonacci(int terms) {
        int a = 0, b = 1;
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
    static int recursiveFibonacci(int n) {
        if (n <= 1) return n;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
}
