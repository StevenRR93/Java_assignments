public class BankAccountTest{
	public static void main(String[] args){
		BankAccount matt=new BankAccount(1, "matt", 1000.0f);
		System.out.println(matt);
		System.out.println(matt.toString());
		
		System.out.println(matt.getOwnerName());
		System.out.println(matt.getAccountNumber());
		System.out.println(matt.getBalance());
		
		matt.setBalance(0.0f);
		System.out.println(matt.getBalance());
		matt.setAccountNumber(2);
		System.out.println(matt.getAccountNumber());
		matt.setOwnerName("Steve");
		System.out.println(matt.getOwnerName());

		matt.withdraw(10000f);
		System.out.println(matt.getBalance());
		
		matt.deposit(10000f);
		System.out.println(matt.getBalance());
		matt.withdraw(100f);
		System.out.println(matt.getBalance());
		
		System.out.println(BankAccount.example1());
		
		
	}
	
	
	
}