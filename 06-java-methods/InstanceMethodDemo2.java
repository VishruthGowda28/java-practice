public class InstanceMethodDemo2 {
    public void add(int a, int b) {
        int x = a;
        int y = b;
        int z = x + y;
        System.out.println("Sum: " + z);
    }

    public static void main(String args[]) {
        InstanceMethodDemo2 a = new InstanceMethodDemo2();
        a.add(10, 20);
    }
}