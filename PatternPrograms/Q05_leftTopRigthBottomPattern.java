
import java.util.Scanner;

public class Q05_leftTopRigthBottomPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pattern No 4 right ");

        System.out.print("Enter number of column :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" - ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
