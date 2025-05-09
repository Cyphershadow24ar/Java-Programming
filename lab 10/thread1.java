class thread1 extends Thread {
    public void run() {
        System.out.println("Hello Java Coders.");
    }

    public static void main(String[] args) {
        thread1 t1 = new thread1(); // Create thread
        t1.start();                 // Start thread
    }
}

