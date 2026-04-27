package project.three;

/*
 *  Class → cannot have 2 parents (extends)
Interface → can have multiple (implements)
Interface → can extend multiple interfaces too
 * */

interface predator{
	/*
	  Interface variables without value  are Not allowed
		Must be initialized immediately
		Methods without body are perfectly fine
	 
	  */
	
	String name = "Hunter";
	//the above variable is automatically treated as 'public static final String name = "Hunter";'
	
	//abstract methods
	//Any class implementing Predator must define both
	void hunt();
	
	void hurt() ;
}

interface prey{
	
	void flee();
}

class rabbit implements prey{
	String name;
	@Override
	public void flee() {
		System.out.println("The rabbit is running away");
	}
}
class fish implements prey, predator{
	
	@Override
	public void flee() {
		System.out.println("The fish is swimming away");
	}
	
	@Override
	public void hunt() {
		System.out.println("The fish is hunting");
	}
	
	@Override
	public void hurt() {
        System.out.println("The fish attacks prey");
    }
	
	
}
class hawk implements predator{
	@Override
	public void hunt() {
		System.out.println("The hawk is hunting");
	}
	public void hurt() {
        System.out.println("Hawk attacks prey");
    }
}

public class InterfacesExplanation {

	public static void main(String[] args) {
		// Interface = a blueprint for a class that specifies a set of abstract methods
		// that implements classes must define
		// supports multiple inheritance like behavior
		
		rabbit r1 = new rabbit();
		r1.flee();
		
		hawk h1 = new hawk();
		h1.hunt();
		
		fish f1 = new fish();
		f1.hunt();
		f1.hurt();
		f1.flee();
	}

}
