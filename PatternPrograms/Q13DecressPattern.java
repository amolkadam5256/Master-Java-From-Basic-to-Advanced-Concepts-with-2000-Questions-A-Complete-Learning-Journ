import java.util.Scanner;

public class Q13DecressPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of rows :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("0");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("1_");
            }
            System.out.println();
        }
        sc.close();
    }
}
