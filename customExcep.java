class myException extends Exception {
    public myException(String message) {
        // Call the constructor of Exception class with the message
        super(message);
    }
}

public class customExcep {
    int i = 0;
    int j = 0;

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try {
            j = 20 / i;
            if (j == 0) {
                throw new myException("j cannot be zero");
            }
        } catch (myException e) {
            System.out.println("Custom Exception occurred: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e);
        }
    }
}
