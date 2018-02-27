package tasks;

import java.util.StringTokenizer;

public class stringToken {
  public static void main(String[] args) {
	StringTokenizer  st = new StringTokenizer("Hello World");
	System.out.println(st.nextToken());
	System.out.println(st.countTokens());
	
}
}
