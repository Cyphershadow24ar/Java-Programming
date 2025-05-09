package cgu;

import java.io.Serializable;
public class Employee implements Serializable {

	int id;
	String name;
	transient int pin; //not serialize
	
	public Employee(int id,String name,int pin) 
	{
		
		this.id = id;
		this.name = name;
		this.pin = pin;
	}
	
	public String toString() {
		return this.id + "," + this.name + "," + this.pin;
	}
}