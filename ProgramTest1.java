import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramTest1 {
Integer[] a=new Integer[5];
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	public  void readInput() throws NumberFormatException, IOException
{
   System.out.println("Enter the numbers");
   for (int i = 0; i < a.length; i++) {
	  a[i]=Integer.parseInt(in.readLine());
}
}
	public static void PrintOutput()
{
	
}
	public static void main(String[] args) {
	
}
}
