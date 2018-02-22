package dailyTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class DuplicateChars {
public static void main(String[] args) throws IOException {
	String word;
	BufferedReader read =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the string");
	word=read.readLine();
	System.out.println(word);
	char[] chars=word.toCharArray();
	HashMap<Character, Integer> dups=new HashMap<>();
	for(Character letters : chars)
	{
		if(dups.containsKey(letters))
		{
			dups.put(letters, dups.get(letters)+1);
		}
		else
		{
			dups.put(letters,1);
		}
	}
	System.out.println(dups.toString());
	
}
}
