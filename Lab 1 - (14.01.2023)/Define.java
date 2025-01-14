public class Define {
    // Instance variables
    int a;
    float b;
    char c;
    boolean d;
    double e;
    long f;
    short g;

    public static void main(String[] args) {
        // Create a single object of the Define class
        Define obj = new Define();

        // Print default values of the instance variables
        System.out.println("Default value of int: " + obj.a);
        System.out.println("Default value of float: " + obj.b);
        System.out.println("Default value of char: [" + obj.c + "]");
        System.out.println("Default value of boolean: " + obj.d);
        System.out.println("Default value of double: " + obj.e);
        System.out.println("Default value of long: " + obj.f);
        System.out.println("Default value of short: " + obj.g);
    }
}
