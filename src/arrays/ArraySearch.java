package project.two;

public class ArraySearch {

	public static void main(String[] args) {
		// Creating an array to work with
		
		System.out.println("1. An array of integers");
		int[] numbers = {1, 7, 4, 8, 3, 9, 2, 10};
		int target = 31;
		boolean isFound = false;
		//linear search
		for(int i = 0 ; i < numbers.length ; i++) {
			if(target == numbers[i]) {
				System.out.printf("target : %d ; found at index : %d ",target, i);
				isFound = true;//when the target is found, the 'isFound' variable is set to true
				break;//we immediately exit the for loop once the the target is found
			}
		}
		
		//if we exit the loop without finding the element
		if(!isFound) {
			System.out.println("Element not found in the array");
		}
		
		
		System.out.println("\n2. An array of strings");
		//iterating through an array of strings
		String[] fruits= {"apple", "mango", "orange"};
		String targetf = "apple";
		boolean isFoundf = false;
		//linear search
		for(int i = 0 ; i < fruits.length ; i++) {
			if(targetf.equals(fruits[i])) {// we cannot use'target == fruits[i]' because that expression would compare their memory addresses
				//because strings are reference data types unlike integers(which was the previous case)
				System.out.printf("target : %s ; found at index : %d ",targetf, i);
				isFoundf = true;//when the target is found, the 'isFound' variable is set to true
				break;//we immediately exit the for loop once the the target is found
			}
		}
		//if we exit the loop without finding the element
		if(!isFoundf) {
			System.out.println("Element not found in the array");
		}

	}
}
