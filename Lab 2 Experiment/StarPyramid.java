import java.util.Scanner;

class StarPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of levels: ");
        int levels = scanner.nextInt();

        for (int i = 1; i <= levels; i++) {
            // Print spaces for alignment
            for (int j = levels - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars with spaces
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
