package com.app.utils;

import java.util.List;

import com.app.core.Customer;
import com.app.custom_exceptions.CMSException;

public class CMSUtils {
	public static Customer authenticateCustomer(String email, String password,List<Customer>list) 
			throws CMSException {
		//1.indexOf
		//2.invalid emial:throw custom exc
		
		Customer newCustomer=new Customer(email);
		int index = list.indexOf(newCustomer);//O(n)
		
		if(index==-1)
			throw new CMSException("Email is Invalid");
		
		
			Customer customer = list.get(index);
			//3.get--Customer ref--chk pwd--inavlid--throw custom exc return the Customer ref	
			if(customer.getPassword().equals(password))
				
				return customer;
		throw new CMSException("Invalid Password");
		}
	public static String deleteCustomerDetails(String email,List<Customer>list) throws CMSException {
		//removal by Primary key,remove(index) OR remove(Object)
		int index=list.indexOf(new Customer(email));
		if(index==-1)
			throw new CMSException("Can't Unsubscribe-invaild Email!!!!");
		//valid email
		return "Removed Details of " + list.remove(index);
	}
	}


