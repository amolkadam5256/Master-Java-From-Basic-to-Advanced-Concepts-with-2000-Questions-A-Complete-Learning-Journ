public class variablesInJava {
    public static void main(String[] args){
        String name = "Amol";
        int age = 22;
        float weight = 60.65f;
        char firstCharacter = 'A';
        boolean drinks = false;

        System.out.println("My name is : " + name);
        System.out.println("My age is : " + age);
        System.out.println("My weight is : " + weight);
        System.out.println("My name of first character is : " + firstCharacter);
        System.out.println("You are drink yes(1) or no(0) :" + drinks +"\n");

        System.out.println("Note that if you assign a new value to an existing variable, it will overwrite the previous value");

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName);
        System.out.println(lastName+"\n");
        String fullName = firstName + lastName;
        System.out.println(fullName +"\n");


        System.out.println("Declare Many Variables");


        int x = 5;
        int y = 6;
        int z = 50;
        System.out.println( " sum of x + y + z = "+ (x + y + z ) +"\n");


        System.out.println("// Good\n" +
                "int minutesPerHour = 60;\n" +
                "\n" +
                "// OK, but not so easy to understand what m actually is\n" +
                "int m = 60;" +"\n");


        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

// Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);
    }
}
