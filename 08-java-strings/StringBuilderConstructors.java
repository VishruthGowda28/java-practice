public class StringBuilderConstructors {
    public static void main(String[] args) {
        // StringBuilder() : Creates an empty builder with a default capacity of 16
        // characters.
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Vishruth");
        sb1.append(" Gowda");
        System.out.println("sb1: " + sb1);

        // StringBuilder(int capacity) : Creates an empty builder with a specified
        // initial capacity.
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("Java");
        sb2.append(" Programming");
        System.out.println("sb2: " + sb2);

        // StringBuilder(String str) : Initializes the builder with the content of the
        // given String.
        StringBuilder sb3 = new StringBuilder("Vishruth");
        sb3.append(" D M");
        System.out.println("sb3: " + sb3);

        // StringBuilder(CharSequence cs) : Initializes the builder with the given
        // CharSequence (for example, String or StringBuffer).
        CharSequence cs = "Java";
        StringBuilder sb4 = new StringBuilder(cs);
        sb4.append(" Programming");
        System.out.println("sb4: " + sb4);
    }
}
