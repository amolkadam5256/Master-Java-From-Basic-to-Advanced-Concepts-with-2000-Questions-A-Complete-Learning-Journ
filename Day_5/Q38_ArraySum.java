import java.util.Scanner;

public class Q38_ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Size Of Array: ");
        int size = input.nextInt();

        int[] num = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            num[i] = input.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Index Of num[" + i + "] = " + num[i]);
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + num[i];

        }
        System.out.println("Sum Of Array : " + sum);
        input.close();
    }
}
