import arithmetic.Operations;

class Example implements Arithmetic2 {
    public double square_root(int x) {
        return Math.sqrt(x);
    }

    public int cube(int x) {
        return x * x * x;
    }

    public static void main(String[] args) {
        Example e = new Example();
        Operations op = new Operations();

        System.out.println("Add: " + op.add(5, 3));
        System.out.println("Subtract: " + op.subtract(10, 4));
        System.out.println("Square Root: " + e.square_root(49));
        System.out.println("Cube: " + e.cube(3));
    }
}

interface Arithmetic2 {
    double square_root(int x);
    int cube(int x);
}


