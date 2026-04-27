package project.three;
import java.util.Scanner;

abstract class Animalx{
	abstract void speak();
}

class Dogx extends Animalx{
	@Override
	public void speak(){
		System.out.println("The dog goes woof!");
	}
}

class Catx extends Animalx{
	@Override
	public void speak(){
		System.out.println("The cat goes meow!");
	}
}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		// Runtime polymorphism = when the method that gets executed is decided at runtime 
		//based on the actual type of the object
		
		//since Animal is an abstract class we cannot create animal objects
		Scanner sc = new Scanner(System.in);
		
		
		Animalx animal;//an object of type Dog or Cat can be created
		System.out.print("Would you like a dog or a cat ?(1 = dog, 2 = cat) : ");
		int choice  = sc.nextInt();
		
		if(choice == 1) {
			animal = new Dogx();
			animal.speak();
		}
		else if(choice == 2) {
			animal = new Catx();
			animal.speak();
		}
		
		
		
		sc.close();

	}

}
