import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class collectionimpl {
    public static void main(String[] args) {
        // Collection is an interface in Java that represents a group of objects.
        // All these arraylist,hashset,linkedlist,vector are implementations of the
        // Collection interface.
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);

        // Adding an element of type String to a Collection of Integer will cause a
        // compile-time error.
        // nums.add("10");

        System.out.println(nums);

        // The collection does not have an index, so we cannot access elements by index.

        // So we can use List to declare since ArrayList is a List implementation.

        List<Integer> numList = new ArrayList<Integer>();
        numList.add(1);
        numList.add(4);
        numList.add(3);
        numList.add(6);
        numList.add(4);

        System.out.println(numList.indexOf(4));

        Set<Integer> numSet = new HashSet<Integer>();
        numSet.add(12);
        numSet.add(45);
        numSet.add(32);
        numSet.add(63);
        numSet.add(45); // Duplicate elements are not allowed in a Set, so this

        Set<Integer> numSet2 = new TreeSet<Integer>();// TreeSet is a sorted set implementation

        // Iterator is an interface that provides a way to iterate over a collection.It
        // is above the Collection interface and can be used with any collection type.
        Iterator<Integer> it = numSet.iterator();
        while (it.hasNext()) {
            Integer num = it.next();
            System.out.println(num);
        }

        Map<String, Integer> map = new HashMap<>();
        //HashTable is a synchronized version of HashMap, but it does not allow null keys or values.
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map);
        System.out.println(map.get("two")); // Accessing value by key
        System.out.println(map.containsKey("three")); // Checking if a key exists
        System.out.println(map.containsValue(2)); // Checking if a value exists
        System.out.println(map.keySet()); // Getting all keys
        System.out.println(map.values()); // Getting all values
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
