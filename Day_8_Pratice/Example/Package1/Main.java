package Day_8_Pratice.Example.Package1;

import  Day_8_Pratice.Example.Package2.PersonalInfo;

public class Main {
    public static void main(String[] args) {
        System.out.println("We are practicing how to access a class from another package with an example.");

        // Access class from Package2
        // ShowPersonalData data = new ShowPersonalData();
        // data.addInfo("Amol Tukaram Kadam", 22, "Male");
        // data.displayInfo();

        PersonalInfo data = new PersonalInfo("Amol Kadam", 22, "Mail", "pune", "7709266280");
        data.Mydata();
    }
}
