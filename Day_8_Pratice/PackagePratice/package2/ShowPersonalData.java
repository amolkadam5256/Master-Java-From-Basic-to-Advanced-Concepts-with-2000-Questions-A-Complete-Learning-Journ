package Day_8_Pratice.PackagePratice.package2;

public class ShowPersonalData {

    String fullName;
    int age;
    String gender;

    // Method to add personal info
    public ShowPersonalData(String fullName, int age, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    // Method to display personal info
    public void displayInfo() {
        System.out.println("Personal Information:");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

}
