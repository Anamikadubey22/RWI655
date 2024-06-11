package june11;
import java.util.*;

class YongerAgeException extends Exception { // Extend Exception instead of RunTimeException
    YongerAgeException(String msg) {
        super(msg);
    }
}

public class Throw {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = s.nextInt();
        try {
            if (age < 18) {
                throw new YongerAgeException("You are not eligible for voting.");
            } else {
                System.out.println("You can vote successfully.");
            }
        } catch (YongerAgeException e) {
            e.printStackTrace(); // printStackTrace() is a method of Throwable
        }
        System.out.println("Hello");
    }
}