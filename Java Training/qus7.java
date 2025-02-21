import java.util.Scanner;

public class qus7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;

        // Finding the sum of proper divisors (excluding num itself)
        for (int i = 1; i < num; i++) {  
            if (num % i == 0) {
                sum += i;  
            }
        }

        // Checking if the sum of divisors equals the number
        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
        
        sc.close();
    }
}
