// Base class: Animal
class Animal {
    // Constructor of Animal class
    public Animal() {
        System.out.println("Animal constructor called.");
    }
}

// Intermediate class: Mammal (inherits from Animal)
class Mammal extends Animal {
    // Constructor of Mammal class
    public Mammal() {
        // Implicitly calls super() (Animal constructor)
        System.out.println("Mammal constructor called.");
    }
}

// Derived class: Dog (inherits from Mammal)
class Dog extends Mammal {
    // Constructor of Dog class
    public Dog() {
        // Implicitly calls super() (Mammal constructor, which calls Animal constructor)
        System.out.println("Dog constructor called.");
    }
}

// Main class (must match filename problem5.java)
public class problem5 {
    public static void main(String[] args) {
        // Creating a Dog object, which will call constructors in the inheritance chain
        Dog myDog = new Dog();
    }
}
