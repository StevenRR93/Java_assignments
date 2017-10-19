public class BankAccount{
	
	
	private int accountNumber;
	private String ownerName;
	private float balance;
	
	public BankAccount(int accountNumber, String ownerName, float balance){
		this.accountNumber=accountNumber;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	public BankAccount(){
		this(0,"Clayton", 0.0f);
	}
	
	public BankAccount(String name){
		this(0,name, 0.0f);
	}
	
	public BankAccount(float b,String name){
		this(0,name, b);
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public String getOwnerName(){
		return ownerName;
	}
	
	public float getBalance(){
		return balance;
	}
	
	public void setAccountNumber(int a){
		accountNumber=a;
	}
	
	public void setBalance(float a){
		balance=a;
	}
	
	public void setOwnerName(String a){
		ownerName=a;
	}
	
	public String toString(){
		return ("Owner Name: " + ownerName + " Account number : " + accountNumber +  " balance : " + balance );
	}
	
	public void deposit(float a){
		balance = balance + a;
		
	}
	
	public float withdraw(float a){
		if(a<=balance)
			balance = balance-a;
		else
			System.out.println("Insufficient fund. ");	
		return balance;
	}
	
	public static BankAccount example1(){
		BankAccount b=new BankAccount();
		b.setOwnerName("Lucy");
		b.deposit(1000000000000000.0f);
		b.setAccountNumber(1);
		return b;
	}
	
	
}