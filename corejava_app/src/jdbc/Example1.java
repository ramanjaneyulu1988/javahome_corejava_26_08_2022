package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Example1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con = DatabaseUtil.getDBConnection();
		String query = "insert into product(product_id, manufacturer_name, product_name, price) values (108, 'Apple', 'Apple6', 30000.0)";
		// Getting the statement
		Statement stmt = con.createStatement();
		// Executing query
		int i = stmt.executeUpdate(query);
		if(i > 0)
		{
			System.out.println("Insertion successfully...");
		}
		else
		{
			System.out.println("Insertion failed...");
		}
		
		con.close();
	}
}
