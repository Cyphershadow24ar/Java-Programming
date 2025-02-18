// Create a class Car with attributes like make, model, year, and color. Include
// a method displayDetails() to print the car's details.
// • Create an object of the Car class and call the displayDetails() method.
// • Add a constructor to initialize the values of the attributes when creating
// an object.

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void displayDetails() {
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Color: " + this.color);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020, "Black");
        car.displayDetails();
    }
}