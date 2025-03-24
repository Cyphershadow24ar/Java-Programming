import java.util.Scanner;

public class qus37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Correct Scanner declaration
        System.out.print("Enter the value: ");
        char ch = sc.next().charAt(0);  // Correct `char` data type
        sc.close();  // Close scanner to prevent memory leaks
        
        Check.isAlphaNumeric(ch);  // Corrected method call
    }
}

class Check {
    public static void isAlphaNumeric(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Number");
        } else {
            System.out.println("Special Character");
        }
    }
}
