import java.util.Scanner;

public class Q27_Math_Pow {
    public static void main(String[] args){
        System.out.println("Enter any number and show Power Using Function Math.Pow");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = input.nextInt();
        System.out.print("Enter any power : ");
        int power = input.nextInt();

        double result = Math.pow(num, power);

        System.out.println("Power of num :" + result);
    }
}
