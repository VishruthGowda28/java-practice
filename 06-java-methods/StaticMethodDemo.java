public class StaticMethodDemo {
    static int a = 28; // static variable
    int b = 18; // instance variable

    void simpleDisplay() {
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }

    static void staticDisplay() {
        System.out.println("A: " + a);
        /*
         * System.out.println("B: " + b); Cannot access a Instance Variable by a
         * static method
         */
    }

    public static void main(String args[]) {
        StaticMethodDemo s = new StaticMethodDemo();
        s.simpleDisplay();
        staticDisplay();
    }
}
