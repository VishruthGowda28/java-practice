public class Ternaryoperator {
    public static void main(String args[]) {
        int a = 10, b = 18, c = 28, result;
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Maximum of three numbers: " + result);
    }
}