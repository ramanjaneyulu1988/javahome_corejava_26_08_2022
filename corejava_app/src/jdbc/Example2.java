package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Example2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con = DatabaseUtil.getDBConnection();
		String query = "update product set price=40000,product_name='Apple7' where product_id=108";
		// Getting the statement
		Statement stmt = con.createStatement();
		// Executing query
		int i = stmt.executeUpdate(query);
		if(i > 0)
		{
			System.out.println("Updation successfully...");
		}
		else
		{
			System.out.println("Updation failed...");
		}

		con.close();
	}
}
