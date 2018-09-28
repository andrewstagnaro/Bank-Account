/**
 * 
 * @author andrew stagnaro
 *
 */
	public class BankAccount 
	{

		private String name;
		private int accNum;
		private double balance;
		
		
		public BankAccount(int acNum, String n)
		{
			balance = 0;
			accNum = acNum;
			name = n;
		}
		
		public BankAccount(String n, int acNum, double bal)
		{
			name = n;
			accNum = acNum;
			balance = bal;
		}
		
		public void withdraw(double amt)
		{
			balance -= amt;
		}
		
		public void deposit(double amt)
		{
			balance += amt;
		}
	
		public return getBalance()
		{
			return balance;
		}
	}
