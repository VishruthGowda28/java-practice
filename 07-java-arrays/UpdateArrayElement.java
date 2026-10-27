public class UpdateArrayElement {
    public static void main(String[] args) {
        String fruits[] = { "Apple", "Mango", "Orange", "Grapes" };
        System.out.print("Fruits: ");
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }

        System.out.print("\nUpdated Fruits: ");
        fruits[1] = "Kiwi";
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
    }
}