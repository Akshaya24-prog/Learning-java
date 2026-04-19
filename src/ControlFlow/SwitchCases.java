package project.one;
import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		//Switch statements can be used as replacement for many if statements

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the day : ");
		String day = sc.nextLine();
		
		System.out.println("Using '->'");
		switch(day) {
		// -> can be used
		case "Monday" -> System.out.println("It is a weekday");
		case "Tuesday" -> System.out.println("It is a weekday");
		case "Wednesday" -> System.out.println("It is a weekday");
		case "Thursday" -> System.out.println("It is a weekday");
		case "Friday" -> System.out.println("It is a weekday");
		case "Saturday" -> System.out.println("It is a weekend");
		case "Sunday" -> System.out.println("It is a weekend");
		default -> System.out.println(day + " is not a day");
			
		}
		System.out.println();
		System.out.println("Using ':'");
		switch(day) {
		// if : is used, a 'break' statement must be written after the switch case.
		// if 'break' is not used, all the statements below the correct case will be printed.
		case "Monday" : 
			System.out.println("It is a weekday");
			break;
		case "Tuesday" :
			System.out.println("It is a weekday");
			break;
		case "Wednesday" : 
			System.out.println("It is a weekday");
			break;
		case "Thursday" : 
			System.out.println("It is a weekday");
			break;
		case "Friday" : 
			System.out.println("It is a weekday");
			break;
		case "Saturday" : 
			System.out.println("It is a weekend");
			break;
		case "Sunday" : 
			System.out.println("It is a weekend");
			break;
		default : 
			System.out.println(day + " is not a day");
			//no 'break' statement is required, it is the last statement.
			
			
		}
		
		System.out.println();
		System.out.println("Removing the duplicate case statements : ");
		switch(day) {
		case "Monday", "Tuesday" ,"Wednesday" ,"Thursday" ,"Friday" : 
			System.out.println("It is a weekday");
			break;
		case "Saturday","Sunday" : 
			System.out.println("It is a weekend");
			break;
		default : 
			System.out.println(day + " is not a day");
		}
	}

}
