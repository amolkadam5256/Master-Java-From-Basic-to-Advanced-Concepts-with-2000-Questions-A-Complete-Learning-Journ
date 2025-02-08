package Day_6_practice;

class MyCar {
    String model;
    double fuel;
    double mileage;
    double speed;

    // Constructor
    public MyCar(String model, double mileage) {
        this.model = model;
        this.mileage = mileage;
        this.fuel = 0; // Default fuel level
        this.speed = 0; // Default speed
    }

    // Method to refuel the car
    public void refuel(double liters) {
        this.fuel += liters;
        System.out.println("Refueled " + liters + " liters. Current fuel: " + this.fuel + " liters.");
    }

    // Method to drive the car
    public void drive(double distance) {
        double fuelNeeded = distance / this.mileage;

        if (this.fuel >= fuelNeeded) {
            this.fuel -= fuelNeeded;
            System.out.println("Drove " + distance + " km. Fuel left: " + this.fuel + " liters.");
        } else {
            System.out.println("Not enough fuel to drive " + distance + " km.");
        }
    }

    // Method to accelerate
    public void accelerate(double increaseSpeed) {
        this.speed += increaseSpeed;
        System.out.println("Accelerated. Current speed: " + this.speed + " km/h");
    }

    // Method to brake
    public void brake() {
        this.speed = 0;
        System.out.println("Car stopped. Current speed: " + this.speed + " km/h");
    }

    // Method to display car details
    public void displayCarInfo() {
        System.out.println("Model: " + this.model + ", Mileage: " + this.mileage + " km/l, Fuel: " + this.fuel
                + " liters, Speed: " + this.speed + " km/h");
    }
}
