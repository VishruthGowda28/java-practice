public class CallStackExample {
    public static void D() {
        int age = 23;
        System.out.println("In Method D");
    }

    public static void C() {
        float cgpa = 8.1f;
        System.out.println("In Method C");
    }

    public static void B() {
        double b = 28.18;
        C(); // Calling C
        System.out.println("In Method B");
    }

    public static void A() {
        double a = 18.28;
        B(); // Calling C
        System.out.println("In Method A");
    }

    public static void main(String args[]) {
        A(); // Calling A
        D(); // Calling D
    }
}