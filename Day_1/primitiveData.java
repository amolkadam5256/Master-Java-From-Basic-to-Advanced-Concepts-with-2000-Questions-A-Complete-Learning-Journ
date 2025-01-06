public class primitiveData {
    public static void main(String[] args) {
        int myNum = 5;               // integer (whole number)
        float myFloatNum = 5.99f;    // floating point number
        char myLetter = 'D';         // character
        boolean myBool = true;       // boolean
        String myText = "Hello";     // String
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText + "\n");
        System.out.println("\n" +
                "Data Type\t\tSize\t\tDescription\n" +
                "byte\t\t\t1 byte\t\tStores whole numbers from -128 to 127\n" +
                "short\t\t\t2 bytes\t\tStores whole numbers from -32,768 to 32,767\n" +
                "int\t\t\t\t4 bytes\t\tStores whole numbers from -2,147,483,648 to 2,147,483,647\n" +
                "long\t\t\t8 bytes\t\tStores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807\n" +
                "float\t\t\t4 bytes\t\tStores fractional numbers. Sufficient for storing 6 to 7 decimal digits\n" +
                "double\t\t\t8 bytes\t\tStores fractional numbers. Sufficient for storing 15 decimal digits\n" +
                "boolean\t\t\t1 bit\t\tStores true or false values\n" +
                "char\t\t\t2 bytes\t\tStores a single character/letter or ASCII values \n");


        System.out.println("Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.\n" +
                "\n" +
                "Floating point types represents numbers with a fractional part, containing one or more decimals. There are two types: float and double.");
    }
}
