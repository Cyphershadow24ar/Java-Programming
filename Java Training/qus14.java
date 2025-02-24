import java.util.Scanner;
public class qus14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of N: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1|| j== 1|| i==j|| j==n|| i==j|| i == j || (i+j) == n+1 || i==n){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
