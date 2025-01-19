import java.util.Scanner;

public class Calculator
{
   	 public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter first number: ");
        	double num1 = sc.nextDouble();
        	System.out.print("Enter second number: ");
        	double num2 = sc.nextDouble();

        	double addition = num1 + num2;
        	double subtraction = num1 - num2;
        	double multiplication = num1 * num2;
        	double division;

        	if (num2 != 0) 
		{
            		division = num1 / num2;
        	} 
		else 
		{
            		System.out.println("Division by zero is not allowed!");
            		division = Double.NaN;
        	}
        	System.out.println("Addition: " + addition);
        	System.out.println("Subtraction: " + subtraction);
        	System.out.println("Multiplication: " + multiplication);
        	System.out.println("Division: " + division);
    	}
}
