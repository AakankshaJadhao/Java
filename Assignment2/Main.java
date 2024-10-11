package Assignment2;
//Base class Account
class Account {
 protected String accountNumber;
 protected String name;

 public Account(String accountNumber, String name) {
     this.accountNumber = accountNumber;
     this.name = name;
 }

 public void displayAccountInfo() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Name: " + name);
 }

 public float getMinimumBalance() {
     return 0; // Default implementation
 }

 public float withdraw(float amount) {
     return 0; // Default implementation
 }

 public float deposit(float amount) {
     return 0; // Default implementation
 }
}

//Subclass SavingAccount
class SavingAccount extends Account {
 private float balance;
 private float minBalance;

 // Default constructor
 public SavingAccount(String accountNumber, String name) {
     super(accountNumber, name);
     this.balance = 0;
     this.minBalance = 5000;
 }

 // Parameterized constructor
 public SavingAccount(String accountNumber, String name, float balance, float minBalance) {
     super(accountNumber, name);
     this.balance = balance;
     this.minBalance = minBalance;
 }

 @Override
 public void displayAccountInfo() {
     super.displayAccountInfo();
     System.out.println("Balance: " + balance);
 }

 @Override
 public float getMinimumBalance() {
     return minBalance;
 }

 @Override
 public float withdraw(float amount) {
     if (amount <= 0) {
         System.out.println("Error: Withdrawal amount must be greater than zero.");
         return 0;
     } else if (balance - amount < minBalance) {
         System.out.println("Error: Insufficient balance. Minimum balance of " + minBalance + " required.");
         return 0;
     } else {
         balance -= amount;
         return balance;
     }
 }

 @Override
 public float deposit(float amount) {
     if (amount <= 0) {
         System.out.println("Error: Deposit amount must be greater than zero.");
         return 0;
     } else {
         balance += amount;
         return balance;
     }
 }
}

//Subclass CurrentAccount
class CurrentAccount extends Account {
 private float balance;
 private float minBalance;

 // Default constructor
 public CurrentAccount(String accountNumber, String name) {
     super(accountNumber, name);
     this.balance = 0;
     this.minBalance = 10000;
 }

 // Parameterized constructor
 public CurrentAccount(String accountNumber, String name, float balance, float minBalance) {
     super(accountNumber, name);
     this.balance = balance;
     this.minBalance = minBalance;
 }

 @Override
 public void displayAccountInfo() {
     super.displayAccountInfo();
     System.out.println("Balance: " + balance);
 }

 @Override
 public float getMinimumBalance() {
     return minBalance;
 }

 @Override
 public float withdraw(float amount) {
     if (amount <= 0) {
         System.out.println("Error: Withdrawal amount must be greater than zero.");
         return 0;
     } else if (balance - amount < minBalance) {
         System.out.println("Error: Insufficient balance. Minimum balance of " + minBalance + " required.");
         return 0;
     } else {
         balance -= amount;
         return balance;
     }
 }

 @Override
 public float deposit(float amount) {
     if (amount <= 0) {
         System.out.println("Error: Deposit amount must be greater than zero.");
         return 0;
     } else {
         balance += amount;
         return balance;
     }
 }
}

//Main class to demonstrate functionality
public class Main {
 public static void main(String[] args) {
     SavingAccount savingAccount = new SavingAccount("SA123", "Alice", 10000, 5000);
     savingAccount.displayAccountInfo();
     savingAccount.withdraw(2000);
     savingAccount.deposit(1500);
     savingAccount.displayAccountInfo();

     System.out.println();

     CurrentAccount currentAccount = new CurrentAccount("CA456", "Bob", 20000, 10000);
     currentAccount.displayAccountInfo();
     currentAccount.withdraw(5000);
     currentAccount.deposit(3000);
     currentAccount.displayAccountInfo();
 }
}
