public class Q6AllDataTypes {
    public static void main(String[] args) {
        int i = 12;
        float f = 92233720368547.75808f;
        double d = 23.2323;
        byte bi = 5;
        short s = 26021;
        char c = 'c';
        boolean b = true;
        String str = "Hello Java";
        int[] arr = {1, 2, 3};

        // Printing all variables
        System.out.println("int: " + i);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("byte: " + bi);
        System.out.println("short: " + s);
        System.out.println("char: " + c);
        System.out.println("boolean: " + b);
        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
