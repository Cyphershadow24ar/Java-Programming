class Toyota implements Car {
    public void run() {
        System.out.println("Toyota is running at speed: " + speed + " km/h");
    }

    public void stop() {
        System.out.println("Toyota is stopping...");
    }

    public void boost() {
        System.out.println("Toyota boost activated!");
    }

    public static void main(String[] args) {
        Toyota obj = new Toyota();
        obj.run();
        obj.boost();
        obj.stop();
    }
}

interface Cart {
    int speed = 60; // Variables in interfaces are public, static, and final by default
    void run();
}

interface Car extends Cart {
    void stop();
    void boost();
}

