package src.com.app.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import com.mysql.cj.xdevapi.Type;

import src.com.app.utils.DBUtils;

public class AccountDaoImpl implements AccountDao {
	// state
	private Connection cn;
	private CallableStatement cst1,cst2;

	// def ctor of the DAO layer
	public AccountDaoImpl() throws SQLException {
		// get cn from db utils
		cn =  DBUtils.openConnection();
		//create CST to invoke stored proc
		cst1 = cn.prepareCall("{call transfer_funds_proc(?,?,?,?,?)}");
		//register out parameters
		cst1.registerOutParameter(4, Types.DOUBLE);
		cst1.registerOutParameter(5, Types.DOUBLE);	
		System.out.println("Acct dao created....");
		
		//create CST to invoke store Func
		cst2 = cn.prepareCall("{?=call transfer_funds_func(?,?,?)}");
		//register out parameters
		cst2.registerOutParameter(1, Types.DOUBLE);
		
	}

	@Override
	public String transferFunds(int srcAcNo,int destAcNo,double amount ) throws SQLException{
		//set IN Param
		cst1.setInt(1, srcAcNo);
		cst1.setInt(2, destAcNo);
		cst1.setDouble(3, amount);
		//execute
		cst1.execute();
		return "Updated src balance"+cst1.getDouble(4)+ "Destination balance"+cst1.getDouble(5);
	}
	
	@Override
	public String transferFundsFunc(int srcAcNo, int destAcNo, double amount) throws SQLException {
		//set IN param
		cst2.setInt(2, srcAcNo);
		cst2.setInt(3, destAcNo);
		cst2.setDouble(4, amount);
		//execute
		cst2.execute();
		return "Updated balance"+cst2.getDouble(1);
	}

	// add clean up method to close DB resources
	public void cleanUp() throws SQLException {
		System.out.println("Acct dao cleaned up");
		if (cst1 != null)
			cst1.close();
		if (cst2 != null)
			cst2.close();
		 DBUtils.closeConnection();
	}

	

}
