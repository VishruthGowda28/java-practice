public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        System.out.print("Primitive Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nNon-Primitive Array: ");
        String names[] = { "Vishruth", "Virat", "Modiji" };
        for (int i = 0; i < names.length; i++) {
            System.err.print(names[i] + " ");
        }
    }

}