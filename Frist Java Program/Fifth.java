
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