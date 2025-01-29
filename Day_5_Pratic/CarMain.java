package Day_5_Pratic;

public class CarMain {

    public String name2 = "Amit Tukaram Kadam"; // Public variable
    public String place = "Pune"; // Public variable
    private int age2 = 292; // Private variable (not accessible outside)

    public void myWork2() {
        System.out.println("Going to Work");
    }

    public int getAge2() { // Public getter to access private variable
        return age2;
    }

}
