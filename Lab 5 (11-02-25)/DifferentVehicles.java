class Vehicle {
    protected String model;
    protected int year;

    Vehicle(String model,int year){
        this.model = model;
        this.year = year;
    }
    void display(){
        System.out.println("Model: "+model+" Year: "+year);
    }
}

class Car extends Vehicle{
    private int numDoors;
    private String fuelType;

    Car(String model,int year,int numDoors,String fuelType){
        super(model,year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }
    @Override
    void display(){
        System.out.println("Model: "+model+" Year: "+year+" Num of doors: "+numDoors+" Fuel type: "+fuelType);
    } 
    
}

public class DifferentVehicles {

    public static void main(String[] args) {
    Car car = new Car("Toyata-Supra",2003 , 4, "Petrol") ;
    Car car1 = new Car("BMW M8",2022 , 2, "Petrol") ;
    Car car2 = new Car("Aston Martin",2017 , 2, "Petrol") ;
    car.display();
    car1.display();
    car2.display();
    } 
}