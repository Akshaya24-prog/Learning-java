package project.two;
import java.util.Scanner;
public class bankingProgram {

	public static void main(String[] args) {
		//declare variables
		Scanner sc = new Scanner(System.in);
		double balance = 0;
		boolean isRunning = true;//to keep the while loop running
		int choice;
	
	while(isRunning) {	//get and process user's choice
		//display menu
		System.out.println("\n**************");
		System.out.println("BANKING SYSTEM");
		System.out.println("**************");
		System.out.println("1.Show balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
		System.out.println("**************");
		
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			showBalance(balance);
			break;
		case 2 :
			System.out.print("Enter amount to deposit");
			double deposit = sc.nextDouble();
			
			if(deposit < 0) {
				System.out.println("Amount cannot be negative");
			}
			else {
				balance = deposit(balance, deposit); // Java uses pass-by-value, so we must return and reassign balance
				System.out.printf("remaining : $ %.3f ", balance);
			}
			
			break;

		case 3 :
			System.out.print("Enter amount to withdraw");
			double amt = sc.nextDouble();
			
			if(amt < 0) {
				System.out.println("Amount cannot be negative");
			}
			else if(amt>balance) {
				System.out.printf("Only $%.3f is there in your account",balance);
			}
			else {
				balance = withdraw(balance, amt);
				System.out.printf("remaining : $ %.3f ", balance);
			}
			
			break;
		case 4 : 
			System.out.println("Thanks for using the system");
			isRunning = false;
			break;
		default:  
			System.out.println("Invalid choice");
		}
	}
		
		//exit message
		
		
		sc.close();

	}
	//1. showBalance()
	static void showBalance(double balance) {
		System.out.printf("$ %.3f ", balance);
	}
	
	//2.deposit()
	static double deposit(double balance, double deposit) {
		balance = balance + deposit;
		return balance; // Java uses pass-by-value, so return the updated balance and assign it back
		
	}
	
	//3. withdraw()
	static double withdraw(double balance, double amt) {
		balance = balance - amt;
		return balance; 
	}
	
	

}
