package stringTuts;

public class StringExamples {

	public static void main(String[] args) {
		String s1="hello";
		String s2=null;
		//System.out.println(s2.equals(s1));
		StringBuffer sbuffer=new StringBuffer("Test");
		//System.out.println(s1.valueOf());
		System.out.println(sbuffer);
		sbuffer.append("Hey");
		System.out.println(sbuffer);
		//sbuffer.reverse();
		//System.out.println(sbuffer);
		sbuffer.replace(2,2,"New");
		System.out.println(sbuffer);
		sbuffer.reverse();
		String str=new String("ABC");
       System.out.println(str.charAt(0));	
       System.out.println(str.substring(1));	
       System.out.println(str.codePointAt(2));	
     //  System.out.println(str.charAt(1));	
       System.out.println(str.contentEquals("ABC1"));	
       System.out.println(str.startsWith("B",1));
     //System.out.println(str.matches());	
       
       
       
       
       
	
	
	}

}
