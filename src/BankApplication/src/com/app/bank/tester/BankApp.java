package com.app.bank.tester;

import java.util.Scanner;
import com.app.banking.AcType;
import com.app.banking.BankAccount;
import com.app.customexceptions.BankingExceptions;
import com.app.utils.BankingValidations;
public class BankApp {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int choice;
		System.out.println("Enter The No. Of Accounts to be Store");
		BankAccount[] accounts=new BankAccount[sc.nextInt()];
		do {
		
//		System.out.println("Enter The No. Of Accounts to be Store");
//		BankAccount[] accounts=new BankAccount[sc.nextInt()];
		int counter =0;
		System.out.println("Choose the Options:1.Create Account 2.EXIT");
		choice=sc.nextInt();
		
		try{
			switch(choice) {
		
		case 1:
			if (counter<accounts.length)
			System.out.println("Enter Your Details:");
			System.out.println("Account No,First name,Last name,Account Type,Date of Birth,Account Created on,Balance");
			
				BankAccount acct=BankingValidations.validateInputs(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),accounts);
		
			
			
		case 2:
			//Display All Accounts
			System.out.println("All Account Details");
			for(BankAccount a:accounts)
				if(a!=null)
					System.out.println(a);
		break;
		default:
			System.out.println("You have Entered Wrong Choice");
			
			break;
		}	
		

	
		}while(choice!=2);
	
		
}
*/
	
	

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// start up : init phase
			boolean exit = false;
			// init D.S -- array
			System.out.println("Enter max no of bank accounts");
			BankAccount[] accounts = new BankAccount[sc.nextInt()];// 100
			int counter = 0;
			while (!exit) {
				// clnt servicing phase
				System.out.println("Options : 1. Create A/C \n" + "2. Display All Accounts \n" + "0. Exit ");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1:
						// boundary condition checking
						if (counter < accounts.length) {
							System.out.println("Enter a/c details -  acctNo,  firstName,"

									+ " lastName,  acType,  dob, creationDate, balance");
							BankAccount acct = BankingValidations.validateInputs(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(),
									sc.next(), sc.nextDouble(),accounts);
							accounts[counter++] = acct;
							System.out.println("A/c created !");

						} else
							System.out.println("Bank capacity full !!!!");

						break;
					case 2: // display all account details
						System.out.println("All account details -");
						for (BankAccount a : accounts)
							if (a != null)
								System.out.println(a);

						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					//read off all the pending tokens from the Scanner's buffer till new line
					sc.nextLine();
				}

			}
		} // JVM : sc.close()

		System.out.println("main over...");

	}

}


	