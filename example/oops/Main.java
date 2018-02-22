package example.oops;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
	ArrayList<Employee> empList = new ArrayList<Employee>();
	HRManager hrMng = new HRManager();
	EmployeeManager eMng = new EmployeeManager(); 
	boolean continueFlag = true;

	public static void main(String[] args) throws NumberFormatException, IOException {
		Main m = new Main();
		m.menu();
	}

	public void menu() throws NumberFormatException, IOException {
		while (continueFlag) {
			
			System.out.println("Creating Employee");
			try {
				empList.add(hrMng.AddEmployee());
			} catch (IOException e) {
				System.out.println("You have entered invalid inputs");
				menu();
			}

			System.out.println("View "); 
			     hrMng.viewdetails(empList.get(0));
			     eMng.viewdetails(empList.get(0));

		}
	}
}
