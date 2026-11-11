package animals;

public class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Inside Dog Constructor");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
