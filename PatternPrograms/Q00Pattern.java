
import java.util.Scanner;

public class Q00Pattern {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows to print pattern: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        input.close();
    }
}
