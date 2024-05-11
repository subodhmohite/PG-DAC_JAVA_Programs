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
			System.out.println("Enter source Account No. and Destination Account no. and Amount ");
			System.out.println(accountdao.transferFunds(sc.nextInt(),sc.nextInt(),sc.nextDouble()));
					} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
