public class Q40_VariableScope {

    // Instance (global) variable
    static String Globalvarable = "Globalvarable in class Q40_VariableScope";

    class box {
        // Instance (global) variable in Box class

        static String Globalvarable2 = "box.Globalvarable2";

    }

    public static void main(String[] args) {
        int age = 20;
        fun();
    }

    static void fun() {

        String localvar = "localVarable";
        System.out.println("Instance (global) variable\n" + Q40_VariableScope.Globalvarable);
        System.out.println("Instance (global) variable in class\n" + box.Globalvarable2);
    }
}
