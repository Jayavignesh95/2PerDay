package tasks;

public class ArrayMinMax {

	public static int getMaxElement(int[] arr)
	{ 
		int max = arr[0]; 
		for(int i=1;i < arr.length;i++)
		{ 
			if(arr[i] > max)
			{ 
				max = arr[i]; 
			} 
		} 
		return max; 
	}

	public static int getMinElement(int[] arr)
	{ 
		int min = arr[0]; 
		for(int i=1;i<arr.length;i++)
		{ 
			if(arr[i] < min)
			{ 
				min = arr[i]; 
			} 
		} 
		return min; 
	} 



	public static void main(String args[])
	{
		int array[] = new int[]{55,109 ,30, 4, 43, 87};

		int max = getMaxElement(array);
		System.out.println("Max Element in Array :  "+max);

		int min = getMinElement(array);
		System.out.println("Min Element in Array :  "+min);
	}


}


