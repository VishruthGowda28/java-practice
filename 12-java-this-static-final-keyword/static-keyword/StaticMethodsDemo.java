public class StaticMethodsDemo {
    // static variable
    static int age = 23;
    static String name = "Vishruth";
    String course = "MCA";

    // static block
    static {
        System.out.println("MCA Student");
    }

    // static method
    static void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        // System.out.println("Course: " + course);
        // non-static variable course cannot be referenced from a static context
    }

    public static void main(String[] args) {
        display();
    }

}
