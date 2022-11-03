package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

	public static Connection getDBConnection() throws ClassNotFoundException, SQLException
	{
		// Register a Driver class
		Class.forName("com.mysql.jdbc.Driver");  
		// Opening / Getting / Establish Connection by providing database info
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javahome","root","root");
		
		return con;
	}
}
