package asianpaints.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnections {

	public static Connection getDBConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "12345");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver  Class not found");
		} catch (SQLException e) {
			System.out.println("SQL exception");
		}
		return con;
	}

	public static void main(String[] args) {
		System.out.println(getDBConnection());
	}

}
