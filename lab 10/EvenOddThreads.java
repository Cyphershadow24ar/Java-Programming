class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i < 20; i += 2) {
            System.out.print(i + " ");
        }
    }
}

public class EvenOddThreads {
    public static void main(String[] args) throws InterruptedException {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        
        even.start();
        even.join(); // Wait for even to finish
        odd.start();
    }
}

