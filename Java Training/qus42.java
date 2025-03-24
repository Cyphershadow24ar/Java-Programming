import java.util.Scanner;

public class qus42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for three numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        sc.close();

        // Calling the method and storing the result
        int largest = Find.nig(a, b, c);

        // Printing the largest number
        System.out.println("The largest number is: " + largest);
    }
}

class Find {
    public static int nig(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("A is the biggest.");
            return a;
        } else if (b >= a && b >= c) {
            System.out.println("B is the biggest.");
            return b;
        } else {
            System.out.println("C is the biggest.");
            return c;
        }
    }
}
