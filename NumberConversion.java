import java.util.Scanner;

class NumberConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Binary: " + toBinary(number));
        System.out.println("Hexadecimal: " + toHexadecimal(number));

        scanner.close();
    }

    static String toBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2);
            n /= 2;
        }
        return binary.toString();
    }

    static String toHexadecimal(int n) {
        StringBuilder hex = new StringBuilder();
        char[] hexChars = "0123456789ABCDEF".toCharArray();
        while (n > 0) {
            hex.insert(0, hexChars[n % 16]);
            n /= 16;
        }
        return hex.toString();
    }
}
