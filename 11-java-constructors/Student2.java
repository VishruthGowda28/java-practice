public class Student2 {
    // data members of the class
    String name;
    int age;

    // Parameterized Constructor
    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // mehod to display object data
    void display() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }

    public static void main(String[] args) {
        Student2 std1 = new Student2("Vishruth", 28);
        std1.display();
    }
}
