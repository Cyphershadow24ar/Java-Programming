// Demonstrate different ways to initialize instance variables using a constructor.
class Employee2 {
    String name;
    int age;

    // 1. Default constructor (Assigns default values)
    public Employee2() {
        this.name = "Unknown";
        this.age = 18;
    }

    // 2. Constructor with one parameter
    public Employee2(String name) {
        this.name = name;
        this.age = 18;
    }

    // 3. Constructor with two parameters 
    public Employee2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Using default constructor
        Employee2 emp1 = new Employee2();

        // Using constructor with one parameter
        Employee2 emp2 = new Employee2("Aniket");

        // Using constructor with two parameters
        Employee2 emp3 = new Employee2("Raj", 20);

        // Displaying the results
        emp1.display();
        emp2.display();
        emp3.display();
    }
}
