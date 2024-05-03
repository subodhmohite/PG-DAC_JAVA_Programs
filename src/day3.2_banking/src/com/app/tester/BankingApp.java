package com.app.tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.app.banking.AcType;
import com.app.banking.BankAccount;
import com.app.custom_exceptions.BankingException;

import static com.app.utils.BankingValidations.*;
import com.app.utils.*;

public class BankingApp {

	public static void main(String[] args) throws BankingException {
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
				switch (sc.nextInt()) {
				case 1:
					// boundary condition checking
					if (counter < accounts.length) {
						System.out.println("Enter a/c details -  acctNo,  firstName, "
								+ " lastName,  acType,  dob, creationDate, balance");
					BankAccount bankaccount=BankingValidations.validateInputs(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble());
					} else
						System.out.println("Bank capacity full !!!!");

					break;
				case 2://Display all
					

					break;

				case 0:
					exit = true;
					break;
				}

			}
		} // JVM : sc.close()

	}

	

}
