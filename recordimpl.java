
// class Student {
//     private String name;
//     private int age;

//     public Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }

//     @Override
//     public String toString() {
//         return "Student{name='" + name + "', age=" + age + '}';
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         result = prime * result + age;
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Student other = (Student) obj;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         if (age != other.age)
//             return false;
//         return true;
//     }
// }

// This class student can also be implemented as a record in Java 14 and above
// Only used for class that are immutable and have a fixed set of fields(data storage classes).

record Student(String name, int age) {
    // No need to implement equals, hashCode, or toString methods as they are
    // automatically generated
    // by the record feature in Java.
    // However, you can add additional methods if needed.
}

record ABC(String id, int age) {

    static int count = 0;

    // public ABC(String name, int age) {
    // this.name = name;
    // this.age = age;

    // if (age < 0) {
    // throw new IllegalArgumentException("Age cannot be negative");
    // }
    // }
    // INstead of the above constructor, we can use the compact constructor syntax
    public ABC {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    public int increment() {
        return count++;
    }

    // record class can have methods,static fields but they cannot have instance fields 
}

public class recordimpl {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 22);
        Student s2 = new Student("Alice", 22);

        // We cannot modify the fields of a record after it is created
        // since record is only used for immutable data storage classes.
        // Fields are final by default in records.
        // s1.setname("Bob"); // This will not compile as records are immutable
        System.out.println(s1.equals(s2));

        ABC a1 = new ABC("John", 25);
        System.out.println(a1.age());
    }
}
