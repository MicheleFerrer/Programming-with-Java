public class Fourth {
static void checkAge(int age) {
    if (age < 18) {
        throw new ArithmeticException("access denied, youre are too young to vote.");
    } else{
        System.out.println("Acess granted, youre old enough to vote");
    }
}
public static void main(String[] args) {
    checkAge(15);
}
}

