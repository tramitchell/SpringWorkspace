package bankaccountapp;

public abstract class Account implements IRate {
	// properties
	private String name;
	private String ssn;
	
	protected String accountNumber;
	private double balance;
	protected double rate;
	
	private static int index = 10_000;
	
	
	//constructor
	public Account(String name, String ssn, double initDeposit) {
		this.name = name;
		this.ssn = ssn;
		this.balance = initDeposit;
		
		
		//set acc. num
		index++;
		this.accountNumber = setAccountNumber();
		System.out.println(  getBaseRate()  );
		
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN = ssn.substring(ssn.length() - 2, ssn.length());
		int uniqueID = index;
		int randomNumber = (int) ( Math.random() * Math.pow(10,3) );
		return lastTwoOfSSN + uniqueID + randomNumber;
		
	}
	
	public void compound( ) {

		double accruedInterest = balance * (rate/100);
		balance += accruedInterest;
		System.out.println("accrued interest: $" + accruedInterest);
		printBalance();
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("depositing");
		printBalance();
		
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("withdrawing");
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance -= amount;
		System.out.println("transfering");
	}
	public void printBalance() {
		System.out.println("yyour balnce is now $" + balance);
	}
	
	
	
	
	public void showInfo() {
		System.out.println(
				"NAME: " + name + 
				"\nACCOUNT NUMBER: " + accountNumber +
				"\nBALANCE: " + balance +
				"\nRATE: " + this.rate + "%"
				);
	}
	
	
}
