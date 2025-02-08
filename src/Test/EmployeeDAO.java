package Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDAO {

	public static void createEmployee(Employee emp) throws SQLException {
		Connection con = DB.connect();
		String query = Query.insert(emp);
		// PreparedStatement pst=con.prepareStatement(query);
		System.out.print("\nInserting records into table...");
		Statement stmt = con.createStatement();
		// stmt.executeUpdate(query);
		stmt.execute(query);
		System.out.println(" SUCCESS!\n");

	}

	public static ArrayList<Employee> readAll() throws SQLException {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		Connection con = DB.connect();
		String query = Query.select();
		System.out.print("\nInserting records into table...");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			Employee emp = new Employee();
			emplist.add(emp);
		}
		System.out.println(emplist.get(0));

		return emplist;
	}

}
