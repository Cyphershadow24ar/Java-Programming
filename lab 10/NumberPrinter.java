class NumberPrinter extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                try {
                    Thread.sleep(5000);  // Delay of 5000 ms (5 seconds)
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        NumberPrinter t = new NumberPrinter();
        t.start();
    }
}


