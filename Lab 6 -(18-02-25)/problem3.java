// Q3
// Shape is the super class for square and rectangle. Write a program to find areas of square
// and rectangle by inheriting shape.
// Method-find_Area() should be declared in shape. Parameters could be changed as per
// needed.


// Parent class
abstract class Shape {
    // Abstract method to find the area
    abstract double find_Area();
}

// Subclass for Square
class Square extends Shape {
    private double side;

    // Constructor
    Square(double side) {
        this.side = side;
    }

    // Overriding the find_Area method
    @Override
    double find_Area() {
        return side * side;
    }
}

// Subclass for Rectangle
class Rectangle extends Shape {
    private double length, width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the find_Area method
    @Override
    double find_Area() {
        return length * width;
    }
}

// Main class
public class problem3 {
    public static void main(String[] args) {
        // Creating a square object
        Square square = new Square(5);
        System.out.println("The Area of Square shape: " + square.find_Area());

        // Creating a rectangle object
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("The Area of Rectangle shape: " + rectangle.find_Area());
    }
}
