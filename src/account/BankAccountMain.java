package account;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount s1 = new SavingsAccount();
		s1.deposit(500000);
		s1.withdraw(10000);
		
		BankAccount c1 = new CheckingAccount();
		
		c1.deposit(100000);
		c1.withdraw(1000);

	}

}
