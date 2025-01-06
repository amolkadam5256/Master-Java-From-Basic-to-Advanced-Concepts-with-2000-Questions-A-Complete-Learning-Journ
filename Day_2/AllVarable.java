public class AllVarable {
    public static void main(String[] args){
        System.out.println("Print all Type of Data with values ?");

        byte smallNumber = 100; // within range
        int intValue = 321;
        short mediumNumber = 15000; // within range
        long veryLargeNumber = 10000000000L; // Large number
        float price = 19.99f; // Float value
        double pi = 3.14159265359; // Double value
        char grade = 'A'; // Single character
        boolean isJavaFun = true; // Boolean value
        String message = "Hello, Java!"; // String value
        int[] numbers = {1, 2, 3, 4, 5}; // Array of integers


        System.out.println("Byte : " + smallNumber);
        System.out.println("int  : " + intValue);
        System.out.println("short  : " + mediumNumber);
        System.out.println("long  : " + veryLargeNumber);
        System.out.println("Flote  : " + price);
        System.out.println("Double  : " + pi);
        System.out.println("char  : " + grade);
        System.out.println("Boolen  : " + isJavaFun);
        System.out.println("String  : " + message);
        System.out.println("Atrray first index value  : " + numbers[0]);
    }
}
