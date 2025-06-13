package theme_2;

public class Task5_2BankAccount {
	private int accountNumber;
	private int accountBalance;
	public void setName(int n,int b) {
		this.accountNumber=n;
		this.accountBalance=b;
	}
	public int getNumber() {
		return accountNumber;
	}
	public int getBalance() {
		return accountBalance;
	}
	public static void main(String[] args) {
		Task5_2BankAccount tr=new Task5_2BankAccount();
		tr.setName(123,3025);
		System.out.println("Account Number:"+tr.getNumber());
		System.out.println("Account Balance:"+tr.getBalance());
	}

}
