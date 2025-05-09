class thread2 extends Thread {
    public void run() {
        System.out.println("World of Java Programming.");
    }

    public static void main(String[] args) {
        thread2 t2 = new thread2(); // Create thread2
        t2.start();                 // Start thread2
    }
}

