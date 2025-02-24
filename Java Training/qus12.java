import java.util.Scanner;

public class qus12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of : ");
        int n = sc.nextInt();
        int i,j;

        for(i=1; i<=n;i++){
            for(j =1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
