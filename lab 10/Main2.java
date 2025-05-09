class SharedPrinter {
    synchronized void printMessage(String message) {
        for (int i = 0; i < 3; i++) {
            System.out.println(message);
            try {
                Thread.sleep(500);  // Just to visualize context switching
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class thread1 extends Thread {
    SharedPrinter printer;

    thread1(SharedPrinter p) {
        this.printer = p;
    }

    public void run() {
        printer.printMessage("Hello from thread1");
    }
}

class thread2 extends Thread {
    SharedPrinter printer;

    thread2(SharedPrinter p) {
        this.printer = p;
    }

    public void run() {
        printer.printMessage("World from thread2");
    }
}

public class Main2{
    public static void main(String[] args) {
        SharedPrinter shared = new SharedPrinter();

        thread1 t1 = new thread1(shared);
        thread2 t2 = new thread2(shared);

        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}



