import java.util.Iterator;
import java.util.LinkedList;

class LinkedListExample {
public static void main(String[] args) {
	LinkedList<String> list= new LinkedList<>();
	list.add("AA");
	list.add("BB");
	list.add("AA");
	list.add("BBBB");
	list.removeFirst();
	list.removeFirstOccurrence("BB");
	System.out.println(list.toString());
	System.out.println(list.poll());
	Iterator<String> itr=list.descendingIterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
