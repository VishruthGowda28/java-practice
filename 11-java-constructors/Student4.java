class Student4 {

    // Private Constructor
    private Student4() {
        System.out.println("Private Constructor called");
    }

    // Static Method
    public static void display() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        // Student4 std = new Student4(); //Should be another class Main
        // private
        Student4.display();
    }
}
