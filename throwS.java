package june12;

public class throwS {

    public static void main(String[] args) {
        try {
            // Call the method that might throw ArithmeticException
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception if division by zero occurs
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }
    }

    // Method to perform division, might throw ArithmeticException
    public static int divide(int numerator, int denominator) throws ArithmeticException {             // throw exception just to tell you that it may throw exception 
        // If denominator is zero, this will throw ArithmeticException                                // so handle it accordingly
        return numerator / denominator;
    }
}