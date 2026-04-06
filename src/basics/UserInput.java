package project.one;
import java.util.Scanner;//Scanner class is imported to accept inpute

public class UserInput {

	public static void main(String[] args) {
		
		//creation of scanner object 
		Scanner sc = new Scanner(System.in);
		
		//Reading full line
		System.out.print("Enter your name : ");// prompts the user to enter their name
		String name = sc.nextLine();// reads the full line of input (including spaces) and stores it in the variable 'name'
		System.out.println("Hello "+name);
		
		//Reading single word
		System.out.print("Enter your full name : ");
		String FName = sc.next(); // does not read spaces, and the content after the space
		System.out.println("Hello "+FName);// only the word before the first space is printed
		
		//Reading integer
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Your age is : "+age);
		
		//Reading decimal
		System.out.print("Enter a decimal: ");
		double d = sc.nextDouble();
		System.out.println("The decimal number is : "+d);
		
		//Reading long - don't input decimals
		System.out.print("Enter a large number: ");
		long L = sc.nextLong();
		System.out.println("The Long data is : "+L);
		
		//reading boolean
		System.out.print("Are you a student ? (true/false)");
		boolean ans = sc.nextBoolean();
		System.out.println("Student : "+ans);
		
		
		
		//common issues -- After you call sc.nextInt(), the newline character (\n) from pressing Enter is still sitting in the input buffer. 
		//So when you immediately call sc.nextLine(), it consumes that leftover newline instead of waiting for the user’s actual food input. 
		//That’s why food ends up being empty.
		System.out.print("Enter your favourite number : ");
		int qty = sc.nextInt();
		
		System.out.print("Enter your favourite food : ");
		String food = sc.nextLine();
		
		System.out.println("Your meal  "+food+" : "+qty );
		
		/*------------------------------------------------
		 * note : 
		 *------------------------------------------------
		 
		 the problem shows up specifically when you mix nextInt(), nextDouble(), nextLong(), etc. with nextLine().
		 reason : 
		 1. Methods like nextInt(), nextDouble(), nextLong() only consume the numeric token, not the newline (\n) that follows when you press Enter.
		 2. nextLine() is designed to read the entire line up to the newline. So if a newline is still sitting in the buffer, nextLine() will immediately return an empty string without waiting for user input.

		 general rule : 
		 1. If you’re mixing nextInt(), nextDouble(), nextLong() with nextLine(), always add a sc.nextLine() right after the numeric read to clear the buffer.
		 2. If you stick to next() for strings (instead of nextLine()), you don’t hit this issue because next() skips whitespace and reads the next token.
		 
		 -------------------------------------------------*/
		
		
		//fix
		System.out.println("Fixed version : ");
		System.out.print("Enter your favourite number : ");
		int qtyx = sc.nextInt();
		sc.nextLine(); // consumes the leftover newline, and clears the input buffer
		
		System.out.print("Enter your favourite food : ");
		String foodx = sc.nextLine();
		
		System.out.println("Your meal  "+foodx+" : "+qtyx );
		
		
		sc.close();// Closing the Scanner frees system resources and prevents memory leaks, but also closes System.in so no further input can be taken
		
		
	}

}
