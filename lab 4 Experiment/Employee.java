// Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. 

class Employee {
    // Instance variables
    String name;
    int yearOfJoining;
    double salary;
    String address;

    // Constructor to initialize employee details
    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;}
    // Method to display employee details
    public void display() {
        System.out.printf("%-10s %-15d %-10.2f %-20s%n", name, yearOfJoining, salary, address);}
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee("Smita", 2025, 50000, "Kolkata");
        Employee emp2 = new Employee("Innu", 2024, 60000, "Delhi");
        Employee emp3 = new Employee("Kunja", 2020, 55000, "Chennai");

        System.out.printf("%-10s %-15s %-10s %-20s%n", "Name", "Year of Joining", "Salary", "Address");
        System.out.println("-----------------------------------------------------------");
        emp1.display();
        emp2.display();
        emp3.display();
    }}


