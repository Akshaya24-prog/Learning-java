package project.two;
import java.util.Scanner;
public class ArrayInputs {

	public static void main(String[] args) {
		// User input into array
		
		String[] ARRAY = {};//creating an empty array
		System.out.println("Length of the array 'ARRAY' : "+ARRAY.length);
		
		Scanner sc = new Scanner(System.in);

		//method to create an array and later assign values at specific indices
		System.out.print("Enter the number of food items to be entered : ");
		int n = sc.nextInt();
		sc.nextLine();//to clear buffer
		
		// An empty array that has space for n values 
		String[] foods = new String[n];
		
		System.out.println("\nEntering values into the array");
		for(int i = 0 ; i < n ; i++ ) {
			System.out.print("Enter a food : ");
			foods[i] = sc.nextLine(); 
		}
		System.out.println("The elements in the array are : ");
		for(String food: foods) {
			System.out.println(food);
		}
	
	}

}
