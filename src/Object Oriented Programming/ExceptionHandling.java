package project.three;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		 /*
         * Exception:
         * An event that disrupts the normal flow of a program
         * (e.g., divide by zero, invalid input)
         *
         * try → risky code
         * catch → handles exception
         * finally → always executes
         */

		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter a number: ");
            int number = sc.nextInt();

            int result = 5 / number;  // risky line
            System.out.println("Result: " + result);
		}
		catch(ArithmeticException e) {
			// Handles divide by zero
			System.out.println("Cannot divide by zero");
		}
		catch(Exception e) {
			// Handles any other exception (like wrong input)
			System.out.println(e);
		}
		finally { // Always executes (whether exception occurs or not)
			sc.close();//this can be placed here, cuz it might not close if an exception is thrown
			System.out.println("This always executes");
		}

		
		
	}

}
