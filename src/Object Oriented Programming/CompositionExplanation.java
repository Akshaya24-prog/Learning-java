package project.three;

//ENGINE CLASS
class Engine{
	String Type;
	
	Engine(String Type){
		this.Type = Type;
	}
	
	void start() {
		System.out.println("You start the " + Type + " engine");
	}
}

//TRUCK CLASS
class Truck{
	String model;
	int year;
	Engine engine;
	
	Truck(String model, int year, String engineType){
		this.model = model;
		this.year = year;
		this.engine = new Engine(engineType);
	}
	
	void start() {
		engine.start();
		System.out.println("The "+ model +" truck is running");
		}
	
}

public class CompositionExplanation {

	public static void main(String[] args) {
		// Composition = represents a 'part-of' relationship between objects
		// for eg, an engine is 'part-of' a car
		// allows complex objects to be constructed from smaller objects

		Truck t1 = new Truck("Mahindra", 2026, "V8" );
		
		System.out.println(t1.model);
		System.out.println(t1.year);
		System.out.println(t1.engine);//prints the memory id, as engine is a reference data type
		System.out.println(t1.engine.Type);//accesses the Type attribute of the engine object, where the engineType is stored
		t1.start();
		
		 /*
         * IMPORTANT:
         * If Truck object is destroyed, its Engine is also destroyed.
         * Engine cannot exist without Truck → true composition.
         */
		}

}
