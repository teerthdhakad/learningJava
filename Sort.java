import java.util.*;

class Student {
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
}

public class Sort {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(25);
        nums.add(32);
        nums.add(48);
        nums.add(51);

        Collections.sort(nums); // Sorts the list in ascending order

        // To sort in custom order
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                if (t1 % 10 > t2 % 10) {
                    return 1;
                } else
                    return -1;
            }
        };
        Collections.sort(nums, comparator);
        System.out.println(nums);

        List<String> names = new ArrayList<>();
        names.add("Teerth");
        names.add("Akshay");
        names.add("Amit");
        names.add("Rohit");

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() > s2.length()) {
                    return 1;
                } else if (s1.length() == s2.length()) {
                    return s1.compareTo(s2); // Sorts alphabetically if lengths are equal
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(names, comp); // Sorts the list in alphabetical order
        System.out.println(names);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Teerth", 20));
        students.add(new Student("Akshay", 22));
        students.add(new Student("Amit", 21));
        students.add(new Student("Rohit", 23));

        for (Student student : students) {
            System.out.println(student);
        }

        Comparator<Student> comparatorStudentByName = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.age > s2.age) {
                    return 1;
                } else if (s1.age == s2.age) {
                    return s1.name.compareTo(s2.name); // Sorts by name if ages are equal
                } else {
                    return -1;
                }
            }
        };

        // Can use lambda expression as well
        Comparator<Student> abcComp = (Student s1, Student s2) -> {
            if (s1.age > s2.age) {
                return 1;
            } else if (s1.age == s2.age) {
                return s1.name.compareTo(s2.name);
            } else {
                return -1;
            }
        };

        Collections.sort(students, comparatorStudentByName);
        System.out.println("Sorted Students by Age and Name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
