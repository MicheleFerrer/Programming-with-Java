
public class main{
    //Declaring instance variables
    String name;
    String identity;
    int age;
    
   public static void main(String[] args) {
    System.out.println("hi world");
    
//String name = "daniela";
//int age = 30;
main myObj = new main();
myObj.name = "daniela ";
myObj.identity = "is : ";
myObj.age = 25;
System.out.print(myObj.name);
System.out.print(myObj.identity);
System.out.println(myObj.age);

//System.out.println("daniela is " + age);
/*int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}*/
 

        int maxScore = 500;
        int userScore = 407;

        float percentage = (float) userScore / maxScore * 100.0f;
        System.out.println("user's percentage is " + percentage);
    }
}