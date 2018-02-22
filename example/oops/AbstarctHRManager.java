package example.oops;

public abstract class AbstarctHRManager  implements View {

	@Override
	public void viewdetails(Employee e) {
		System.out.println("HR details name:" + e.getName() + " ID: " + e.getId() + " , Salary "+e.getSalary()+"");
		
	}
}
