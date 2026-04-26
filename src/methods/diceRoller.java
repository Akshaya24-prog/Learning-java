package project.two;
import java.util.Scanner;
import java.util.Random;
public class diceRoller {

	public static void main(String[] args) {
		System.out.println(" Item 1");
		//declare variables
		Scanner sc = new Scanner(System.in);
		Random r = new Random();// create Random object since its methods (like nextInt) are non-static and require an instance
		int numOfDice ; //to calculate the number of dice being rolled
		int total = 0;
		
		//get number of dice
		System.out.print("Enter the number of dice to roll : ");
		numOfDice = sc.nextInt();
		
		if(numOfDice > 0) {//check if greater than zero
			System.out.println("You rolled the dice");
			for(int i = 0; i<numOfDice; i++) {// loop through each die and roll it
				int roll = r.nextInt(1, 7);// returns a random number from 1 (inclusive) to 7 (exclusive) -> 1 to 6
				System.out.println("You rolled : "+roll);
				printDice(roll);
				
				total = total + roll;// add current roll to total
			}
			System.out.println("Total : "+total);
		}
		else {
			System.out.println("Number of dice must be greater than 0");
		}
		
		
		sc.close();
	}
	
		//creating a multiline string
		static void printDice(int roll) {

		    String dice1 = """ 
		         -------
		        |       | 
		        |   •   | 
		        |       | 
		         -------
		        """;

		    String dice2 = """ 
		         -------
		        | •     | 
		        |       | 
		        |     • | 
		         -------
		        """;

		    String dice3 = """ 
		         -------
		        | •     | 
		        |   •   | 
		        |     • | 
		         -------
		        """;

		    String dice4 = """ 
		         -------
		        | •   • | 
		        |       | 
		        | •   • | 
		         -------
		        """;

		    String dice5 = """ 
		         -------
		        | •   • | 
		        |   •   | 
		        | •   • | 
		         -------
		        """;

		    String dice6 = """ 
		         -------
		        | •   • | 
		        | •   • | 
		        | •   • | 
		         -------
		        """;
		//display the structure of the dice
		switch(roll) {
		case 1 -> System.out.println(dice1);
		case 2 -> System.out.println(dice2);
		case 3 -> System.out.println(dice3);
		case 4 -> System.out.println(dice4);
		case 5 -> System.out.println(dice5);
		case 6 -> System.out.println(dice6);
		}
		
	}

}
