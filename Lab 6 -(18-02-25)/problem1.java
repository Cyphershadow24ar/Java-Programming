// problem1: Write a program to create a class 'Box' which contains methods and other details(width, height, depth) to calculate volume. Another class ‘Boxweight’ contains method for finding cost for shipping the box using weight of the box (formula to find cost of shipping= distance in km * volume * cost per km) Take cost per KM by the user. WAP to find the volume of box and cost to ship using a single object

class Box {
    int height, width, depth;

    Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    int volume() {
        return height * width * depth;
    }
}

class Boxweight extends Box {
    int distance, costKM, COS, vol;

    Boxweight(int height, int width, int depth, int distance, int costKM) {
        super(height, width, depth);
        this.distance = distance;
        this.costKM = costKM;
        this.vol = volume();
    }

    int CostShipping() {
        COS = distance * vol * costKM;
        System.out.println("Volume of Box: " + vol);
        System.out.println("Cost of Shipping for this item only: " + COS);
        return COS;
    }
}

public class problem1 {  // Class name should be capitalized
    public static void main(String args[]) { // Corrected method name
        Boxweight b = new Boxweight(33, 44, 55, 123, 4);
        int x = b.CostShipping();
        System.out.println("Cost of Shipping: " + x);
    }
}
