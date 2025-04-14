package Day_8_Pratice.PackagePratice.package2;

public class CarData {

    String brand;
    String model;
    int year;
    String color;
    double mileage;

    // ✅ Constructor name must match the class name 
    // if you use public void CarData it is method it is not Constructor
    public  CarData(String brand, String model, int year, String color, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color; 
        this.mileage = mileage;
    }

    public void displayCarInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Mileage: " + mileage + " km/l");
    }
}
