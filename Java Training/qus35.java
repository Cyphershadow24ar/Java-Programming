import java.util.InputMismatchException;
import java.util.Scanner;
public class qus35{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("enter two numbers = ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print("enter operator = ");
            char op = sc.next().charAt(0);
            switch(op){
                case '+':
                System.out.print("sum = " + (a+b));
                break;
                case '-':
                System.out.print("diff = " + (a-b));
                break;
                case '*':
                System.out.print("product = " + (a*b));
                break;
                case '/':
                System.out.print("division = " +(a/b));
                break;
            }}
            catch (InputMismatchException e){
                System.out.println("Wrong input");
            }
            catch (ArithmeticException e1){
                System.out.println("Division by zero not possible");
            }
            sc.close();
    }
}