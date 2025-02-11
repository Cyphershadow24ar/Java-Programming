// Create a three-level inheritance hierarchy with classes like Animal, Mammal, and Dog. Add attributes and methods to demonstrate multilevel inheritance.

class Animal{
    String name;
    Animal(String name){
        this.name=name;
    }
}
class Mammal extends Animal{
    Boolean canGiveBirth;
    Mammal(String name,Boolean canGiveBirth){
        super(name);
        this.canGiveBirth=canGiveBirth;
    }
}
class Dog extends Mammal{
    String voice;
    String prajati;
    Dog(String name,Boolean canGiveBirth,String voice,String prajati){
        super(name,canGiveBirth);
        this.voice=voice;
        this.prajati=prajati;
    }
    void details(){
        System.out.println("The dog you want is called "+ name+ "\nBreeding status is : "+canGiveBirth+"\nIt makes the sound "+ voice+ " when played with\nThe Race : "+prajati);
    }
}
class Animals{
    public static void main(String args[]){
        Dog dogs=new Dog("Faiz",true,"Bhaw-bhaw","gully");
    dogs.details();
    }
    
}