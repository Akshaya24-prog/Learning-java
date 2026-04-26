package project.two;
import java.util.Scanner;
import java.util.Random;

public class QuizGame {

	public static void main(String[] args) {
		// Java Quiz Game
		
		//Questions array[]
		//options array[][]
		//declare variables
		//welcome message
		//question(loop)
			//options
			//get guess from user
			//check out guess
		//display final score
		
		String[] questions = {
				"What is the capital of France?",
				"What is 5 + 7?",
				"Who wrote 'Romeo and Juliet'?", 
				"What is the largest ocean on Earth?",
				"Which is the largest planet in out solar system ? "
		};
		
		String[][] options = {
			    {"1. Milan", "2. Paris", "3. Rome", "4. Berlin"},
			    {"1. 10", "2. 11", "3. 12", "4. 13"},
			    {"1. Charles Dickens", "2. William Shakespeare", "3. Mark Twain", "4. Jane Austen"},
			    {"1. Atlantic Ocean", "2. Indian Ocean", "3. Arctic Ocean", "4. Pacific Ocean"},
			    {"1. Earth", "2. Mars", "3. Jupiter", "4. Saturn"}
			};

		int[] answers= {2, 3, 2, 4, 3};
		
		int score = 0;
		int guess;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n******************************");
		System.out.println("Welcome to the java Quiz game !");
		System.out.println("\n******************************");

		for(int i = 0 ;i < questions.length ; i++ ) {
			System.out.println("\n"+questions[i]);
			
			for(String option:options[i]) {
				System.out.println(option);
			}
			System.out.print("Enter your guess : ");
			guess = sc.nextInt();
			sc.nextLine();
			
			if(guess == answers[i]) {
				System.out.println("*********");
				System.out.println("CORRECT !");
				System.out.println("*********");
				score +=1;
			}
			else {
				System.out.println("***********************************");
				System.out.println("Wrong! Correct answer is option " + answers[i]);
				System.out.println("***********************************");
			}
			
			
		}
		System.out.printf("Your final score is %d /5", score);
		
		
		
		sc.close();
		
	}

}
