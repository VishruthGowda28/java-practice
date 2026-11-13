public class FinalVariableDemo {
    public static void main(String[] args) {
        final double PI = 3.14;
        System.out.println("Value of PI: " + PI);

        /*
         * Types of Final Variables
         * A variable declared with final becomes constant after one assignment.
         * 
         * 1. final Variable
         * 
         * final int THRESHOLD = 5;
         * 
         * 2. Blank final Variable
         * 
         * final int THRESHOLD;
         * 
         * Note: A static final variable must be initialized either at the point of
         * declaration or in a static initialization block.
         * 
         * 3. Static final Variable
         * 
         * static final double PI = 3.141592653589793;
         * 
         * 4. Static Blank final Variable
         * 
         * static final double PI;
         * 
         * static {
         * 
         * PI = 3.141592653589793;
         * 
         * }
         */
    }
}
