package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class persons {
	// driver load
	public void createDatabase() {
		// conn establish
		try {/*
				 * String url = "jdbc:mysql://localhost:3306/dead"; String Username = "root";
				 * String Password = "Pegasus@22"; Connection conn =
				 * DriverManager.getConnection(url, Username, Password); Statement stm =
				 * conn.createStatement(); String query = "Create database DB";
				 * stm.execute(query); System.out.println("Connection successfully done");
				 * conn.close();
				 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection createTable() {
		Connection conn = null;
		// conn establish
		try {
			String url = "jdbc:mysql://localhost:3306/tester";
			// String url = "jdbc:mysql://localhost:/tester"; even if no port is mentioned
			// DEFAULT will be used i.e. 3306, DB name "tester"is needs to mentionedwwr
			String Username = "root";
			String Password = "Pegasus@22";
			conn = DriverManager.getConnection(url, Username, Password);
			Statement stm = conn.createStatement();
			String query = "select * from Persons";
			boolean b1 = stm.execute(query); //
			System.out.println("Connection successfully done" + b1);
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

	public ArrayList<Jdbc> readData() {
		// conn establish
		// ResultSetHelper rsh=null ;
		ArrayList<Jdbc> list = new ArrayList<Jdbc>();
		try {
			String url = "jdbc:mysql://localhost:3306/tester";
			// String url = "jdbc:mysql://localhost:/tester"; even if no port is mentioned
			// DEFAULT will be used i.e. 3306, DB name "tester"is needs to mentionedwwr
			String Username = "root";
			String Password = "Pegasus@22";
			Connection conn = DriverManager.getConnection(url, Username, Password);
			Statement stm = conn.createStatement();
			String query = "select * from Persons";
			ResultSet rs = stm.executeQuery(query);
			System.out.println(rs);
			// rs.getRowCount
			while (rs.next()) {
				/// *
				// list.add(rs.getArray(query))
				System.out.println("ID =" + rs.getInt(1) + ", LastName = " + rs.getString("LastName") + ", FirstName = "
						+ rs.getString("FirstName") + ", Address = " + rs.getString("Address") + ", City = "
						+ rs.getString("City"));
				// System.out.println("ID ="+rs.getString("LastName"));
				// System.out.println("ID ="+rs.getString("FirstName"));
				// System.out.println("ID ="+rs.getString("Address"));
				// System.out.println("ID ="+rs.getString("City"));
				// */
				// System.out.println(rs.getArray(0));
			}

			// System.out.println("Connection successfully done : "+ rs);
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}
}
