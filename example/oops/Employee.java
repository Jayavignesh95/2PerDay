package example.oops;

public class Employee {
String name;
int id;
float salary;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
//public Employee(String name, int id, float salary) {
//	this.name = name;
//	this.id = id;
//	this.salary = salary;
//}
public void setId(int id) {
	this.id = id;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}

public String toString() {
	return "Employee name=" + name + ", id=" + id + ", salary=" + salary + ".";
}



}
