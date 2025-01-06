public class Q7ConstantVariables {
    public static void main(String[] args){
        final  int  num = 12;
        System.out.println(num);
        final String NAME = "Java";  // Immutable
        final int[] NUMBERS = {1, 2, 3};  // Mutable content
        NUMBERS[0] = 10;  // Allowed
        NUMBERS[2] = 100;  // Allowed
// NUMBERS = new int[]{4, 5, 6};  // Error: Cannot reassign the reference
        System.out.println(NUMBERS[0]);
        System.out.println(NUMBERS[1]);
        System.out.println(NUMBERS[2]);

    }
}
