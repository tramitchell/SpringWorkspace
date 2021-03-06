package bankaccountapp;

public class Checking extends Account {
	// properties
	private int debitCardNumber;
	private int debitCardPin;
	
	
	// constructor
	public Checking(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}

	
	//methods 
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking acc features" + 
				"\nDebit Card Number: " + this.debitCardNumber +
				"\nDebit Card Pin: " + this.debitCardPin				
				);
		
	}

	private void setDebitCard() {
		this.debitCardNumber = (int)(Math.random() * Math.pow(10,12));
		this.debitCardNumber = (int)(Math.random() * Math.pow(10,4)); 

	}


	@Override
	public void setRate() {
		//System.out.println("imlpment checking");
		this.rate = getBaseRate() * .15;
	
	}
	
	
	
	
}
