public class Student3 {
    String name;
    int age;

    // Parameterized Constructor
    Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student3(Student3 s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Original object
        Student3 s1 = new Student3("Vishruth", 23);

        // Copy object using copy constructor
        Student3 s2 = new Student3(s1);

        System.out.println("Original Object: ");
        s1.display();

        System.out.println("\nCopied Object: ");
        s2.display();
    }
}
