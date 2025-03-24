import java.util.Scanner;

public class qus39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        sc.close();

        Check.isEven(n); // Call the method to check even or odd
    }
}

class Check {
    public static void isEven(int n) {
        if (n % 2 == 0) {
            System.out.println("The Number is Even.");
        } else {
            System.out.println("The Number is Odd.");
        }
    }
}
