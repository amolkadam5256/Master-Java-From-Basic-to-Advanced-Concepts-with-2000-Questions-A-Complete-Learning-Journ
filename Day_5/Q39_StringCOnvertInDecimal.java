public class Q39_StringCOnvertInDecimal {
    public static void main(String[] args) {

        System.out.println("Convert String varable to Decimal ?");
        String stringName = "1101";
        System.out.println("Data type of binaryString :" + stringName);
        System.out.println("Data type of binaryString: " + ((Object) stringName).getClass().getName());

        int DecimalNumber = Integer.parseInt(stringName);
        System.out.println("Data type of : DecimalNumber :" + DecimalNumber);
        System.out.println("Data type of : DecimalNumber" + ((Object) DecimalNumber).getClass().getName());

        String binaryNumber = "1010"; 

        int decimalNumber = Integer.parseInt(binaryNumber, 2);

        System.out.println("Binary: " + binaryNumber);
        System.out.println("Decimal: " + decimalNumber);
    }
}


