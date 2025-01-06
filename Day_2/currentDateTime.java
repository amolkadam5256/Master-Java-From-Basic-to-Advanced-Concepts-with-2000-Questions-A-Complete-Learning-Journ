import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class currentDateTime {
    public static void main(String[] args){

                // Get the current date and time
                LocalDateTime currentDateTime = LocalDateTime.now();

                // Format the date and time in a readable way
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

                // Print the formatted date and time
                System.out.println(currentDateTime.format(formatter));

    }
}
