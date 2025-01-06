public class Q19_Convert {
    public static void main(String[] args){

        String numberString = "12345";
        System.out.println("String value: " + numberString);

        int number = Integer.parseInt(numberString);
        System.out.println("Converted integer: " + number);

        Integer numberWrapper = Integer.valueOf(number);
        System.out.println("Class of the Integer object: " + numberWrapper.getClass());

        System.out.println("Original string: " + numberString);
    }
}
