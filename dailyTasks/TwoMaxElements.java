package dailyTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoMaxElements {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Integer num1=0,num2=0,input;
		System.out.println("Enter the sisze of the array");
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		input=Integer.parseInt(reader.readLine());
		Integer[] ar=new Integer[input];
		System.out.println("Enter the elements in the array");
		   for(int i=0;i<ar.length;i++)
		   {
			   ar[i]=Integer.parseInt(reader.readLine());
		   }
		   for(Integer num : ar)
		   {
			   if(num>=num1)
			   {
				   num2=num1;
				   num1=num;
			   }
			   else
			   {
				   num2=num;
			   }
		   }
	
	System.out.println(num1 +"  "+num2 );
	}
	

}
