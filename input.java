import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class input {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(reader);
        try {
            int result = Integer.parseInt(bf.readLine());
            System.out.println("You entered: " + result);
        } finally {
            bf.close(); // bf is a resource so we should close it
        }

        //Shortcut
        // Since BufferedReader implements AutoCloseable, we can use try-with-resources
        // which automatically closes the resource when done.
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int result = Integer.parseInt(br.readLine());
            System.out.println("You entered: " + result);
        }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number:");
        // int result = sc.nextInt();
        // System.out.println("You entered: " + result);
        // sc.close();
    }
}
