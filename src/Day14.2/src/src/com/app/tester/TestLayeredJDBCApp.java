package src.com.app.tester;

import java.util.Scanner;

import src.com.app.dao.AccountDaoImpl;

public class TestLayeredJDBCApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 1. init phase --invoked once @ beginning of app
			// created dao instance (i.e Tester :
			// dependent is creating it's own dependency)
			AccountDaoImpl accountdao = new AccountDaoImpl();
			boolean exit = false;
			while (!exit) {
			System.out.println("Options 1.Tranfers funds by procedure \n 2.Tranfer funds by function");
			try {
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter source Account No. and Destination Account no. and Amount ");
				System.out.println(accountdao.transferFunds(sc.nextInt(),sc.nextInt(),sc.nextDouble()));
			break;
			
			case 2:
				System.out.println("Enter source Account No. and Destination Account no. and Amount ");
				System.out.println(accountdao.transferFundsFunc(sc.nextInt(),sc.nextInt(),sc.nextDouble()));
			break;	
			case 0:
				exit = true;
				// destroy (shutdown/terminate app)
				accountdao.cleanUp();
				break;
			} 
			}catch (Exception e) {
				e.printStackTrace();
				sc.nextLine();
			}
			}
		}catch (Exception e) {
			e.printStackTrace();
			}
		
	}
}
	


