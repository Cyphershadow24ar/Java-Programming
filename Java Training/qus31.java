public class qus31 {
    public static void main(String[] args) {
        First f = new First();
        f.fun();
        Second s = new Second();
        s.fun();
    }
}

class First{
    public void fun() {
        System.out.println("Hello First Fun");
    }
}

class Second{
    public void fun() {
        System.out.println("Hello Second Fun");
    }
}