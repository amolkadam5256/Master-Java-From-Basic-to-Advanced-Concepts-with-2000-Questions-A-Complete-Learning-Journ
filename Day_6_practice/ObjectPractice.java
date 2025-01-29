package Day_6_practice;

import Day_5_Pratic.CarMain;

public class ObjectPractice {
    public static void main(String[] args) {
        Car obj = new Car(); // Creating object of Car class
        System.out.println(obj.name); // Accessing instance variable
        obj.myWork(); // Calling method
        obj.myWorkClose(); // Calling another method
        
        
        CarMain obj2 = new CarMain(); // Creating object of Car class
        System.out.println("Acces another package class "); // Accessing instance variable
        System.out.println(obj2.name2); // Accessing instance variable
        System.out.println(obj2.place); // Accessing instance variable
        obj2.getAge2();
        obj2.myWork2();
    }

}
