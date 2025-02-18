// problem4
// Demonstrate constructor overloading with an example of employee class to print different
// details of an employee based on the parameters passed.

class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;

    // Constructor 1: Only ID and Name
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor 2: ID, Name, and Department
    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Constructor 3: ID, Name, Department, and Salary
    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        if (department != null) {
            System.out.println("Department: " + department);
        }
        if (salary > 0) {
            System.out.println("Salary: " + salary);
        }
        System.out.println("------------------------");
    }
}

// Main class
public class problem4 {
    public static void main(String[] args) {
        // Using different constructors
        Employee emp1 = new Employee(101, "Alice");
        Employee emp2 = new Employee(102, "Bob", "IT");
        Employee emp3 = new Employee(103, "Charlie", "HR", 55000.0);

        // Displaying employee details
        emp1.display();
        emp2.display();
        emp3.display();
    }
}
