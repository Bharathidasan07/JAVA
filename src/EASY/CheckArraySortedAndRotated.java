package EASY;

public class CheckArraySortedAndRotated {

	public static void main(String[] args) {
		int[] nums = {2,7,4,1,2,6,2};
		//In my Brute Force i check the current element with the next element and the edge case last element
		// is also compared inside if but it doesn't satisfied all test case
		// 2,7,4,1,2,6,2 This test case fails for my brute force
//		for(int i=0;i<nums.length-1;i++) {
//			if(nums[i]>nums[i+1]) {
//				if(nums[nums.length-1]>nums[0]) {
//					System.out.println("false");
//				}
//			}
//		}
		// Leetcode best solution my approach is similar to it but i need to evaluate the edge case when it
		// reaches last element here they kept irregularity if irregularity > 1 then false.
		int irregularities = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>nums[(i+1)%nums.length]) {
				irregularities+=1;
			}
		}
		if(irregularities>1) {
			System.out.println("False");
		}else {
			System.out.println("True");
		}

	}

}
