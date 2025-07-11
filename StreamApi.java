import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        nums.set(2, 99); // Modify the element at index 2 (third element)

        // for (int i = 0; i < nums.size(); i++) {
        // System.out.println(nums.get(i));
        // }

        // for(int n:nums){
        // System.out.println(n);
        // }

        // nums.forEach(num -> {
        // System.out.println(num * 2);
        // });

        // Using Stream API to filter even numbers and print them

        // Stream<Integer> numStream = nums.stream();

        // This stream created from nums will not be used again, so we can use it
        // directly.
        // numStream.forEach(n -> {
        // System.out.println(n);
        // }); this will throw an IllegalStateException because a stream can only be
        // used once.

        // Stream<Integer> s2 = numStream.filter(n -> n % 2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n * 2);
        // s3.forEach(n -> System.out.println(n));
        // filter,map will return a new stream, so we can use them multiple times.

        // int result = s3.reduce(0, (a, b) -> a + b);
        // int abc = nums.stream()
        // .filter(n -> n % 2 == 0)
        // .map(n -> n * 2)
        // .reduce(0, (a, b) -> a + b);

        Stream<Integer> sorted = nums.stream().filter(n -> n > 5).map(n -> n * 2).sorted();
        sorted.forEach(n -> System.out.println(n));

        //We can do filtering with multiple threads
        Stream<Integer> str = nums.parallelStream().filter(n->n%2==0);
        
    }
}
