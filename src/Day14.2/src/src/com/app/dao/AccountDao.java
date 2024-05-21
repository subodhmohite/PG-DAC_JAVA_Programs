package src.com.app.dao;

import java.sql.SQLException;

public interface AccountDao {
//add a method 
	
    String transferFunds(int srcAcNo,int destAcNo,double amount) throws SQLException;
    String transferFundsFunc(int srcAcNo,int destAcNo,double amount) throws SQLException;
	}
