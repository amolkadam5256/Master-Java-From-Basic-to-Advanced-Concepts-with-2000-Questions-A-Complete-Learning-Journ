public class WrapperClass {

    public static void main(String[] args) {
        System.out.println("Hello Wrapper Class");

        // Parsing a String to primitive int
        int x = Integer.parseInt("123");

        // Converting primitive int to Integer object (Boxing)
        Integer obj = Integer.valueOf(x);

        // Printing value
        System.out.println("Primitive int x: " + x);
        System.out.println("Wrapper Integer obj: " + obj);

        // Printing the type using getClass() method on object (only works with objects)
        System.out.println("Type of obj: " + obj.getClass().getSimpleName());
    }
}
