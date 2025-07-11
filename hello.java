
class calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class Student {

    private int passwd;
    String name;
    int marks;
    static int phno;

    static {
        phno = 123;
        System.out.println("in Static");
    }

    public int getter() {
        return this.passwd;
    }

    public void setter(int num) {
        this.passwd = num;
    }

    public static void show1(Student s) {
        System.out.println(phno + s.marks + s.name);
    }

    public Student() {
        this.name = "Ted";
        this.marks = 20;
        System.out.println("in construc");
    }

    public Student(String name,int age){
        this.name = name;
    }
}

public class hello {
    public static void main(String[] args) throws ClassNotFoundException {
        // calculator cal1 = new calculator();
        // System.out.println(cal1.add(1, 2));
        // int arr[][] = new int[3][4];
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4; j++) {
        // arr[i][j] = (int) (Math.random() * 100);
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }
        // for (int x[] : arr) {
        // for (int m : x) {
        // System.out.println(m);
        // }
        // }
        // String s1 = "navin";
        // String s2 = new String("hello");
        // s1 = s1 + "sdmnf";
        // // We didnt change string we just assigned variable to new string
        // System.out.println(s1.charAt(1));

        // // TO create mutable string
        // StringBuffer ss = new StringBuffer("hello");
        // ss.append(s2);
        // System.out.println(ss);
        // ss.insert(6, "Hello");
        // System.out.println(ss);
        // Student s1 = new Student();
        Student s2 = new Student();
        s2.marks = 10;
        s2.name = "kjabsd";

        // What if we only want to load class without creating the object
        // Class.forName("Student");
        // Student.show1(s2);
        s2.setter(10);
        System.out.println(s2.getter());
    }
}
