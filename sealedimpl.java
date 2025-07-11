
// class that are extended by sealed class must be declared as final, non-sealed, or sealed.

sealed class A extends Thread implements Cloneable permits B, C {

}

sealed class B extends A permits D {

}

final class C extends A {

}

non-sealed class D extends B {

}

public class sealedimpl {
    public static void main(String[] args) {

    }
}
