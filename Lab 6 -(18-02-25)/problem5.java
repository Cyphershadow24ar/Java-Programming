// Problem5
// A class 'shape' contains a method 'about'. Its subclass 'circle' also has method 'about' but different body. Is it possible to create an object of a circle but give its reference as shape? Demonstrate via example and provide suitable output.

// Superclass (Parent class)
class Shape {
    void about() {
        System.out.println("This is a generic shape.");
    }
}

// Subclass (Child class)
class Circle extends Shape {
    @Override
    void about() {
        System.out.println("This is a circle with a specific radius.");
    }
}

// Main class to demonstrate polymorphism
public class problem5 {
    public static void main(String[] args) {
        // Creating an object of Circle, but assigning it to a Shape reference
        Shape myShape = new Circle();
        
        // Calling the method (Runtime Polymorphism)
        myShape.about();  // Output: "This is a circle with a specific radius."
    }
}
