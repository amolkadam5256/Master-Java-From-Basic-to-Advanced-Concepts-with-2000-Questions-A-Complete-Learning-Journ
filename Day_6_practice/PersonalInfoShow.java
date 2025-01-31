package Day_6_practice;

public class PersonalInfoShow {
    public static void main(String[] args){

        System.out.println("Call Object Perssonal Info ?");
        
        PersonalInfo obj1 = new PersonalInfo();
        System.out.println("My full name is : "+ obj1.name);
        
        
        //  call method or constructor 
        
        obj1.Display();
        
        System.out.println();
        obj1.name= "amit kadam";
        System.out.println("My full name is : "+ obj1.name);
        obj1.Display();
    }
}
