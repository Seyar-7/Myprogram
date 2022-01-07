package OnlyPractice;

public class Bank extends BankAccount{

	String bankname;

	
	public Bank() {
		super();
		this.bankname ="";
	}
	public Bank(String bankname,String name,int balance,int ID) {
		super(name,balance,ID);
		this.bankname = bankname;
	}
	

	
	public String toString() {
		return "Name = "+this.getName()+", Balance = "+this.getBalance()+"$,"+"ID_Number = "+ID+", BankName = "+this.bankname; 
	}
}
