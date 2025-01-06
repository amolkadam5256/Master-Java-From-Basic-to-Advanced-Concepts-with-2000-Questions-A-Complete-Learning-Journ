public class PrimitiveTypeCasting {
    public static void main(String[] args) {
        char ch = 'A';
        int asciiValue = (int) ch; // Convert char to int

        System.out.println("Char: " + ch);
        System.out.println("ASCII Value: " + asciiValue);

        int num = 66;
        char character = (char) num; // Convert int to char

        System.out.println("Integer: " + num);
        System.out.println("Character: " + character);
    }
}
