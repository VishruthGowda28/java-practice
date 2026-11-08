public class Product {
    String name;
    float price;

    // Constructor with one argument
    Product(String name) {
        System.out.println("Constructor with one " + "argument - String: " + name);
    }

    // Constructor with two arguments
    Product(String name, float price) {
        System.out.println("Constructor with two " + "arguments - String and Float: " + name + " " + price);
    }

    // Constructor with one argument but with different type than previous
    Product(int id) {
        System.out.println(
                "Constructor with one argument: "
                        + "Integer: " + id);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Sugar");

        Product p3 = new Product(101);

        Product p2 = new Product("Mobile", 18000.5f);
    }
}