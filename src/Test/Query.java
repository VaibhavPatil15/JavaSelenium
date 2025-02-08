package Test;

public class Query {
	public static String insert;
	String hel = "hello";

	/*
	 * public static String insert() { Employee emp=new Employee(); String sql =
	 * "INSERT INTO  persons " +
	 * "VALUES ("+emp.getId()+","+emp.getFirst()+","+emp.getLast()+","+emp.
	 * getAddress()+","+emp.getCity()+")";
	 * System.out.println("INSERT INTO  persons " + "VALUES ("+address+"");
	 * System.out.println(" SUCCESS!\n"); return sql; }
	 */

	public static String insert(Employee emp) {
		// System.out.println(emp.getAddress());
		// String sql = "INSERT INTO persons " +
		// "VALUES ("+emp.getAddress(); "'"
		// String arr[]= {"aa","aa","aa","aa"};
		String sql = "INSERT INTO  persons " + "VALUES (" + emp.getId() + ",'" + emp.getFirst() + "','" + emp.getLast()
				+ "','" + emp.getAddress() + "','" + emp.getCity() + "')";
		System.out.println(sql);
		return sql;
	}

	public static String select() {
		String sql = "Select * from persons";
		return sql;
	}

}
