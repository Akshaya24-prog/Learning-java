package project.three;

/* Getters & setters provide:
  * Encapsulation (data hiding)
  * Validation (control changes)
  * Flexibility (change logic later)
*/
class BankAccount {

    // private - cannot be accessed directly from outside
    private double balance;

    // Constructor
    BankAccount(double balance) {
        this.balance = balance;
    }

    // Getter - read the value
    public double getBalance() {//Allows safe reading of value
        return balance;
    }

    //  Setter - modify the value with validation
    public void setBalance(double balance) {//Controls how value is updated
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }
}

public class GettersAndSetters {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount(1000);

        //  Direct access (not allowed)
        // acc.balance = -500;

        // Using setter
        acc.setBalance(2000);
        System.out.println("Balance: " + acc.getBalance());

        // Invalid update
        acc.setBalance(-500);  // blocked
        System.out.println("Balance: " + acc.getBalance());
	}

}
