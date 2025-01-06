public class Q29_String_ToFlotrConvert {
    public static void main(String[] args) {

        String numberString = "123.45";
        System.out.println("String value: " + numberString);

        float number = Float.parseFloat(numberString);
        System.out.println("Converted float: " + number);

        System.out.println("Class of the float object: " + ((Object) number).getClass());

        System.out.println("Original string: " + numberString);
    }
}
