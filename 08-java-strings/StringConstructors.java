public class StringConstructors {
    public static void main(String[] args) {
        // Constructor 1: Creating string using new keyword
        String str1 = new String("Hello Java");
        System.out.println("String using new keyword: " + str1);

        // Constructor 2: Creating string using character array
        char[] charArray = { 'J', 'A', 'V', 'A' };
        String str2 = new String(charArray);
        System.out.println("String from char array: " + str2);

        // Constructor 3: Creating string from byte array
        byte[] byteArray = { '1', '2', '3', '4', '5' };
        String str3 = new String(byteArray);
        System.out.println("String from byte array: " + str3);
    }
}