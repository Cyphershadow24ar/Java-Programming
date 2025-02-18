// Base class: Animal
class Animal {
    protected String name;
    protected int age;

    // Default constructor
    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Animal created with default values.");
    }

    // Parameterized constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal created: " + name + ", Age: " + age);
    }

    // Protected method
    protected void displayInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age);
    }
}

// Intermediate class: Mammal (inherits from Animal)
class Mammal extends Animal {
    protected boolean hasFur;

    // Default constructor
    public Mammal() {
        super(); // Calls the default constructor of Animal
        this.hasFur = true;
        System.out.println("Mammal created with default values.");
    }

    // Parameterized constructor
    public Mammal(String name, int age, boolean hasFur) {
        super(name, age); // Calls the parameterized constructor of Animal
        this.hasFur = hasFur;
        System.out.println("Mammal created: " + name + ", Has Fur: " + hasFur);
    }

    // Protected method
    protected void showMammalTraits() {
        System.out.println(name + " is a mammal. Has fur? " + hasFur);
    }
}

// Derived class: Dog (inherits from Mammal)
class Dog extends Mammal {
    private String breed;

    // Default constructor
    public Dog() {
        super(); // Calls the default constructor of Mammal
        this.breed = "Unknown";
        System.out.println("Dog created with default values.");
    }

    // Parameterized constructor
    public Dog(String name, int age, boolean hasFur, String breed) {
        super(name, age, hasFur); // Calls the parameterized constructor of Mammal
        this.breed = breed;
        System.out.println("Dog created: " + name + ", Breed: " + breed);
    }

    // Public method accessing protected members
    public void displayDogInfo() {
        displayInfo(); // Calling protected method from Animal
        showMammalTraits(); // Calling protected method from Mammal
        System.out.println("Breed: " + breed);
    }
}

// Main class (must match file name problem4.java)
public class problem4 {
    public static void main(String[] args) {
        System.out.println("\nCreating Default Dog:");
        Dog defaultDog = new Dog();
        defaultDog.displayDogInfo();

        System.out.println("\nCreating Parameterized Dog:");
        Dog myDog = new Dog("Buddy", 3, true, "Golden Retriever");
        myDog.displayDogInfo();
    }
}
