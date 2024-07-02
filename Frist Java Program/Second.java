/*import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Second{
    public static void main(String[]args){
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedTime = myObj.format(myFormatObj);
        System.out.println("After time formatting: " + formattedTime);
    }
}*/
import java.util.Scanner; 
public class Second {
    public static void main(String[] args) {
        float x, y, z, sum;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Type a number:");
        x = myObj.nextFloat();

        System.out.println("Type another number:");
        y = myObj.nextFloat();

        System.out.println("Type last number:");
        z = myObj.nextFloat();

        sum = x + y + z;
        System.out.print("The sum of three float numbers is: " + sum);
    /*int x = 5;
    int y = 10;
    int sum = x + y;
    System.out.println(sum);*/
    }
}


