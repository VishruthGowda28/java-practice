public class Temp1 {
    // block to be executed before any constructor.
    {
        System.out.println("initial block");
    }

    // no-argument constructor
    Temp1() {
        System.out.println("default");
    }

    // constructor with one argument
    Temp1(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        // Object creation by calling no-argument constructor
        new Temp1();

        // Object creation by calling parameterised constructor with one argument
        new Temp1(18);
    }
}
