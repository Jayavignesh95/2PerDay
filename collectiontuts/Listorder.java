package collectiontuts;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class Listorder {
 
    public static void main(String[] args) {
//    	String[] name=new String[10];
//    	name[0]="Helk";
//    	System.out.println(name[0]);
       List<Integer> aList = new ArrayList<>();
       // Add elements to ArrayList object
       aList.add(1);
       aList.add(2);
       aList.add(3);
       aList.add(4);
       aList.add(5);
       aList.add(6);
       aList.add(7);
       int size = aList.size();
       System.out.println("ArrayList before reverse : " + aList);
       ListIterator<Integer> fwd = aList.listIterator();
       ListIterator<Integer> rev = aList.listIterator(size);
       for (int i = 0; i < size / 2; i++) {
            int temp = fwd.next();
            fwd.set(rev.previous());
            rev.set(temp);
       }
       System.out.println("ArrayList after reverse : " + aList);
    }
}
