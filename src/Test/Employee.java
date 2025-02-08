package Test;

public class Employee {

	private int id;
	private String last;
	private String first;
	private String address;
	private String city;

	/*
	 * public Employee(int id, String last, String first, String address, String
	 * city) { this.id=id; this.last=last; this.first=first; this.address=address;
	 * this.city=city; }
	 */
	public void setId(int id) {
		this.id = id;
	}

	public void setLast(String last) {
		this.last = last;

	}

	public void setFirst(String first) {
		this.first = first;

	}

	public void setAddress(String address) {
		this.address = address;

	}

	public void setCity(String city) {
		this.city = city;

	}

	public int getId() {
		return id;
	}

	public String getLast() {
		return last;
	}

	public String getFirst() {
		return first;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String toString() {
		return "EMPLOYEE DETAILS: [ ID: " + id + ", LastName: " + last + ", FirstName: " + first + ", ADDRESS: "
				+ address + ", CITY: " + city + "]";
	}

}
