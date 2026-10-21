import java.util.Scanner;

public class ScannerClassDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        // String Input
        String name = sc.nextLine();

        System.out.println("Enter your Gender (M/F): ");
        // Character Input
        char gender = sc.next().charAt(0);

        // Numerical data input
        // byte, short and float can be read

        System.out.println("Enter your age: ");
        // Integer Input
        int age = sc.nextInt();

        System.err.println("Enter CGPA: ");
        // Float Input
        double cgpa = sc.nextDouble();

        System.out.println("Active Backlogs (true/false): ");
        // Boolean Input
        boolean active_backlogs = sc.nextBoolean();

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Active Backlogs: " + active_backlogs);
    }
}