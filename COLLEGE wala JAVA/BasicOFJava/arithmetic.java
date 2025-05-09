public class arithmetic {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println(x+y); 
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println((float)x/y); // typecasting

        int a = 5, b = 8, z = 9;
        System.out.println("The value of a is: "+a);
        // System.out.println(a);
        System.out.println("The value of b is: "+b);
        // System.out.println(b);
        z = 10;
        System.out.println("The value of z is: "+z);
        //System.out.println(z);
        System.out.println(z+a+b);
        System.out.println("New exciting thing !"+z+a+b); // here it will print the value of z+x+y as a string. -> 1053
        System.out.println("New exciting thing !"+(z+a+b)); // here it will print the value of z+x+y as a integer. -> 23
        System.out.println(a+b+""+z); // here it will print the value of a+b as a string and then z as a string. -> 1310
        
    }
}
