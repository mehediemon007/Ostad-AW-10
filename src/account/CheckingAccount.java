package account;

public class CheckingAccount extends BankAccount {
	
	
	private double withdrawalLimit = 20000;
    private double withdrawFees = 200;
    
    @Override
    public void withdraw(double amount) {
    	
    	balance -= withdrawFees;
    	
        if (amount <= balance && amount <= withdrawalLimit) {
            balance -= amount;
            
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Checking Account Current Balance: $" + balance);
        } else if (amount > withdrawalLimit) {
            System.out.println("Withdrawal limit exceeded. Max limit: $" + withdrawalLimit);
        } else {
            System.out.println("Insufficient funds. Withdrawal denied.");
        }
    }

}
