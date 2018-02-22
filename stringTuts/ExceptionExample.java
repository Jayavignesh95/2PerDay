package stringTuts;

public class ExceptionExample {
public static void main(String[] args) {
	Integer a=10,z=0;
	try{
		System.out.println(a/z);
		
	}
		catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
