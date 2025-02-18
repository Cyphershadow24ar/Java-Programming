// Base class: Animal
class Animal {
    String name;

    // Constructor for Animal
    public Animal(String name) {
        this.name = name;
    }

    // Method to display general info
    void displayInfo() {
        System.out.println("Name: " + name);
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Intermediate class: Mammal (inherits from Animal)
class Mammal extends Animal {
    boolean hasFur;

    // Constructor for Mammal
    public Mammal(String name, boolean hasFur) {
        super(name); // Calling Animal class constructor
        this.hasFur = hasFur;
    }

    void showMammalTraits() {
        System.out.println(name + " is a mammal. Has fur? " + hasFur);
    }
}

// Derived class: Dog (inherits from Mammal)
class Dog extends Mammal {
    String breed;

    // Constructor for Dog
    public Dog(String name, boolean hasFur, String breed) {
        super(name, hasFur); // Calling Mammal class constructor
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " (Breed: " + breed + ") is barking.");
    }
}

// Main class (must match file name problem3.java)
public class problem3 {
    public static void main(String[] args) {
        // Creating a Dog object
        Dog myDog = new Dog("Buddy", true, "Golden Retriever");

        // Demonstrating multilevel inheritance
        myDog.displayInfo();      // From Animal
        myDog.eat();              // From Animal
        myDog.showMammalTraits(); // From Mammal
        myDog.bark();             // From Dog
    }
}
