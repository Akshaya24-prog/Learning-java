package project.two;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		// ROCK PAPER SCISSORS GAME
		
		//declare variables
		//get user choice
		//get random choice for the computer
		//check win condition
		//ask to play again
		//goodbye message
		
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();// create Random object since its methods (like nextInt) are non-static and require an instance
		
		String[] choices = {"rock", "paper", "scissors" };
		String playerChoice;
		String computerChoice;
		String playAgain = "yes";
		
		
		do {
			System.out.print("Enter your move (rock, paper, scissors) : ");
			playerChoice = sc.nextLine().toLowerCase();
			
			if(!playerChoice.equals("rock") && 
					!playerChoice.equals("paper") &&
					!playerChoice.equals("scissors")) {
				System.out.println("Invalid choice");
			}
			
			computerChoice = choices[rand.nextInt(3)]; //range of the array is 0 - 3
			System.out.println("Computer Choice : "+computerChoice);
			
			if(computerChoice.equals(playerChoice)) {
				System.out.println("It's a tie");
			}
			else if(
					(playerChoice.equals("rock") && computerChoice.equals("scissors"))||
					(playerChoice.equals("paper") && computerChoice.equals("rock"))||
					(playerChoice.equals("scissors") && computerChoice.equals("paper"))
					){
			    System.out.println("You win!");}
			else{
			    System.out.println("You lose!");
			}
			
			System.out.print("Play again y/n : ");
			playAgain = sc.nextLine();
			
			
		} while(playAgain.toLowerCase().equals("y"));
		
		System.out.println("thanks for playing");
		
		sc.close();
	}

	}
