/*
 * Simple Calculator using if-else
 * Performs basic arithmetic operations
 */

public class SimpleCalculator {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        char operator = '+'; // Change this to test: +, -, *, /

        if (operator == '+') {
            System.out.println("Addition: " + (a + b));

        } else if (operator == '-') {
            System.out.println("Subtraction: " + (a - b));

        } else if (operator == '*') {
            System.out.println("Multiplication: " + (a * b));

        } else if (operator == '/') {
            if (b != 0) {
                System.out.println("Division: " + (a / b));
            } else {
                System.out.println("Cannot divide by zero");
            }

        } else {
            System.out.println("Invalid operator");
        }
    }
}
