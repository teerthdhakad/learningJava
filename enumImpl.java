
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY// All these are objects of Day class
}

enum Laptop {
    DELL(100), HP(200), LENOVO, ASUS(400), ACER(500), APPLE(350);

    private int price;

    private Laptop() {
        this.price = 0; // Default price
    }// Defalt constructor for enum

    private Laptop(int price) {
        this.price = price;
        System.out.println(this.name());
    }

    public int getPrice() {
        return price;
    }

    public int setPrice(int price) {
        this.price = price;
        return this.price;
    }
}

public class enumImpl {
    public static void main(String[] args) {
        // Enum usage example
        // Day is a class
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);

        Day tom[] = Day.values();
        for (Day day : tom) {
            System.out.println(day + " " + day.ordinal());
        }

        Laptop myLaptop = Laptop.APPLE;
        System.out.println(myLaptop.setPrice(450));
        Laptop array[] = Laptop.values();
        for (Laptop laptop : array) {
            System.out.println(laptop + " " + laptop.getPrice());
        }
    }
}
