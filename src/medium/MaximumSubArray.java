package medium;

import java.util.*;

public class MaximumSubArray {
	public static int maxSubArraySum(int[] nums) {
		int sum = 0, max=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			if(sum>max) {
				max = sum;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
				   //{-2,-1,-4,0,-1,1,2,-3,1}
		int n = nums.length;
		int p1=0,p2=n-1,max=Integer.MIN_VALUE;
		// This is not the correct approach to the solution
		// The Medium Question will not be that easy to solve
		System.out.println(maxSubArraySum(nums));
		// This approach misses some potential subArrays 
		/*
		 * Wrong Answer
			179 / 210 testcases passed
			Input : nums = [1,2,-1,-2,2,1,-2,1,4,-5,4]
			Output 
			5
			Expected
			6
		 */
//		while(p1<p2) {
//			int Csum = 0;
//			for(int i=p1;i<p2;i++) {
//				Csum+=nums[i];
//			}
//			if(Csum>max) {
//				max=Csum;
//			}
//			if(nums[p1]<nums[p2]) {
//				p1++;
//			}else {
//				p2--;
//			}
//		}
		//{1,2,-1,-2,2,1,-2,1,4,-5,4}
		//Brute force approach Still Incomplete
		// Here the solution is correct but Time limit is exited for a large array value
		for(int i=0;i<n;i++) {
			int Csum =nums[i];
			for(int j=i+1;j<n;j++) {
				Csum+=nums[j];
				if(Csum>max) {
					max=Csum;
				}
			}
		}
		
		System.out.println(max);

	}

}
