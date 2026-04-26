package project.three;
import java.util.Scanner;

class CarX {

    String model;
    String color;

    CarX(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void drive() {
        System.out.println("You drive the " + color + " " + model);
    }
}

public class ArrayofObjects {

    public static void main(String[] args) {

        CarX car1 = new CarX("Mustang", "Red");
        CarX car2 = new CarX("Corvette", "Blue");
        CarX car3 = new CarX("Charger", "Yellow");

        CarX[] cars = {car1, car2, car3};

        for (int j = 0; j < cars.length; j++) {
            cars[j].drive();
        }
            
            Scanner sc = new Scanner(System.in);

            CarX[] cars2 = new CarX[3];

          for (int i = 0; i < cars2.length; i++) {
                System.out.print("Enter car name for car " + (i + 1) + ": ");
                String model = sc.nextLine();

                System.out.print("Enter car color for car " + (i + 1) + ": ");
                String color = sc.nextLine();

                cars2[i] = new CarX(model, color);

                System.out.println("Car " + (i + 1) + ": "
                        + cars2[i].model + " - " + cars2[i].color);
            }

            // For-each loop
            for (CarX car : cars2) {
                car.drive();
            }
        }
    }
