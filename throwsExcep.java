
class A {

    // this throws exception to the method that calls it
    // it is not handled here
    // it is handled in the main method
    public void show() throws ClassNotFoundException {
        Class.forName("calc");
    }
}

public class throwsExcep {

    static {
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // prints entire tree from where to where the exception was thrown
            e.printStackTrace();
        }
    }
}
