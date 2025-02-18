// 4: Create a class named shape. Create two objects of shape and calculate the
// area and perimeter.

public class Shape {
    private double length;
    private double breadth;

    public Shape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void displayDetails() {
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
        System.out.println("Area: " + this.length * this.breadth);
        System.out.println("Perimeter: " + 2 * (this.length + this.breadth));
    }

    public static void main(String[] args) {
        Shape shape1 = new Shape(10, 20);
        shape1.displayDetails();

        Shape shape2 = new Shape(5, 10);
        shape2.displayDetails();
    }
}