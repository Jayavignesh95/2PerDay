package tasks;

public class ArrayFindPair {
	public static boolean hasPair(int[] nums) {
		  int i;
		for (i = 0; i < nums.length-2; i++)
		  {
		    if (nums[i] == 7 && (nums[i+1] == 7 || nums[i+2] == 7))
		      return true; 
		  }
		  
		  if (nums.length > 2 && nums[i]==7 && nums[i+1] == 7)
		    return true;
		  else
		    return false;

		}
	
	public static void main(String[] args) {
		int[] arr ={6,8,5,7,3,1,2};
		System.out.println("Given array"+arr);
		System.out.println("Pair is availability :"+ArrayFindPair.hasPair(arr));
		
		
	}

}
