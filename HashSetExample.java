import java.util.*;
public class HashSetExample {
 public static void main(String[] args) {
	Set<String> hset=new HashSet<String>();
	for(int i=0;i<30;i++)
	{
		hset.add("A:"+i);
	}
	System.out.println(hset);
	Set<String> lhset=new LinkedHashSet<String>();
	for(int i=0;i<30;i++)
	{
		lhset.add("A:"+i);
	}
	System.out.println(lhset);

}
 
}
