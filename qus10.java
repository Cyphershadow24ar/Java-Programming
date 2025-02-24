public class qus10 {
    public static void main(String[] args) {
        while (true) {
            for (int i = 1; i <= 7; i++) {  // Fix outer loop variable (i)
                for (int j = 1; j <= 7; j++) {  // Fix inner loop variable (j)
                    if ((i == j && i <= 4) || (i + j == 8 && i <= 4) || (j == 4 && i >= 4 && i <= 7)) {
                        System.out.print("+");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(); // Move to the next line after printing a row
            }
            break; // Remove infinite loop unless required
        }
    }
}
