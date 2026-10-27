public class ArraySum {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 7, 8, 10 };
        sum(arr);
    }

    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.err.println("Sum: " + sum);
    }
}
