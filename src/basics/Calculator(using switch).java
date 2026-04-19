package project.one;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		double n1 = sc.nextDouble();
		System.out.print("Enter the 2nd number : ");
		double n2 = sc.nextDouble();
		System.out.print("Enter the operator (+, -, /, %, *, ^ ) : ");
		char operator = sc.next().charAt(0);
		//whatever the user types, only the character at index '0' is taken as the value for the variable
		
		double result = 0;
		boolean validOperator = true;
		
		switch(operator) {
		case '+' -> result = n1 + n2;
		case '-' -> result = n1 - n2;
		case '/' -> {
		if(n2 ==0) {
			System.out.println("Cannot divide by zero ");
			validOperator = false;
		}
		else{
			result = n1 / n2;
		}
		}
		case '%' -> result = n1 % n2;
		case '*' -> result = n1 * n2;
		case '^' -> result = Math.pow(n1,  n2);
		default -> validOperator = false;
		}
		
		if(validOperator) {
		System.out.printf("The result is %.3f", result);
		}
		else {
			System.out.println("Invalid operator ");
		}
		
		sc.close();
		

	}

}
