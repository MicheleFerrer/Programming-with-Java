/*Write a program that takes a string as input 
and prints the string in reverse*/

public class Seven{
    public static void main(String[] args) {
        String originalStr = "Hello";
        String reversedStr = "";
        int i;

        // Creating a Loop to print the reversed string
        for (i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        // Print the reversed string
        System.out.println("The reversed string is: " + reversedStr);
    }
}
