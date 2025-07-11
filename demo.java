
class A {
    public A() {
        System.out.println("In A");
    }

    public A(int n) {
        System.out.println("in A int");
    }

    public void show() {
        System.out.println("I am showing A");
    }

    public String toString() {
        return "A []";
    }
}

// for inheritance we dont need .java file it only needs .class file
class B extends A {
    public B() {
        System.out.println("in B");
    }

    public B(int n) {
        // super(n);
        this();// will call default constructor of same class
        System.out.println("In B int");
    }

    public void show(int n) {
        System.out.println("I am showing B" + n);
    }
}

public class demo {
    public static void main(String[] args) {
        B obj = new B(3);// obj is not an object it is a reference variable new b() is an object
        new A();// This is object creation but since no reference thats why anonymous object but
                // we cannot use it as we have no reference to acces it
        B obj1 = new B();
        obj1.show(10);
    }
}
