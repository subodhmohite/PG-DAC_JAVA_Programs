package com.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		// TODO Auto-generated method stub
		do
		{
			System.out.println("Enter your Choice:");
			System.out.println("1.Addition \n"+"2.Subtraction \n"+"3.Multiplication \n"+"4.Division \n" +"5.Exit");
		     choice=sc.nextInt();
			
			switch(choice) 
			{
			case 1:
				Util.displayname();
				//System.out.println("");
				//
				break;
			
			case 2:
				System.out.println("We perform Subtraction");
				break;
			
			case 3:
				System.out.println("We perform Multiplication");
				break;
				
			case 4:
				System.out.println("We perform Division");
				break;
				
			case 5:
				System.out.println("Thank you Visit again !!!!");
				break;
			
			default:
				System.out.println("You have Entered Wrong Choice");
				
				break;
			
			}
		}while(choice!=5);
		
		

	}

}
