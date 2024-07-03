
import java.util.Scanner;


public class Fifth{
    public static void main(String[] args){
        int x, y, sum;
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Type your number here:");
        x = myObj.nextInt();

        System.out.println("Type last number here:");
        y = myObj.nextInt();

        sum = x + y;
        System.out.println("The sum of two numbers is:" + sum);
        
    }
}

/*
Proper indentation and spacing.
Closing the Scanner object to prevent resource leaks.
Adding a comment for better understanding.
*/ 

// Revised code:
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner myObj = new Scanner(System.in);
        
        // Prompt user to enter the first number
        System.out.println("Enter the first number:");
        x = myObj.nextInt();

        // Prompt user to enter the second number
        System.out.println("Enter the second number:");
        y = myObj.nextInt();

        // Calculate the sum of the two numbers
        sum = x + y;
        
        // Display the sum
        System.out.println("The sum of the two numbers is: " + sum);

        // Close the scanner
        myObj.close();
    }
}
