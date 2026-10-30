public class StringBufferConstructors {
    public static void main(String[] args) {
        // 1. Using default constructor
        StringBuffer sb1 = new StringBuffer();
        sb1.append("Hello");
        String str1 = sb1.toString();
        System.out.println("Default Constructor: " + str1);

        // 2. Using constructor with specified capacity
        StringBuffer sb2 = new StringBuffer(20);
        sb2.append("Java");
        sb2.append(" Programming");
        System.out.println("Capacity: " + sb2.capacity());
        System.out.println("Length: " + sb2.length());
        System.out.println("Unused space: " + (sb2.capacity() - sb2.length()));
        String str2 = sb2.toString();
        System.out.println("With Capacity 10: " + str2);

        // 3. Using constructor with string
        StringBuffer sb3 = new StringBuffer("HEllo");
        sb3.append(" Vishruth Gowda!");
        String str3 = sb3.toString();
        System.out.println("Constructor with string: " + str3);
    }
}
