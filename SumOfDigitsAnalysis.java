import java.util.Scanner;

class SumOfDigitsAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = sumOfDigits(number);

        System.out.println("Sum is: " + sum);
        System.out.println("Prime: " + (isPrime(sum) ? "Y" : "N"));
        System.out.println("Armstrong: " + (isArmstrong(sum) ? "Y" : "N"));
        System.out.println("Perfect: " + (isPerfect(sum) ? "Y" : "N"));

        scanner.close();
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isArmstrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        return sum == n;
    }

    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }
}
