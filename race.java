
class Counter {
    public int count = 0;

    // public int increment() {
    //     return count++;
    // }

    // Synchronized method to ensure that only one thread can execute this method at a time
    public synchronized int increment() {
        return count++;
    }
}

public class race {
    public static void main(String[] args) throws InterruptedException {
        Counter ctr = new Counter();
        Runnable r1 = () -> {
            for (int i = 0; i < 1000; i++) {
                ctr.increment();
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 1000; i++) {
                ctr.increment();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        // ctr count should be 2000 but due to racing condition it may not be
        // 2000, it may be less than 2000
        //Issue with this is that both threads are working and main thread is not waiting for them to finish and has already printed the count
        System.out.println("Final count: " + ctr.count);

        // To ensure that the main thread waits for both threads to finish
        t1.join();
        t2.join();  
        // still wrong bcz of racing condition, both threads are incrementing the same count variable 
        System.out.println("Final count: " + ctr.count);
    }
}
