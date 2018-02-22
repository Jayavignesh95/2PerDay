package dailyTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class ReverseString {
	public static String StringRev(String str)
	{
		String revStr="";
		for (int i = str.length()-1; i>=0; i--) {
			revStr=revStr+str.charAt(i);
		}
		//System.out.println(revStr);
		return revStr;
		
	}
 public static void main(String[] args) throws IOException {
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	String data;
	Integer[] a =new Integer[5];
	String revSen="";
	System.out.println("Enter the Sentence");
	data=in.readLine();
	System.out.println(data);
	String[] words=data.split(" ");
	for (int i = 0; i < words.length; i++) {
		revSen=revSen + " "+ StringRev(words[i]); 
	}
	System.out.println(revSen);
}
}
