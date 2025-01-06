import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Area of Triangle (h * b) / 2: Enter height and base values");

        Scanner input = new Scanner(System.in);
        double height  = input.nextDouble();
        double base  = input.nextDouble();

        double areaOfTriangle = (height * base) / 2;
        System.out.println("Area of Triangle is: " + areaOfTriangle);
    }
}
