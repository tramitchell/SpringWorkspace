package bankaccountapp;

public class Savings extends Account {

	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	
	//
	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	private void setSafetyDepositBox() {
		this.safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3) );
		this.safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4) );
		
	}
	
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: SAVINGS");
		super.showInfo();
		System.out.println(
				"Your savings Accunt Features" +
				"\nSafety Deposit Box ID: " + this.safetyDepositBoxID +
				"\nSafety Deposit Box Key: " + this.safetyDepositBoxKey				
				);
		
		
	}

	@Override
	public void setRate() {
		this.rate = getBaseRate() - .25;
	
	}
}
