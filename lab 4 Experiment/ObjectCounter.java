// Program to count the number of objects created using a class.
class ObjectCounter {
    // Static variable to keep track of the number of objects created
    private static int count = 0;

    // Constructor increments count whenever an object is created
    public ObjectCounter() {
        count++;
    }

    // Static method to get the count of objects created
    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        // Creating objects
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        // Displaying the total number of objects created
        System.out.println("Total objects created: " + ObjectCounter.getCount());
    }
}
