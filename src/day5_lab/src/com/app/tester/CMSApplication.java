package com.app.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.core.Customer;
import com.app.utils.CMSUtils;
import com.app.utils.CMSValidations;
import com.app.core.ServicePlan;
public class CMSApplication {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init phase
			boolean exit = false;
			// init D.S
			List<Customer> customerList = new ArrayList<>();// size : 0 , init cap 10
			while (!exit) {
				System.out.println("Options : 1. Customer Sign Up 2. Display all 3.Login Customer 4.Update Password  0. Exit");
				System.out.println("Choose");
				try {
					switch (sc.nextInt()) {
					case 1: // register new customer
						System.out.println(
								"Enter customer details : firstName,  lastName,  email,  password,	regAmount,  dob,  plan");
						Customer customer = CMSValidations.validateCustomerInputs(sc.next(), sc.next(), sc.next(), sc.next(),sc.nextDouble(), sc.next(), sc.next(), customerList);
						//=> all i/ps are valid
						customerList.add(customer);
						System.out.println("customer registered....");
						break;
						
					case 2://display all
						for(Customer c: customerList)
							System.out.println(c);
						break;
					
					case 3://Login
						System.out.println("Enter email n password");
						customer=CMSUtils.authenticateCustomer(sc.next(),sc.next(),customerList);
						System.out.println("Succesfull Login");
						break;
					
					case 4://Update password 
						System.out.println("Enter email n password");
						customer=CMSUtils.authenticateCustomer(sc.next(),sc.next(),customerList);
						//change password
						System.out.println("Enter new Password");
						customer.setPassword(sc.next());
						System.out.println("Password Changed !!");
						break;
						
					case 5://Unsubscribe
						System.out.println("Enter email to unsubscribe ");
						CMSUtils.deleteCustomerdetails(sc.next(),customerList);

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);// toString
				}
			}
		}

	}

	

}
