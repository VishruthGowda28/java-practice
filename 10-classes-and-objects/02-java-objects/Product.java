//Example: Initialize Object by using Method/Function
public class Product {
    String name;
    float price;

    // Constructor to initialize object state
    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    // setter method (optional)
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Product p1 = new Product("TATA", 1500000.0f);
        Product p2 = new Product("BMW", 3000000f);

        System.out.println(p1.getName() + " - " + p1.getPrice());
        System.out.println(p2.getName() + " - " + p2.getPrice());
    }
}
