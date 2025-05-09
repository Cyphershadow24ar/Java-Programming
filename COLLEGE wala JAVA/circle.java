public class circle {
    public static void main(String[] args) {
        double radius =8;
        double pi = 3.14159;
        double area = pi * radius * radius; // area of circle
        double circumference = 2 * pi * radius; // circumference of circle
        double diameter = 2 * radius; // diameter of circle

        System.out.println("Area of circle: " + area);
        System.out.println("Circumference of circle: " + circumference);
        System.out.println("Diameter of circle: " + diameter);
    }
}
