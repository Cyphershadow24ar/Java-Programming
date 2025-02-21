import java.util.Scanner;
public class qus6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double num = sc.nextDouble();
        
        if(num >= 0  && num <= 9){
            System.out.println("It's a single digit number");
        }
        else if(num > 11 && num < 99){
            System.out.println("It's a double digit number");
        }
        else if(num > 100 && num < 999){
            System.out.println("It's a triple digit number");
        }
        else{
            System.out.println("The number is greater then 3 digit.");
        }
    }
}
