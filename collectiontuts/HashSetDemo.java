package collectiontuts;

import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	HashSet<String> hs=new HashSet<String>();
	HashSet<String> hs1=new HashSet<String>(3);
	System.out.println(hs.add("ABC"));
	System.out.println(hs.add("CDE"));
	System.out.println(hs.add("CC"));
	System.out.println(hs.add("CC"));
	System.out.println(hs.add("BB"));
	System.out.println(hs.add("ZZ"));
	System.out.println(hs.toString());

	System.out.println(hs.contains("CC"));
	hs1.add("a");
	hs1.add("b");
	hs1.add("c");
	hs1.add("d");
	hs1.add("e");
	System.out.println(hs1.size());
	System.out.println(hs1);
	


}
}
