package dailyTasks;

import java.util.Arrays;
class ArrayUtil
{
	public ArrayUtil() {
	System.out.println("jshdfhkjds");
	}
}

public class ArrayGen
{
  
	public static void main(String[] args) {

		Integer n = 3;
		int[] arr = new int[n * n];

		for (int i = n - 1; i < arr.length; i += n) {
			for (int j = i; j >= i - i / n; j--)
				{arr[j] = i - j + 1;
			System.out.println(i-j+1);
			
			}
			System.out.println("I  "+i);
		}
		System.out.println(Arrays.toString(arr));
	}

}
