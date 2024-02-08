package threads;

public class DeadlockExample {
    private static final Object LOCK1 = new Object();
    private static final Object LOCK2 = new Object();

    public static void createDeadlock() {
        Thread thread1 = new Thread(() -> {
            synchronized (LOCK1) {
                System.out.println("Thread 1 acquired LOCK1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 waiting for LOCK2");
                synchronized (LOCK2) {
                    System.out.println("Thread 1 acquired LOCK2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (LOCK2) {
                System.out.println("Thread 2 acquired LOCK2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 waiting for LOCK1");
                synchronized (LOCK1) {
                    System.out.println("Thread 2 acquired LOCK1");
                }
            }
        });

        thread1.start();
        thread2.start();

        // Join the threads to wait for their completion
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program completed.");
    }
}
