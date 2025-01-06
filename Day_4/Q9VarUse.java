public class Q9VarUse {
        public static void main(String[] args) {
            var num = 10;                // Compiler infers type as int
            var name = "Hello, Java!";   // Compiler infers type as String
            var decimal = 3.14;          // Compiler infers type as double

            // Print the values
            System.out.println("Value of num: " + num);
            System.out.println("Value of name: " + name);
            System.out.println("Value of decimal: " + decimal);

            // Print the inferred types
            System.out.println("Type of num: " + ((Object) num).getClass().getSimpleName());
            System.out.println("Type of name: " + ((Object) name).getClass().getSimpleName());
            System.out.println("Type of decimal: " + ((Object) decimal).getClass().getSimpleName());

        }
    }
