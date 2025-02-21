public class qus8 {
    public static void main(String[] args){
        int c;
        int n = 10;
        int a = 0 ;
        int b = 1;
        System.out.print(a + " " + b);
        for(int i = 3; i<=n; i++){
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
