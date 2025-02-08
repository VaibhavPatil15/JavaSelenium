package Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws SQLException {

		System.out.println("\n emp management system");
		System.out.println("1.create , 2.Read , 3.Update , 4.delete ");
		Scanner sc = new Scanner(System.in);
		int Choice = sc.nextInt();
		if (Choice < 1 || Choice > 4)
			System.out.println("Invalid choice");
		switch (Choice) {
		case 1:
			System.out.println("1.id , 2.last name , 3.first name , 4.address , 5.city ");
			sc.nextLine();
			Employee emp = new Employee();
			emp.setId(sc.nextInt());
			sc.nextLine();
			emp.setLast(sc.nextLine());
			emp.setFirst(sc.nextLine());
			emp.setAddress(sc.nextLine());
			emp.setCity(sc.nextLine());
			EmployeeDAO.createEmployee(emp);
			System.out.println("Following Details Added Successfully -- " + emp.toString());

			// System.out.println(emp.getId()+" , "+emp.getLast()+" , "+emp.getFirst()+" ,
			// "+emp.getAddress()+" , "+emp.getCity());
			break;
		case 2:
			ArrayList<Employee> list = EmployeeDAO.readAll();
			System.out.println("Hello");
		case 3:
		case 4:
		}
	}
}
