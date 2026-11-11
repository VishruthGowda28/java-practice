public class Student1 {
    String name;
    int id;

    Student1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        String name = "Virat";
        int id = 18;
        System.out.println("Name: " + this.name);
        System.out.println("Id: " + this.id);

        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }

    public static void main(String[] args) {
        Student1 s = new Student1("Vishruth", 101);
        s.display();
    }
}
