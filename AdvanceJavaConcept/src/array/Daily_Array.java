package array;

public class Daily_Array {
	public static boolean no23(int[]nums) {
		if(nums[0]==1&&nums[1]==3||nums[1]==1&&nums[2]==3
		||nums[2]==1&&nums[3]==3||nums[3]==1&&nums[4]==3)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		int[]a= {1,3,4,5};
	System.out.println(no23(a));
		int[]b= {2,1,3,4,5};
		System.out.println(no23(b));
		int[]c= {1,1,1};
		System.out.println(no23(c)); }
	}

