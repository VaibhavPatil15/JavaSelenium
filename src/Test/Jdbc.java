package Test;

import java.util.ArrayList;

public class Jdbc {

	public static void main(String[] args) {
		persons per = new persons();
		// per.createDatabase();
		// per.createTable();
		ArrayList<Jdbc> ary = per.readData();

	}

}
