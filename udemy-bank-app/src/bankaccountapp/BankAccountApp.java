package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

import utilities.CSV;

public class BankAccountApp {
	
	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		
		
		
		
		String file = "C:\\Users\\Tucker\\Downloads\\NewBankAccounts.csv";
		
		/*
		Checking chkAcc1 = new Checking("Tom Wilson", "123456789", 1500);
		Savings savAcc1 = new Savings("Rich Lowe", "152643879", 2500);

		
		
		savAcc1.compound();

		savAcc1.showInfo();
		System.out.println("+++++++++++++++++++++++");
		chkAcc1.showInfo();
		*/
		
		
		/// read csv
		List<String[]> newAccountHolders = CSV.read(file);
		
		for(String[] accountHolder: newAccountHolders) {
			
			System.out.println("new account");
			String name = accountHolder[0];
			String ssn = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			//System.out.println(name + " " + ssn + " " + accountType + " $" + initDeposit);
			
			if(accountType.equals("Savings")) {
				System.out.println("opening sav acct");
				accounts.add(new Savings(name, ssn, initDeposit));
			}
			
			else if (accountType.equals("Checking")) {
				System.out.println("opening chiking acct");
				accounts.add(new Checking(name, ssn, initDeposit));
				
			} 
			else {
				System.out.println("error");
			}
			
			
			for(Account acc : accounts) {
				System.out.println("********************");
				acc.showInfo();				
				
			}
			
			
					
//			System.out.println(accountHolder[0]);
//			System.out.println(accountHolder[1]);
//			System.out.println(accountHolder[2]);
//			System.out.println(accountHolder[3]);
//			System.out.println();

		}
		
		
		
		
	}
		
	
	
}
