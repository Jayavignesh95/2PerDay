package tasks;
class A
{
	final void a()
	{
		System.out.println("Parent");
	}
}
class B extends A
{
	//void a()
	{ 
		System.out.println("Child");
	}
}
public class LK {
public static void main(String[] args) {
	  A obj =  new B();
	  obj.a();
}
}
