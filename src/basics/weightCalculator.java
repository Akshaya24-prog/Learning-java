package project.one;
import java.util.Scanner;


//converting pounds to kilograms and vice-versa using a menu driven program
public class weightConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double weight;
		double newWeight;
		int choice = 1;
		
		
		while (true) { //executes as long as the entry is not zero
			System.out.println("1. Pounds to Kilograms ");
			System.out.println("2. Kilograms to Pounds");
			System.out.println("0. Exit");
			System.out.println();
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			if(choice == 1) {
			System.out.print("Enter the weight in pounds : ");
			weight = sc.nextDouble();
			newWeight = weight * 0.45359237;
			System.out.printf("The new weight is %.2f kg%n%n", newWeight);			}
			else if (choice == 2) {
			System.out.print("Enter the weight in kilograms : ");
			weight = sc.nextDouble();
			newWeight = weight / 0.45359237;
			System.out.printf("The new weight is %.2f pounds%n%n", newWeight);
			}
			else if(choice == 0){
				System.out.println("Exiting");
				break;
			}
			else {
				System.out.println("Enter a valid input");
			}
						
		}
		
		
		sc.close();
		

	}

}
