package com.app.tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.app.banking.AcType;
import com.app.banking.BankAccount;
import static com.app.utils.BankingValidations.*;
import static com.app.banking.BankingUtils.*;

public class BankingApp {

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
				System.out.println("Options : 1. Create A/C \n" + "2. Display All Accounts \n" +"3.Display \n"+ "0. Exit ");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1:
						// boundary condition checking
						if (counter < accounts.length) {
							System.out.println("Enter a/c details -  acctNo,  firstName,"

									+ " lastName,  acType,  dob, creationDate, balance");
							BankAccount acct = validateInputs(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(),
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
					case 3:
						System.out.println("Enter the Account no:");
						BankAccount account = findAccountDetailsByAcctno(sc.nextInt(),accounts);
						System.out.println(account);
						break;
								
						
//						int accNo =sc.nextInt();
//					    boolean flag=false;
//					    for(BankAccount a : accounts) {
//					    	if (a!=null && a.getAcctNo()==accNo) 
//					    	{
//					    		System.out.println(a);
//					    		flag=true;
//					    		break;
//					    	}
//					    }
//					    if(flag==false)
//					    	throw new AccoutNotFoundException("Account not Exixts");
//					    	break;

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
