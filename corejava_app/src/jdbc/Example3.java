package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Example3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con = DatabaseUtil.getDBConnection();
		String query = "delete from product where product_id=106";
		// Getting the statement
		Statement stmt = con.createStatement();
		// Executing query
		int i = stmt.executeUpdate(query);
		if(i > 0)
		{
			System.out.println("Deletion successfully...");
		}
		else
		{
			System.out.println("Deletion failed...");
		}

		con.close();
	}
}
