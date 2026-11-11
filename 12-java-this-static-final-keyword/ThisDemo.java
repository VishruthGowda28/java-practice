public class ThisDemo {
    int a, b;

    // default constructor
    ThisDemo() {
        this(10, 20);
        System.out.println("Inside default constructor");
    }

    // parameterized constructor
    ThisDemo(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Inside paramterized constructor");
    }

    public static void main(String[] args) {
        new ThisDemo();
    }
}