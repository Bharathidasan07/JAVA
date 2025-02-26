package EASY;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] nums = {1,1,0,1,1,1,0,1};
		// My first Brute force approach itself a fine solution because it is a simple question
		System.out.println(maxConsecutiveOnes(nums));

	}
	public static int maxConsecutiveOnes(int[] nums) {
		int max = 0,count = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==1) {
				count+=1;
			}else {
				if(count>max) {
					max=count;
				}
				count = 0;
			}
		}
		if(count>max) {
			max=count;
		}
		return max;
	}

}
