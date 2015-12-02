public class Account {
	// private varicables
	private int accountNumber;
	private double balance;

	// contructors

	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	// public getters and setters for private variables
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void credit(double amount) {
		balance += amount;
	}

	public void debit(double amount) {
		if (balance < amount) {
			System.out.println("amount withrawn exceeds the current balance!");
		} else {
			balance -= amount;
		}
	}

	public String toString() {
		return String.format ( "A/C no : %d Balance = %.2f", accountNumber, balance);
	}
}