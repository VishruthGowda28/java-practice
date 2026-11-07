public class WrapperClassesDemo {
    public static void main(String[] args) {
        // Wrapper classes in Java provide object representations of primitive datatypes

        int b = 23;
        // Autoboxing: primitive int -> Integer object
        Integer a = b;

        System.out.println("The primitive int b is: " + b);
        System.out.println("The Integer object a is: " + a);
    }
}