package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con = DatabaseUtil.getDBConnection();
		String query = "select * from product";
		// Getting the statement
		Statement stmt = con.createStatement();
		// Executing query
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt("product_id"));
			System.out.println(rs.getString("manufacturer_name"));
			System.out.println(rs.getString("product_name"));
			System.out.println(rs.getDouble("price"));
			
			System.out.println("====================================");
		}
		
		con.close();
	}
}
