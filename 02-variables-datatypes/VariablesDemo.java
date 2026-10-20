class Car // 02. Class Non-Primitive Data Type Example
{
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Model: " + model + "\nYear: " + year);
    }
}

public class VariablesDemo {
    public static void main(String args[]) {
        // Primitive Data Types
        boolean isJavaFun = true; // true or false
        byte age = 23; // -128 to +127
        short students = 1000;
        int population = 1400000000;
        long worldPopulation = 7800000000L;
        float cgpa = 8.1f;
        double pi = 3.141592653589793;
        char grade = 'A';
        String name = "Vishruth D M"; // 01. String Non-Primitive Data Type
        System.out.println("Java is Fun: " + isJavaFun);
        System.out.println("Age: " + age);
        System.out.println("Number of Students: " + students);
        System.out.println("India Population: " + population);
        System.out.println("World Population: " + worldPopulation);
        System.out.println("CGPA: " + cgpa);
        System.out.println("PI: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Name: " + name);

        // 03. Object Non-Primitive Data Type
        Car myCar = new Car("Toyota", 2026);
        myCar.display();

        /*
         * 04. Interfaces Non-Primitive Data Type
         * interface Animal {
         * void sound();
         * }
         * 
         * class Dog implements Animal {
         * public void sound() {
         * System.out.println("Woof");
         * }
         * }
         * 
         * public class Geeks {
         * public static void main(String[] args) {
         * Animal dog = new Dog();
         * dog.sound();
         * }
         * }
         */

        // 05. Array Non-Primitive Data Type
        int[] numbers = { 1, 2, 3, 4, 5 };
        String[] names = { "Vishruth", "Yashu", "Raghu", "Pavan" };
        System.out.println(numbers[2]);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}