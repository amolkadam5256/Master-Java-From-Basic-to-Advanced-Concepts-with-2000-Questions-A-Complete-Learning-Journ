import java.util.Scanner;

public class Q37_carjourney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Distance (in km) :");
        float Distance = input.nextFloat();

        System.out.print("Enter Fuel Efficiency (in km/l) :");
        float Fuel = input.nextFloat();

        float TotalFuelNeeded = Distance / Fuel;
        System.out.println("Total Fuel Needed For Car:" + TotalFuelNeeded + " liters");
        input.close();
    }
}
