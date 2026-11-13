public class StaticBlockDemo {
    // static variable
    static int a = 18;
    static int b = 28;

    // static block
    static {
        System.out.println("Static block initialized");
    }

    public static void main(String[] args) {
        System.out.println("From main");
        System.out.println("Value of A: " + a);
        System.out.println("Value of B: " + b);
    }
}
