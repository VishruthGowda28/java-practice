public class ImmutableString {
    public static void main(String[] args) {
        String str = "Hello";

        /*
         * The concat() method in Java is used to append one string to another and
         * returns a new combined string. It does not modify the original string since
         * strings are immutable.
         * 
         * Used to concatenate (join) two strings
         * Returns a new string as the result
         * Throws NullPointerException if the argument is null
         */

        str = str.concat(" World!");
        System.out.println(str);
    }
}
