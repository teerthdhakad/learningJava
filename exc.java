import tools.*;

class A {
    public void show1() {
        System.out.println("I am showing A");
    }

    int num;

    class C {
        public void show1() {
            System.out.println("I am showing C");
        }
    }
}

class B extends A {
    public void show2() {
        System.out.println("I am showing B");
    }

}

abstract class car {

    abstract public int drive();

    public void music() {
        System.out.println("Playing music");
    }
}

class wagonR extends car {

    public int drive() {
        System.out.println("Driving WagonR");
        return 0;
    }

    public void music() {
        System.out.println("Playing music in WagonR");
    }
}

abstract class bike {

    abstract public int drive();

    public void music() {
        System.out.println("Playing music in bike");
    }
}

public class exc {
    public static void main(String[] args) {
        wagonR obj = new wagonR();

        A objA = new A();
        // A.C obj1 = objA.new C(); // creating object

        // A.C obj1 = new A.C(); // creating object of static inner class C

        A.C obj1 = objA.new C(); // creating object of non-static inner class C
        obj1.show1(); // calling method of inner class C
        objA.show1(); // calling method of outer class A

        A obj2 = new A() {
            public void show1() {
                System.out.println("Anonymous class overriding show1");
            }
        };

        bike obj3 = new bike(){
            public int drive(){
                System.out.println("Driving bike");
                return 0;
            }
        };//We can provide implementation of abstract class in anonymous class
    }
}
