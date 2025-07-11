@FunctionalInterface
interface demo {
    void show(int n);
}

interface demo1 {
    int add(int a, int b);
}

public class functionalInterface {
    public static void main(String[] args) {
        demo obj = new demo() {
            public void show(int n) {
                System.out.println("Hello from demo" + n);
            }
        };
        // Lambda expression implementation only for functinal interface
        // A functional interface is an interface with a single abstract method
        demo obj1 = (int n) -> {
            System.out.println("Hello from demo using lambda" + n);
        };

        demo1 obj2 = (a, b) -> {
            return a + b;
        };

        obj.show(10);
        obj1.show(20);
        int result = obj2.add(10,20);
    }
}
