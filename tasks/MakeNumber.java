package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
//import java.util.List;

public class MakeNumber implements Comparator<String> {
	
	
	
	public static void main(String[] args) {
//		String[] arr= {"26","3","1","9","7"};
		int[] b=new int[5];
		int[] arr= {12,32,43,65,8};
		for(int i=0;i<arr.length;i++){
			if(arr[i]>10 && arr[i]<100){
				b[i]=arr[i]/10;
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>10 && arr[i]<100){
				if(b[i]<arr[i]){
					
				}
			}
		}
//		ArrayList<String> numList = new ArrayList<String>(Arrays.asList(arr));
//		Collections.sort(numList,new MakeNumber());
		//Collections.sort(numList, );
//		for (Iterator<String> iterator = numList.iterator(); iterator.hasNext();) {
//        	System.out.print(iterator.next());
//		}		
	}

	
	public int compare(String A, String B) {
		System.out.println(A+B+ "  "+(B+A));
		return (A+B).compareTo((B+A));
	}

	
}
