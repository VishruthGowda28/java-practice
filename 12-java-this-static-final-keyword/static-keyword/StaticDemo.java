public class StaticDemo {
    static int number = 100;

    public static void main(String[] args) {
        System.out.println("Initial number: " + number);
        number = 200;
        System.out.println("Updated number: " + number);
    }
}
