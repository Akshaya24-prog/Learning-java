package project.three;

class Friend{
	static int numOfFriends; //static variable
	String name;
	
	Friend(String name){
		this.name = name;
		numOfFriends++;
	}
	
	//static method
	static void showPlace() {
		System.out.println("You belong to Arendelle");
	}
	
	
}

public class staticWord {

	public static void main(String[] args) {
		// static = Makes a variable or method belong to the class
        // rather than to any specific object.
        // Commonly used for utility methods or shared resources.

		Friend f1 = new Friend("Elsa");
		Friend f2 = new Friend("Olaf");
		Friend f3 = new Friend("Anna");
		Friend f4 = new Friend("Sven");
		Friend f5 = new Friend("Kristoff");
		//a static variable can be accessed by using the class name directly
		//it can also be accessed using an object that was created (eg.f1)
		// but its value is common for all the created objects, i.e. it is not unique to each object like other attributes like name
		System.out.println("The number of friends created is "+Friend.numOfFriends);
		Friend.showPlace();
	}

}
