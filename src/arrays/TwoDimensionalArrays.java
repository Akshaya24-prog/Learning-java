package project.two;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		// 2D array = An array where each element is an array
		// Useful for storing a matrix of data
		
		String[] fruits = {"apple", "orange", "banana", "pineapple"};
		String[] vegetables = {"potato", "onion", "spinach", "carrot"};
		String[] meats = {"chicken", "pork", "fish", "mutton"};
		
		
		//creating a 2D array (an array of arrays)
		String[][] groceries = {fruits, vegetables, meats};//a matrix of data

		//displaying the elements of the array using an enhanced for loop
		for(String[] foods : groceries) {
			System.out.println(foods); //prints the memory addresses of the respective arrays
		}
		
		
		System.out.println("\nDisplaying the array : ");
		for(String[] foods : groceries) {
			for(String food : foods ) {
				System.out.print(food + " ");
			}
			System.out.println();
		}
		
		//altering the elements of a matrix -- 'matrixName[row][col]'
		groceries[0][0] = "papaya";//altering the row - 0, col - 0
		groceries[1][2] = "tomato";//altering the row - 1, col - 2
		
		
		
		//creating an array of characters - having 4 rows
		
		char[][] telephone = { 
				{'1', '2', '3'}, 
				{'4', '5', '6'}, 
				{'7', '8', '9'}, 
				{'*', '0', '#'} 
				};
		System.out.println("\nDisplaying a telephone keypad");
		for(char[] row: telephone) {
			for( char number : row) {
				System.out.print(number + " ");
			}
			System.out.println();
		}
		
	}

}
