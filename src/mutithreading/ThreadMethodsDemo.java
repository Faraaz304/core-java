package mutithreading;

public class ThreadMethodsDemo {

    public static void main(String[] args) throws InterruptedException {
        // Create two threads
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Set names and priorities
        t1.setName("Thread-A");
        t2.setName("Thread-B");

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        // Print initial details
        System.out.println(t1.getName() + " Priority: " + t1.getPriority());
        System.out.println(t2.getName() + " Priority: " + t2.getPriority());

        // Start threads
        t1.start();
        t2.start();

        // Check if threads are alive
        System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());

        // Main thread waits for both threads to finish using join()
        t1.join();
        t2.join();

        System.out.println("Main thread ends after both threads complete.");
    }

    static class MyThread extends Thread {
        public void run() {
            System.out.println(getName() + " is starting...");

            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " - Count: " + i);

                // Sleep to simulate delay
                try {
                    Thread.sleep(500); // TIMED_WAITING
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Let other threads have a chance to execute
                if (i == 2) {
                    System.out.println(getName() + " yielding...");
                    Thread.yield();
                }
            }

            System.out.println(getName() + " has finished.");
        }
    }
}
