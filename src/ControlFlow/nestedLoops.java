package project.one;
import java.util.Scanner;

public class nestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//nested loops - loop inside another loop
		for(int j = 1 ; j <= 3; j ++) {
			for(int i = 1 ; i <= 9; i ++) {
			System.out.print(i+" ");
		}
			System.out.println();
	}
		
		//user input matrix
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int rows = sc.nextInt();
		sc.nextLine(); //to clear buffer
		System.out.print("Enter the number of cols : ");
		int cols = sc.nextInt();
		System.out.print("Enter the symbol : ");
		char c = sc.next().charAt(0); //returns the character at index 0
		
		for(int j = 1 ; j <= rows; j ++) {
			for(int i = 1 ; i <= cols; i ++) {
			System.out.print(c+" ");
		}
	   System.out.println();
	}
		
		sc.close();

	}
}
