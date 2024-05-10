package com.app.tester;
import java.sql.*;
import static com.app.utils.DBUtils.openConnection;

public class TestStatement {

	public static void main(String[] args) {
		try(//get db cvn
			Connection cn=openConnection();
			//create empty statement,to hold
			Statement st=cn.createStatement();
			//exec select query n get ResultSet
			ResultSet rst=st.executeQuery("select * from users");
			
			)
		{
		
			//System.out.println("connected to DB "+cn);//implementation class instance 
		//ResultSet Processing
		//cursor->before the 1st row
		while(rst.next())
		/*
		 id | first_name | last_name | email             | password | dob        | status | role*/
		{System.out.printf("Id %d Name %s %s Email %s"
				+ "pwd %s DoB %s Status %b Role %s %n",
				rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),
				rst.getString(5),rst.getDate(6),rst.getBoolean(7),rst.getString(8));
		}
		/*{
			System.out.printf("name %s",rst.getString(1));
		}*/
		}//JVM : cn.close()
	
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		}
	}

	


