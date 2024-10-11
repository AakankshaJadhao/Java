package Exception;
class LowBalanceException extends RuntimeException {
    public LowBalanceException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Amount
class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}

// Account class
class Account_a {
    private int accountNumber;
    private String name;
    private float balance;

    // Default constructor
    public Account_a() {
        this.accountNumber = 0;
        this.name = "Unknown";
        this.balance = 0.0f;
    }

    // Parameterized constructor
    public Account_a(int accountNumber, String name, float balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Method to withdraw amount
    public void withdraw(float amount) throws LowBalanceException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount. Amount must be greater than zero.");
        }
        if (balance - amount < 1000) { // Assuming minimum balance is 1000
            throw new LowBalanceException("Low balance. Cannot withdraw, minimum balance required is 1000.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    // Method to deposit amount
    public void deposit(float amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount. Amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    // Getters to access account details (optional)
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }
public class Account2Main {

	public static void main(String[] args) {
		try {
            // Create an account with valid details
            Account_a account = new Account_a(12345, "Rajesh", 5000);

            // Display account details
            System.out.println("Account created: Account Number = " + account.getAccountNumber() +
                    ", Name = " + account.getName() + ", Balance = " + account.getBalance());

            // Deposit a valid amount
            account.deposit(1000);

            // Withdraw a valid amount
            account.withdraw(3000);

            // Attempt to withdraw an invalid amount (low balance)
            account.withdraw(3000);  // Should throw LowBalanceException

        } catch (LowBalanceException | InvalidAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            // Attempt to deposit an invalid amount
            Account_a anotherAccount = new Account_a(67890, "Sarthak", 3000);
            anotherAccount.deposit(-500);  // Should throw InvalidAmountException

        } catch (InvalidAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
	}
}
}
