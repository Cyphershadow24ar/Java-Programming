import java.util.Scanner;

public class qus3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.println("Enter the third Number: ");
        double c = sc.nextDouble();

        double sum = (a + b + c)/3;
        System.out.println("The average of "+a+","+b+","+c+" is "+sum);
    }
}
