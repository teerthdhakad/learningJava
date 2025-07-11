
class A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}

public class RunTh {

    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        // Cant use start since obj1 and obj2 are not threads, they are Runnable
        // objects.
        // start is a method of Thread class, not Runnable interface.

        // Thread class has multiple constructors, one of which takes a Runnable object
        // as an argument.
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start(); // Start thread t1 which runs the run() method of A
        t2.start(); // Start thread t2 which runs the run() method of B

        Runnable obj3 = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Anonymous Runnable");
                }
            }
        };
        obj3.run();// Not starting a new thread, just running the run method directly

        Runnable obj4 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Lambda Runnable");
            }
        };
        obj4.run();
    }

}
