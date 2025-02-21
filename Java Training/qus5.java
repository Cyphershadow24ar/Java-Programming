import java.util.Scanner;
public class qus5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number you want to check: ");
        int num = sc.nextInt();
        if(num > 0){
            if(num % 2==0){
                System.out.println("The number is positive and even");
            }
            else{
                System.out.println("The number is positive and odd");
            }
        }
        else{
            System.out.println("The number is Not positive.");
        }
    }
}
