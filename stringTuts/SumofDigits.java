package stringTuts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumofDigits {
	static int sumDigits(String str)
	{
	  int sum = 0;
	 	int lim = str.length();
	  char ch;
	  for(int i = 0; i < lim; i++)
	  {
	  	ch =str.charAt(i) ;
			if(Character.isDigit(str.charAt(i))) 
				sum += Character.getNumericValue(ch);
		}
		return sum;
	}
public static void main(String[] args) throws IOException {
	System.out.println("Enter the string ");
   BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
   String input = rd.readLine();
	System.out.println("Sum of digits is "+SumofDigits.sumDigits(input));  
	
			
	
}
}
