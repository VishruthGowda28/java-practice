public class StringBufferMethods {
    public static void main(String[] args) {
        // 1. append() method concatenates the given argument with this string.
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append(" Java"); // now the original string is changed
        System.out.println("append() method: " + sb1);

        // 2. insert() method inserts the given string with this string at the given
        // position.
        StringBuffer sb2 = new StringBuffer("Gowda");
        sb2.insert(0, "Vishruth "); // now the original string is changes
        System.out.println("insert() method: " + sb2);

        // 3. replace() method replaces the given string from the specified beginIndex
        // and endIndex-1.
        StringBuffer sb3 = new StringBuffer("Hello");
        sb3.replace(1, 4, "Java");
        System.out.println("replace() method: " + sb3);

        // 4. delete() Method is used to delete the string from the specified beginIndex
        // to endIndex-1.
        StringBuffer sb4 = new StringBuffer("Vishruth Gowda");
        sb4.delete(8, 14);
        System.out.println("delete() method: " + sb4);

        // 5. reverse() method of the StringBuffer class reverses the current string.
        StringBuffer sb5 = new StringBuffer("Vishruth");
        sb5.reverse();
        System.out.println("reverse() method: " + sb5);

        // 6. capacity() method of the StringBuffer class returns the current capacity
        // of the buffer. The default capacity of the buffer is 16.
        StringBuffer sb6 = new StringBuffer();
        System.out.println("Default Capacity: " + sb6.capacity());

        sb6.append("JAva is my favourite language");
        System.out.println("After append the String: " + sb6.capacity());

        // 7. length() This method return the number of character in given string.
        StringBuffer sb7 = new StringBuffer("Vishruth Gowda");
        System.out.println("Length of Vishruth Gowda: " + sb7.length());
    }
}
