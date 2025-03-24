import java.util.Scanner;

public class qus40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        sc.close();

        Print.table(n);
    }
}

class Print{
    public static void table(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
