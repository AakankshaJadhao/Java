/*
Write class Account(accountNumber, name, balance) 
  implement toString which will print accountNumber, name, balance
  1. implement methods float getMInimumBalance() which throws Exception with message "Please maintain minimum balance".
  2. float withdraw(float amount)
    which throws Exception with message "invalid amount".
    which throws Exception with message "low balance".
  3. float deposite(float amount)
    which throws Exception with message "invalid amount". 
*/
package Exception;
class Account {
    private int accountNumber;
    private String name;
    private float balance;

    // Constructor
    public Account(int accountNumber, String name, float balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // toString method to print account details
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Name: " + name + ", Balance: " + balance;
    }

    // Method to get the minimum balance
    public float getMinimumBalance() throws Exception {
        if (balance < 1000) {  // Assuming 1000 is the minimum balance required
            throw new Exception("Please maintain minimum balance.");
        }
        return balance;
    }

    // Method to withdraw amount
    public float withdraw(float amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid amount.");
        }
        if (balance - amount < 1000) {  // Assuming 1000 is the minimum required balance
            throw new Exception("Low balance.");
        }
        balance -= amount;
        return balance;
    }

    // Method to deposit amount
    public float deposit(float amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid amount.");
        }
        balance += amount;
        return balance;
    }

    // Getters for accessing account details (if needed)
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }
}
public class AccountMain {

	public static void main(String[] args) {
		try {
            // Create an account object
            Account account = new Account(12345, "John Doe", 2000);

            // Print account details
            System.out.println(account);

            // Test deposit method
            account.deposit(500);
            System.out.println("After deposit of 500: " + account);

            // Test withdraw method
            account.withdraw(1000);
            System.out.println("After withdrawal of 1000: " + account);

            // Test for minimum balance check
            account.getMinimumBalance();

            // Test invalid amount in withdraw
            account.withdraw(2000);  // This should throw an exception for low balance
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}

}
