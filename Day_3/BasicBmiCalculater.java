import java.util.Scanner;

public class BasicBmiCalculater {
    public static void main(String[] args){
        float Weight;
        float Height;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        Weight = input.nextFloat();

        System.out.print("Enter your height in meters: ");
        Height = input.nextFloat();


        double bmi = Weight / (Height * Height);
        System.out.println("Your BMI is:"+ bmi);

    }
}
