import java.util.Scanner;

public class AreaOfTrangle {
    public static void main(String[] args){
        System.out.println("Area Of Trangle ( h * b) /2 : area ?");

        Scanner input = new Scanner(System.in);
        double height  = input.nextDouble();
        double base  = input.nextDouble();

        double areaOfTrangle = (height * base) /2;
        System.out.println("Area of Trangle is : " + areaOfTrangle);
    }
}
