public class StringBufferDemo {
    public static void main(String[] args) {
        // Creating StringBuffer
        StringBuffer sb = new StringBuffer();

        // Adding Elements in StringBuffer
        sb.append("Vishruth");
        sb.append(" ");
        sb.append("Gowda");

        // String with a StringBuffer value
        // or converting StringBuffer into String
        String str = sb.toString();
        System.out.println(str);
    }
}