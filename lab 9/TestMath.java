import mathutils.MathOperations;
import java.util.Scanner;

class TestMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathOperations op = new MathOperations();

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();

        System.out.println("Square: " + op.square(n));
        System.out.println("Cube: " + op.cube(n));
        System.out.println("Square Root: " + op.squareRoot(n));
    }
}
