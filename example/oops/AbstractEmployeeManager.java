package example.oops;

public abstract class AbstractEmployeeManager implements View {

public void viewdetails(Employee e) {
	System.out.println("Employee details name:" + e.getName() + " ID: " + e.getId() + " ");

}
}
