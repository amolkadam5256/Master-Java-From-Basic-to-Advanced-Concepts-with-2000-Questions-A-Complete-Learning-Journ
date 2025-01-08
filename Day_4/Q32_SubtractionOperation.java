import java.util.Scanner;

public class Q32_SubtractionOperation {

    public static void main(String[] args) {
        // start Q 32) Create a variable to store the result of a subtraction operation and print it. 

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Num1 is :" );
        int num1 = input.nextInt();
        System.out.print("Enter Num2 is :" );
        int num2 = input.nextInt();

        int sub = num1 - num2;
        System.out.println("Substraction of Num1 and Num2 is :" + sub);
        input.close();
    }
}