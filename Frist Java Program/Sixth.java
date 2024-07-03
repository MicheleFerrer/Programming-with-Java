// Practice Program: Sum of an Array
public class Sixth{
    public static void main(String[] args) {
    int [] myArray = {2, 4, 6, 8};
    int i;
    int sum = 0;
// Loop through an array elements to calculate the sum:
for (i = 0; i < myArray.length; i++) {
    sum += myArray[i];
}
// Print the sum of array elements:
    System.out.println("The sum of the array is:" + sum); 
    }

}