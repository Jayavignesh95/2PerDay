package example.oops;

public class EmployeeManager extends AbstractEmployeeManager {

	@Override
	public void viewdetails(Employee e) {
         System.out.println("Employee details name:"+e.getName()+" ID: "+e.getId()+" ");		
	}
	

}
