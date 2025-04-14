package Day_8_Pratice.Example.Package2;

public class PersonalInfo {
    String fullName;
    int age;
    String gender;
    String place;
    String phoneNo;

    public PersonalInfo(String fullName, int age, String gender, String place, String phoneNo) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.place = place;
        this.phoneNo = phoneNo;
    }

    public void Mydata() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Place: " + place);
        System.out.println("Phone Number: " + phoneNo);
    }
}
