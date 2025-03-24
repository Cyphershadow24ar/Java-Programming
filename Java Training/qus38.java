public class qus38 {
    public static void main(String[] args) {
        Find f = new Find();
        f.big(10,30,60);
    }
}

class Find{
    public void big(int a, int b, int c){
        if(a >b)
            if(a > c)
                System.out.println("A is Biggest.");
            else
                System.out.println("C is Biggest.");
        else
            if(b > c)
                System.out.println("B is Biggest.");
            else
                System.out.println("C is Biggest.");
    }
}
