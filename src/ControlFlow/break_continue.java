package project.one;

public class break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		//break - stops executing the loop
		//continue - skips the current iteration
		
		for(int i = 0 ; i < 10 ; i++) {
			
			if( i == 5) {
				continue;
			}
			if( i == 8 ) {
				break;
			}
			
			System.out.print(i + " ");
		}

	}

}
