package Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	static Connection conn = null;

	public static Connection connect() {
		try {
			String url = "jdbc:mysql://localhost:3306/tester";
			// String url = "jdbc:mysql://localhost:/tester"; even if no port is mentioned
			// DEFAULT will be used i.e. 3306, DB name "tester"is needs to mentionedwwr
			String Username = "root";
			String Password = "Pegasus@22";
			conn = DriverManager.getConnection(url, Username, Password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
