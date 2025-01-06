public class ImplicitTypeCasting {

    public static void main(String[] args){
        System.out.println("1. Implicit (Widening) Type Casting\n ");
        int num = 100;
        System.out.println("Integer value: " + num);
        double doubleNum = num; // Implicit casting: int to double

        System.out.println("Double value (after casting): " + doubleNum);
    }
}
