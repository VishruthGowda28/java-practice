public class Student {
    int rollNo;
    String name;

    // static variable
    static String course = "MCA";

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + "   " + name + "    " + course);
    }

    public static void main(String[] args) {
        Student s1 = new Student(28, "Vishruth");
        Student s2 = new Student(18, "Virat");

        s1.display();
        s2.display();
    }
}
