package threads;

public class NumberPrinter {
    public static void main(String[] args) {
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 60; i += 2) {
                System.out.println("Odd Thread: " + i);
            }
        });

        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 60; i += 2) {
                System.out.println("Even Thread: " + i);
            }
        });

        oddThread.start();
        evenThread.start();
    }
}


