/*public class Fourth {
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

public class Fourth extends Thread {
    public static void main(String[] args) {
        Fourth thread = new Fourth();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
      System.out.println("this code is running in a thread");
     }
  }
*/

import java.util.ArrayList;
import java.util.function.Consumer;

public class Fourth {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    Consumer<Integer> method = (n) -> { System.out.println(n); };
    numbers.forEach( method );
  }
}