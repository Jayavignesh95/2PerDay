package dailyTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayMinMax {
 public static void main(String[] args) throws NumberFormatException, IOException {
	Integer num[]= new Integer[5];
	Integer min,max;
	System.out.println("Enter the array");
	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	for (int i = 0; i < num.length; i++) {
		num[i]=Integer.parseInt(in.readLine());
	}
	min=max=num[0];
	for (int i = 0; i < num.length; i++) {
		if(num[i]>max)
		{
			max=num[i];
		}
		else if (num[i]<min) {
			min=num[i];
		}
	}
	
	System.out.println(max);
	System.out.println(min);
 }
}
