import java.util.Scanner;
public class qus9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the table No.: ");
            int n = sc.nextInt();
            for(int i = 1; i <= 10; i++){
                System.out.println(n + " x " + i + " = " + n*i);
            }
            System.out.println("Do you want to continue? (Y/N)");
            char ch = sc.next().charAt(0);
            if(ch == 'N'){
                break;
            }
        }
    }  
}
