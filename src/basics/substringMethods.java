package project.one;
import java.util.Scanner;

public class subStringMethods {

	public static void main(String[] args) {
		
		// .substring() or  .substring(start, end) = A method used to extract a portion of string
		// indexOf(char) = returns the index position of the character
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the mail id : ");
		String mail = sc.nextLine();
		System.out.println("mail id is : "+mail);
		
		//creating a substring from original string using index values
		
		// only starting index is given
		String domain = mail.substring(10); 
		System.out.println("Domain is : "+domain);
		
		
		//checking validity
		if(mail.contains("@")){
			System.out.println("Valid mailid)");
			
			//starting index to n-1 index
			String userid = mail.substring(0, mail.indexOf("@"));
			System.out.println("Userid is : "+userid);
			
			//choosing index using indexOf method of a symbol
			String formatDomain = mail.substring(mail.indexOf("@"));
			System.out.println("Formatted domain : "+formatDomain);		
			
		}
		else {
			System.out.println("Emails must contain '@' ");
		}
		
		
		sc.close(); //closing scanner object
		
	
	}

}
