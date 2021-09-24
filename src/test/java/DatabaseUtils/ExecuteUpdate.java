package DatabaseUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdate {
	@Test
	public void getExecuteUpdate() throws SQLException
	{
		Connection con=null;
		try{
		//Step 1:Register the database
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		//Step 2:establish connection with database
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		//Step 3 issue create statement
		Statement stat = con.createStatement();
		//step 4: Execute any query
		 int result = stat.executeUpdate("insert into project values('ROJ_011','Rock','23/06/2021','SDET17','ON-GOING',22);");
		if(result==1)
		{
			System.out.println("project is created successfully");
		}
		else
		{
			System.out.println("query failed");
		}
		}
		catch(Exception e)
		{
			
		}
		finally{
			
		
		//Step : close database connection
		con.close();
		}
	}
}
