import java.util.Scanner;

public class Q15AreaOfCircle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final  double Pi = 3.14159;
        System.out.print("Radius of circle is :");
        int r = input.nextInt();

        double area = (r * r  * Pi);
        System.out.println("Area of Circle Is : "+ area);
    }
}
