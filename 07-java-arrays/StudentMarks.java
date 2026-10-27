public class StudentMarks {
    public static int[] getMarks() {
        // return new int[] { 96, 70, 85, 76, 91 };
        int[] marks = { 96, 70, 85, 76, 91 };
        return marks;
    }

    public static void main(String[] args) {
        int[] marks = getMarks();
        System.err.print("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
