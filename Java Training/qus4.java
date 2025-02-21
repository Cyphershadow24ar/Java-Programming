import java.util.Scanner;
public class qus4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the shape size you what to check : ");
        int s = sc.nextInt(); // s ->size
        if(s == 3){
            System.out.println("Triangle");
        }
        else if(s == 4){
            System.out.println("Square");
        }
        else if(s == 5){
            System.out.println("Pentagon");
        }
        else if(s == 6){
            System.out.println("Hexagon");
        }
        else if(s == 7){
            System.out.println("Heptagon");
        }
        else if(s == 8){
            System.out.println("Octagon");
        }
        else if(s == 9){
            System.out.println("Nonagon");
        }
        else if(s == 10){
            System.out.println("Decagon");
        }
        else{
            System.out.println("Enter a number between 3 and 10");
        }
    }
    
}
