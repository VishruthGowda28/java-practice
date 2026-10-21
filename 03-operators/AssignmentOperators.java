public class AssignmentOperators {
    public static void main(String args[]) {
        int num = 18;
        num += 10; // num = num + 10
        System.out.println("After +10: " + num);

        num -= 5; // num = num - 5
        System.out.println("After -5: " + num);

        num *= 2; // num = num * 2
        System.out.println("After *2: " + num);

        num /= 10; // num = num / 10
        System.out.println(("After /10: " + num));

        num %= 2; // num = num % 2
        System.out.println("After %2: " + num);
    }
}