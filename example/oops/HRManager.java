package example.oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class HRManager extends AbstarctHRManager {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int choice;

	public void updateSalary(Employee e, float Salary) {
		e.setSalary(Salary);
		System.out.println("Salary Updated");
	}

	public Employee AddEmployee() throws IOException {
		Employee newEmp = new Employee();
		System.out.println("Enter the name");
		newEmp.name = in.readLine();
		System.out.println("Enter the id");
		newEmp.id = Integer.parseInt(in.readLine());
		System.out.println("Enter the Salary");
		newEmp.salary = Float.parseFloat(in.readLine());
		return newEmp;
	}

	}
