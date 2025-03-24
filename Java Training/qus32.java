public class qus32 {
    public static void main(String[] args) {
        add.nums(10, 20);  // Call method with two arguments
    }
}

class add {
    public static void nums(int a, int b) {  // Accept two parameters
        int c = a + b;
        System.out.println("Sum = " + c);  // Correct variable name (lowercase 'c')
    }
}
