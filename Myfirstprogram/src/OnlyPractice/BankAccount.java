package OnlyPractice;

public class BankAccount implements SetAndGet{
	
	int ID = 0;
	private String name;
	private int balance;
	
	public BankAccount() {
		this.name = "";
		this.balance = 0;
		
	}
	public BankAccount(String name,int balance,int ID) {
		
		this.name = name;
		this.balance = balance;
		this.ID = ID;
	}
	@Override
	public void setName(String name) {
		this.name = name;	
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setBalance(int balance) {
		this.balance = balance;	
	}
	@Override
	public int getBalance() {
		return balance;
			
	}
	
	public void setDeposit(int deposit) {
		this.balance+=deposit;
	}
	
	public void setWithdraw(int withdraw) {
		this.balance-= withdraw;
	}

}
