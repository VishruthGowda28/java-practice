public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Virat");
        System.out.println("Initial: " + sb);

        // append() method
        sb.append(" Kohli");
        System.out.println("After append: " + sb);

        // insert() method
        sb.insert(11, " rcb");
        System.out.println("After insert: " + sb);

        // replace() method
        sb.replace(11, 15, " 18");
        System.out.println("After replace: " + sb);

        // delete() method
        sb.delete(6, 11);
        System.out.println("After delete: " + sb);

        // reverse() method
        sb.reverse();
        System.out.println("After reverse: " + sb);
        sb.reverse();

        // charAt() method
        char c = sb.charAt(5);
        System.out.println("Character at index at 5: " + c);

        // setCharSet() method
        sb.setCharAt(5, 'X');
        System.out.println("After setCharAt: " + sb);

        // substring() method
        String sub_string = sb.substring(3, 6);
        System.out.println("Substring (3-6): " + sub_string);

        // indexOf() method
        System.out.println("Index of 'rat': " + sb.indexOf("rat"));

        // deleteCharAt() method
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        // toString() method
        String result = sb.toString();
        System.out.println("Final String: " + result);
    }
}
