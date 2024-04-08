
public class SavingsAccount extends BankAccount
{
	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
		setAccountNumber(getAccountNumber() + "-" + savingsNumber);
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount)
	{
		super(oldAccount, amount);
		savingsNumber++;
	}
	
	public void postInterest()
	{
		super.deposit(getBalance() * ((rate / 100) * 1/12));
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
}
