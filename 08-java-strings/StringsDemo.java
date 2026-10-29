public class StringsDemo {
    public static void main(String[] args) {
        String name = "Vishruth"; // String literal (Static Memory)
        System.out.println("Name: " + name);

        // Creating a Java string using a new keyword (Heap Memory)
        String str = new String("Virat Kohli");
        System.out.println(str);
    }
}