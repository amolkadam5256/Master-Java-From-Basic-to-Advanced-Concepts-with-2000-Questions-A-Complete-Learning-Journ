import java.util.Scanner;

public class Q36_DimensionsConeValume {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter radius  of Cone :");
        double radius = input.nextInt();

        System.out.print("Enter height  of Cone :");
        double height = input.nextInt();

        double ConeVolume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
        System.out.println(String.format("Volume of the cone is: %.2f", ConeVolume));
        input.close();
    }
}