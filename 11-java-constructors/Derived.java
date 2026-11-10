public class Derived extends Base {
    // constructor 3
    Derived() {
        System.out.println("No argument constructor " + "constructor of derived");
    }

    // constructor 4
    Derived(String name) {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized " + "constructor of derived");
    }

    public static void main(String[] args) {
        // calls parameterized constuctor 4
        Derived obj = new Derived("Vishruth");

        // calls no-argument constructor
        // Derived obj = new Derived()
    }
}
