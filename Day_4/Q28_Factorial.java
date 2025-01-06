import java.util.Scanner;

public class Q28_Factorial {
    public static void main(String[] args) {

        System.out.println("Calculate the Factorial of a Number");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int fact = 1;
            int i = 1;
            while (i <= num) {
                fact *= i;
                i++;
            }

            System.out.println("Factorial of " + num + "! is: " + fact);
        }

        input.close();
    }
}
