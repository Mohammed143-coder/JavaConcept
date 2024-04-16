package array;

public class Main_Array {
	public static boolean firstlast6(int[] nums) {
	if(nums[0]==6||nums[nums.length-1]==6) {
		return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		int[]input1= {1,2,6};
		System.out.println(firstlast6(input1));
	}

	
		    
		

 }


	
	