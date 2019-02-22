package db;

import java.sql.*;

public class DBConnection {
	// Change the parameters accordingly.
	private static String dbUrl = "jdbc:mysql://localhost:3306/dblp";

	private static String user = "root";
	private static String password = "root";

	public static Connection getConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			return DriverManager.getConnection(dbUrl, user, password);
		} catch (Exception e) {
		    throw new RuntimeException(e);
		}
	}
}
