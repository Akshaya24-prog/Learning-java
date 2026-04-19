package project.one;

public class stringMethods {

	public static void main(String[] args) {

		String name = "Moana";
		
		//getting the length
		int length = name.length();
		System.out.println("Length of the string is "+length);
		
		//gives the letter at a  specific index
		char letter = name.charAt(0);
		System.out.println("The character is "+letter);
		
		//finding the index of the first occurance a character
		int index = name.indexOf("a");
		System.out.println("the first occurance of a is at "+index);
		
		//finding the index of the last occurance a character
		int lastIndex = name.lastIndexOf("a");
		System.out.println("The last occurance of a is at "+lastIndex);
	
		//convert entire string to upper case
		String name_upper = name.toUpperCase();
		System.out.println("In upper case : "+name_upper);
		
		//convert entire string to lower case
		String name_lower = name.toLowerCase();
		System.out.println("In lower case : "+name_lower);
		
		
		
		String location ="    College   ";
		System.out.println("Before removal of white spaces : "+location);
		//eliminating white spaces
		location = location.trim();
		System.out.println("After removal of white spaces : "+location);
		
		//replacing characters
		location = location.replace("e","a");
		System.out.println("After replacement : "+location);
		
		//to check if a string is empty
		System.out.println("The string is empty. : "+location.isEmpty());
		
		//to check if string contains any character
		System.out.println("does the string contain 'j' ? "+location.contains("j"));
	
		
		//to check if 2 strings are equal
		String s1 = "Happy";
		String s2 = "Happy";
		System.out.println("Are the strings s1 and s2 equal ? "+ s1.equals(s2));
		
	}

}
