package DatabaseUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQuery {
	@Test
	public void getExecuteQuery() throws SQLException
	{
		//Step 1:Register the database
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		//Step 2:establish connection with database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		//Step 3 issue create statement
		Statement stat = con.createStatement();
		//step 4: Execute any query
		ResultSet result = stat.executeQuery("select * from project;");
		while(result.next())
		{
			System.out.println(result.getString(1));
		}
		
		//Step : close database connection
		con.close();
	}

}
