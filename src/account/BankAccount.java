package account;

public abstract class  BankAccount {
	
    protected double balance;

	public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("Current Balance: $" + balance);
    }

    public abstract void withdraw(double amount);
    
}
