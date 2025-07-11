import java.util.*;

//To implement Comparable interface, we need to override the compareTo method
class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }

    @Override
    public int compareTo(Student other) {
        // Compare by age first
        if (this.age > other.age) {
            return 1;
        } else
            return -1;
    }
}

public class comparableimpl {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 23));

        Collections.sort(students); // Sorts the list based on the compareTo method
        // We need to write our own compareTo method in the Student class to sort by age
        // Or we can use a custom comparator if we want to sort by name or any other field.
        System.out.println(students);
    }
}
