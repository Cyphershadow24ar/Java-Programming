import java.util.Scanner;
class Sum // this code is for taking input from the user.
{
	public static void main(String args[])
	{
	int num1, num2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value = ");
	num1 = sc.nextInt();
	System.out.println("Enter a value = ");
	num2 = sc.nextInt();
	System.out.println("Value is = "+num1);
	System.out.println("Value is = "+num2);
	int sum = num1 + num2;
	System.out.println("Sum is = "+sum);
	}
}