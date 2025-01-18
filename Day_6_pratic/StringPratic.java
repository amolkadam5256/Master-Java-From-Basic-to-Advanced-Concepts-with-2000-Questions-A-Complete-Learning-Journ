package Day_6_pratic;

public class StringPratic {
    public static void main(String[] args) {

        String firstName = "Amol ";
        System.out.println("Mu Name is : " + firstName);
        String fullName;
        fullName = firstName + "Tukaram Kadam";
        System.out.println("Full Name is : " + fullName);

        System.out.println(fullName.length());

        String str1, str2;
        str1 = "amol";
        str2 = "amol";

        // str1= str1.concat(str2);
        // System.out.println(str1);

        System.out.println(str1.equals(str2));

        String str3 = " Amol Tukaram Kadma ";
        System.out.println("put first name in give string : " + str3.substring(0, str3.lastIndexOf("l")));

        System.out.println("My full name in : toUpperCase is :" + str3.toUpperCase());
        System.out.println("My full name in : toLowerCase is :" + str3.toLowerCase());

        System.out.println("My full name in : trim remove all space staring and ending space  is :" + str3.trim());

        System.out.println(
                "My full name in : Relpace amol to amit using replace string  is :" + str3.replace("Amol", "Amit"));

        System.out.println("contains(): Checks if the string contains a specific sequence of characters string  is :"
                + str3.contains("Amol"));

    }

}
