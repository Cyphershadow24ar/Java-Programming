// Base class: Vehicle
class Vehicle {
    String model;
    int year;

    // Constructor for Vehicle
    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Subclass: Car (inherits from Vehicle)
class Car extends Vehicle {
    int numDoors;
    String fuelType;

    // Constructor for Car
    public Car(String model, int year, int numDoors, String fuelType) {
        super(model, year); // Calling the constructor of Vehicle class
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    // Method to display car details
    void displayCarInfo() {
        displayInfo(); // Call the method from the base class
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Main class (must match filename problem2.java)
public class problem2 {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Toyota Supra", 2018, 2, "Petrol");

        // Display car details
        myCar.displayCarInfo();
    }
}
