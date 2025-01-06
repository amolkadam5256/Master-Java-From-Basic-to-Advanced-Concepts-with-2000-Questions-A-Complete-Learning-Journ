import java.util.Scanner;

public class volumeCuboid  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter length of the cuboid: ");
        float l = input.nextFloat();
        System.out.print("Enter width of the cuboid: ");
        float w = input.nextFloat();
        System.out.print("Enter height of the cuboid: ");
        float h = input.nextFloat();

        // Call the volume method and store the result
        float volumeValue = volume(l, w, h);

        // Print the result
        System.out.println("The volume of the cuboid is: " + volumeValue);

        // Close the scanner
        input.close();
    }

    static float volume(float length, float width, float height) {
        float value = length * width * height;
        return value;
    }
}