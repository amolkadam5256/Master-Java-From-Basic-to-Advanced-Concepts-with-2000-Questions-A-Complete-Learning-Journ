import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args){
        int num  ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        num = input.nextInt();
        System.out.println("Square(num * num) of Number is :  " +(num*num));
        System.out.println("Cube of num is : "+ (num*num*num));
    }
}
