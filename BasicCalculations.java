/* Mohammed Qutu
Basic arithmetic operations and random number generation
*/

public class BasicCalculations {

    // Method to generate a random number between two values
    public static int generateRandomNumber(int a, int b) {
        double range = (Math.abs(a - b) + 1);
        if (a <= b) {
            return (int) (Math.random() * range + a);
        } else {
            return (int) (Math.random() * range + b);
        }
    }

    // Method for addition
    public static double add(double n1, double n2) {
        return n1 + n2;
    }

    // Method for subtraction
    public static double subtract(double n1, double n2) {
        return n1 - n2;
    }

    // Method for multiplication
    public static double multiply(double n1, double n2) {
        return n1 * n2;
    }

    // Method for division
    public static double divide(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return n1 / n2;
    }
}
