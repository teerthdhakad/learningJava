
class A extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello");
        }
    }
}

public class threads {
    public static void main(String[] args) {
        A a = new A();// Create an instance of class A which is thread
        B b = new B();

        b.setPriority(Thread.MAX_PRIORITY); // Set thread B to maximum priority
        // It does not guarantee that thread B will always run before thread A, but it
        // increases the likelihood.
        // Schedular will decide which thread to run based on priority and other
        // factors.

        a.start(); // Start thread A applying method run()
        b.start(); // Start thread B applying method run()
    }
}
