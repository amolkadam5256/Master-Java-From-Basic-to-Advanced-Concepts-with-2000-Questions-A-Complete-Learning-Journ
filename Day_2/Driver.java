public class Driver {
    public static void main(String[] args){

        Car myCar = new Car();
        myCar.color = "Red";
        Display(myCar.color);
        myCar.drive();
    }


    public static void Display(String color){
        System.out.println(color);
    }
}
