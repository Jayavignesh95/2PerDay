package stringTuts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySwap {
	static boolean check(int number)
	{
		System.out.println("Called" +number);

		boolean res=true;
		if(number/2==0 || number/3==0 || number/5==0 || number/7==0 || number/11==0)
		{
			System.out.println(number + "is not prime");

			res=false;
		}
		return res;
	
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		int temp;
		Integer[] ar1=new Integer[5];
		Integer[] ar2=new Integer[5];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number  ");
		for(int i=0;i<5;i++)
		{
		  ar1[i]=Integer.parseInt(br.readLine());	
		}
		List<Integer> a1= new ArrayList<Integer>();
		 
//		System.out.println("Enter number for second array ");
//		for(int i=0;i<5;i++)
//		{
//		  ar2[i]=Integer.parseInt(br.readLine());	
//		}
//		for(int i=0;i<5;i++)
//		{
//			for(int j=i;j<5;j++)
//			{
//			if(check(ar1[i]))
//			{
//				temp=ar1[i];
//				ar1[i]=ar2[i];
//				ar2[i]=temp;
//			}
//		}
//		}
//		System.out.println(Arrays.toString(ar1));
	}

}
