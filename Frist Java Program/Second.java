import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Second{
    public static void main(String[]args){
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedTime = myObj.format(myFormatObj);
        System.out.println("After time formatting: " + formattedTime);
    }
}
