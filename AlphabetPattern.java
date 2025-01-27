import java.util.Scanner;

class AlphabetPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of levels: ");
        int levels = scanner.nextInt();

        for (int i = 0; i < levels; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
