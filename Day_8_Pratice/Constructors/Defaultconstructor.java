package Day_8_Pratice.Constructors;

public class Defaultconstructor {

    String name;
    int age;

    public Defaultconstructor() {
        this.name = "Amol Kadam";
        this.age = 32;
    }

    public static void main(String[] args) {
        System.out.println("Default Constructor");
        
        Defaultconstructor d1 = new Defaultconstructor();
        
        System.out.println("Name :"+ d1.name);
        System.out.println("age :"+ d1.age);
    }
}
