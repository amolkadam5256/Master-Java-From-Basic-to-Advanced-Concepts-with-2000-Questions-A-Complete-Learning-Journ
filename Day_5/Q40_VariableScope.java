public class Q40_VariableScope {

    // Static (global) variable
    static String globalVariable = "Global variable in class Q40_VariableScope";

    // Inner class `Box`
    static class Box {
        // Instance (non-static) variable in Box class
        int box1 = 12;

        // Static variable in Box class
        static String globalVariable2 = "Box.globalVariable2";
    }

    public static void main(String[] args) {
        // Local scope
        {
            System.err.println("Local Variables and their scope:");
            int age = 20; // Local variable
            System.out.println("Age: " + age);

            String name = "Local Variable";
            System.out.println("Name: " + name);
        }

        // Accessing Box class's instance and static variables
        Box boxInstance = new Box();
        System.err.println("Accessing Box instance variable: " + boxInstance.box1);

        // Calling a static method
        displayVariables();
    }

    static void displayVariables() {
        // Local variable inside this method
        String localVar = "localVariable";
        System.out.println("Local variable inside method: " + localVar);

        // Accessing static (global) variables
        System.out.println("Global variable in Q40_VariableScope: " + Q40_VariableScope.globalVariable);
        System.out.println("Static variable in Box class: " + Box.globalVariable2);
    }
}
