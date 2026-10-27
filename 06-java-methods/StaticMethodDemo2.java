public class StaticMethodDemo2 {
    static int age = 23;
    static String name = "Vishruth Gowda";

    static void display() // static method
    {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }

    void nonstatic() {
        display();
    }

    public static void main(String args[]) {
        StaticMethodDemo2 s = new StaticMethodDemo2();
        s.nonstatic();
        display();
    }
}
