public class InstanceMethodDemo {
    String name = "Vishruth";

    public void greet() {
        System.out.println("Hello " + name + "!");
    }

    public static void main(String args[]) {
        InstanceMethodDemo person = new InstanceMethodDemo();
        person.greet();
    }
}