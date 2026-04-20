package project.one;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using for loop
		String str1 = "hello";
		String reversed1 = "";

		for(int i = str1.length() - 1; i >= 0; i--) {
		    reversed1 += str1.charAt(i);
		}
		
		
		//using built-in methods
		System.out.println(reversed1);

		String str2 = "ChocoChipCookie";
		String reversed2 = new StringBuilder(str2).reverse().toString();

		System.out.println(reversed2);
		
		
		//using character array
		String str = "frozen";
		char[] arr = str.toCharArray();

		for(int i = arr.length - 1; i >= 0; i--) {
		    System.out.print(arr[i]);
		}
	}

}
