interface Computer {
    int age = 10;

    void code();

    void debug();
}// by default every method in an interface is public and abstract
 // and every variable is public static final

class Laptop implements Computer {
    public void code() {
        System.out.println("Coding in Laptop");
    }

    public void debug() {
        System.out.println("Debugging in Laptop");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Coding in Desktop");
    }

    public void debug() {
        System.out.println("Debugging in Desktop");
    }
}

interface Printer {
    void print();
}

interface Scanner extends Printer {
    int temp = 6;
    void scan();
}

class AllinOne implements Scanner, Computer {
    public void print() {
        System.out.println("Printing from All-in-One");
    }

    public void scan() {
        System.out.println("Scanning from All-in-One");
    }

    public void code() {
        System.out.println("Coding in All-in-One");
    }

    public void debug() {
        System.out.println("Debugging in All-in-One");
    }
}

public class Interface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        lap.code();
        desk.code();

        System.out.println(Computer.age);// accessing static variable of interface
        System.out.println(Scanner.temp);
    }
}
