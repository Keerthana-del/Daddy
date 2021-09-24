package com.crm.vtiger.GenericUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/*
 * @author keerthana
 * 
 */
public class DataBaseUtils {
	static Connection con=null;
	static ResultSet result=null;
	

	public void connectToDB() throws Throwable
	{
		Driver driverref;
		driverref=new Driver();
		DriverManager.registerDriver(driverref);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		}
	public void closeDB() throws Throwable
	{
		con.close();
	}
	/**
	 * getDataFrom Db method to retrive data from database as key value pairs
	 * @param query
	 * @return
	 * @throws Throwable
	 */
	
	public static ResultSet executeQuery(String query) throws Throwable 
	{
		//executing the query
		result=con.createStatement().executeQuery(query);
		return result;
	
	}
	
	public static String executeQueryAndGetData(String query,int colunmName,String expectedData) throws Throwable{
		boolean flag=false;
		result=con.createStatement().executeQuery(query);
		while(result.next()){
			if(result.getString(colunmName).equals(expectedData))
			{
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println(expectedData+"===> data verifed in data base table");
			return expectedData;
		}
		else
		{
			System.out.println(expectedData+"====>data not verified in data base table");
			return expectedData;
		
	}
	
	
	
}	
}	
	
	
	
	

