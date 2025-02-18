// Write a program to print the area and circumference of a circle by creating a class.

class Circle {
    // Instance variable for radius
    private double radius;
    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;}
    // Method to calculate the area
    public double area() {
        return Math.PI * radius * radius;}
    // Method to calculate the circumference
    public double circum() {
        return 2 * Math.PI * radius;}
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.printf("Area: %.2f%n", circle.area());
        System.out.printf("Circumference: %.2f%n", circle.circum());
    }
}
