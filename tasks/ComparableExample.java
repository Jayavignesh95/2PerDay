package tasks;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>  {
	String name;
	int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int compareTo(Employee e) {
		return this.id - e.getId();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]\t";
	}

}

public class ComparableExample {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Arun", 5));
		empList.add(new Employee("Jai", 10));
		empList.add(new Employee("Dharun", 13));
		empList.add(new Employee("Suresh", 3));
		Collections.sort(empList);
		System.out.println(empList.toString());
	}
}
