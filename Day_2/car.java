/**
 * The Car class represents a car with basic attributes and functionality.
 * It includes properties like the number of wheels, color, maximum speed,
 * current fuel level, and the number of seats. It also provides methods
 * to drive the car, add fuel, and check the current fuel level.
 */
class Car {
    // Attributes of the car
    int noOfWheels;    // Number of wheels the car has
    String color;      // Color of the car
    float maxSpeed;    // Maximum speed the car can achieve
    float currentFuel; // Current fuel level of the car
    int noOfSeats;     // Number of seats in the car

    /**
     * Simulates driving the car.
     * Prints a message indicating the car is being driven.
     */
    public void drive() {
        System.out.println("Car is driving.");
    }

    /**
     * Adds fuel to the car's fuel tank.
     * @param fuel The amount of fuel to add (in liters).
     */
    public void addFuel(float fuel) {
        currentFuel += fuel; // Increase the current fuel level by the specified amount
    }

    /**
     * Retrieves the current fuel level of the car.
     * @return The current fuel level as a float.
     */
    public float getCurrentFuelLevel() {
        return currentFuel; // Return the current fuel level
    }
}
