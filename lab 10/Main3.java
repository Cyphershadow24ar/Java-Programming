class thread1 extends Thread {
    public void run() {
        System.out.println("Hello from thread1");
        try {
            Thread.sleep(1000);  // Simulate some work
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Main3{
    public static void main(String[] args) {
        thread1 t1 = new thread1();

        System.out.println("Before starting, is thread1 alive? " + t1.isAlive());

        t1.start();

        System.out.println("After starting, is thread1 alive? " + t1.isAlive());

        try {
            t1.join(); // Wait for thread1 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("After completion, is thread1 alive? " + t1.isAlive());
    }
}


