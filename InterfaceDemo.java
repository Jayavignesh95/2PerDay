interface test{
 int a=0;
 void printthis();
}
class test1 implements test {
	public void printthis() {
	System.out.println(a);
}
}
public class InterfaceDemo extends test1
{
	public static void main(String[] args) {
		test1 obj=new test1();
		obj.printthis();
		//String B="a";
		
	}
	
}
