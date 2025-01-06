import java.util.Scanner;

public class SwapTwoNumberUsingTemp {
    public static void main(String[] args){
        int a , b , temp =0;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();

        System.out.println("before swap a and b ");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        temp = a;
        a= b;
        b= temp;
        System.out.println("After Swap a and b :");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}
