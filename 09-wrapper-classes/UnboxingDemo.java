import java.util.ArrayList;

public class UnboxingDemo {
    /*
     * Unboxing is the automatic conversion of a wrapper class object back into its
     * corresponding primitive type.
     */
    public static void main(String[] args) {
        Character ch = 'v';
        // Unboxing: Character -> char
        char c = ch;
        System.out.println(ch + ", " + c);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(28);
        System.out.println(list.get(0));

        // Unboxing: Integer -> int
        int num = list.get(0);
        System.out.println("After Unboxing: " + num);
    }
}