public class exception {
    public static void main(String[] args) {
        int i = 30;
        int j = 200;
        try {
            j = 20 / i;
            // What if j is 0 and I want to throw an exception
            // we can call catch block by throwing an exception
            if (j == 0) {
                throw new ArithmeticException("j cannot be zero");
            }
        }
        // e is object of exception class
        catch (ArithmeticException e) {
            // e will also have message of exception
            System.out.println("Arithmetic Exception occurred: " + e);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
        System.out.println("Value of j is: " + j);
    }
}
