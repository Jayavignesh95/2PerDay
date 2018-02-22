import java.util.ArrayList;
import java.util.Iterator;

class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("Arun");
		list.add("Bob");
		list.add("Cane");// adding element
		list.add(3, "Bob1");// adding via index
		System.out.println(list.toString()); // printing list
		System.out.println(list.get(2));
		System.out.println(list.contains("Bob"));
		System.out.println(list.contains("JV"));
		System.out.println(list.indexOf("Arun"));
		// To update the element in the arraylist
		list.set(2, "Cane New");
		System.out.println(list.toString());
		list.remove(1);
		// list.clear();
		// list.removeAll();
		// System.out.println(list.toString());
		// Traversing the list
		System.out.println("Elements in the list");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " " + list.get(i));
		}
		// Enchaned For Loop
		System.out.println("Type two");
		for (String name : list) {
			System.out.println(name);
		}
		// Iterator
		System.out.println("----------------------------------");
		System.out.println("Iterator");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
