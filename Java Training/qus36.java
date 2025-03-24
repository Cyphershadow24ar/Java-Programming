class Address {
    private String street, city, state;
    
    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
    
    public String toString() {
        return this.street + ", " + this.city + ", " + this.state;
    }
}

class Emp {
    private int id;
    private String name;
    private double salary;
    private Address address; // Has-a 
    
    public Emp(int id, String name, double salary, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary + ", Address: " + address;
    }
}

public class qus36 {
    public static void main(String[] args) {
        Address adr = new Address("New Post Office", "Kithadi", "Jharkhand");
        Emp emp1 = new Emp(311, "Aniket", 90000, adr);
        System.out.println(emp1);
    }
}