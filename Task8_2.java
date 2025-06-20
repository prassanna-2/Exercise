package Theme_3;
//Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). 
//Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred
class BankAccount
{
	double balance;
	public BankAccount(double initialbal)
	{
		balance=initialbal;
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Deposited "+amount+" successfully");
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}
	public void withdraw(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance-=amount;
			System.out.println("Withdraw "+amount+" successfully");
		}
		else
		{
			System.out.println("Invalid withdraw amount");
		}
	}
}
class SavingsAccount extends BankAccount
{
	SavingsAccount(double initialamount)
	{
		super(initialamount);
	}
	public void withdraw(double amount)
	{
		if(amount>0)
		{
			if(balance-amount>=100)
			{
				balance-=amount;
				System.out.println("Withdraw: "+amount+" successfully");
			}
			else
			{
				System.out.println("withdraw denied.Minimum balance 100 should be maintained");
			}
		}
		else 
		{
			System.out.println("Invalid withdraw amount");
		}
		
	}
	
}

public class Task8_2
{
	public static void main(String[] args)
	{
		SavingsAccount s=new SavingsAccount(50);
		s.deposit(20);
		s.withdraw(200);

	}

}
