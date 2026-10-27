import java.util.Scanner;

public class ArraysDemo2 {
    public static void main(String args[]) {
        String names[];
        names = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
        sc.close();
    }
}