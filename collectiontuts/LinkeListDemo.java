package collectiontuts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkeListDemo {
public static void main(String[] args) {
	LinkedList<String> lst=new LinkedList();
	LinkedList<Integer> lst1=new LinkedList();
	String[] ar=new String[4];	lst.add("A");
	lst.add("B");
	lst.add("C");
	lst.add("D");
	String[] ArrStr={"Hello","HI","PLM"};
	List<String> convertedList =  Arrays.asList(ArrStr);
	System.out.println(convertedList);
	ArrStr[0]="Changed";
	System.out.println(convertedList);
	convertedList.set(0,"NEW_UPDATE");
	System.out.println(ArrStr[0]);
	System.out.println(lst.toString());
	
//	System.out.println(lst.peek());
//	System.out.println(lst.toString());
//	System.out.println(lst.poll());
//	System.out.println(lst.toString()); remove the element from the list
//	System.out.println(lst.offer("E")); // returns true if the elemt is added
//	System.out.println(lst.toString());
	lst.toArray(ar);
	for(String a : ar)
	{
		System.out.println(a);
	}
	System.out.println(lst.toString());

}
}
