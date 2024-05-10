package com.app.tester;
import java.sql.*;
import java.util.Scanner;

import static com.app.utils.DBUtils.openConnection;

public class TestPreparedStatement {
	public static void main(String[] args){

	try(Scanner sc=new Scanner(System.in);
			//get db cvn
			Connection cn=openConnection();
			//create pre-compile statement,to hold sql
		PreparedStatement pst=cn.prepareStatement("Select * from users where email=? and password=?")){
		System.out.println("Enter email n password");
		//set IN params:public void seType(int paramIndex,Type value
		pst.setString(1,sc.next());//email		
		pst.setString(2,sc.next());//pwd
		//exec query
		try(ResultSet rst=pst.executeQuery()){
			if(rst.next())
				System.out.println("Login succesfull ! Hello,"+rst.getString("first_name")+" "+rst.getString(3));
			else
				System.out.println("Invalid Login,email or password is wrong");
		}//rst.close
	}
	    catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	System.out.println("main over");
}}



