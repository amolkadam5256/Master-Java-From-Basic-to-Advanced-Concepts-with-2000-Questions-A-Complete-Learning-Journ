import java.util.Scanner;

public class Q21_AreaRec {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of Rectangle : " );
        int length = input.nextInt();

        System.out.print("Enter Width of Recangle :  ");
        int width = input.nextInt();


        int area = length * width;
        System.out.println("Area of Recangle :  " + area    );

        int PerimeterOfRec =2* (length + width);
        System.out.println("Perimeter  of Recangle :  " + PerimeterOfRec);

    }
}
