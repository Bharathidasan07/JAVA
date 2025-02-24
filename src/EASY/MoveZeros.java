package EASY;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		int n=nums.length;
		// Again my brute force method not satisfies all test case.
		// The optimized solution is simple, first i need to understand the question properly then to try
//		int p1 = 0,p2 = 1;
//		while(p2<n) {
//			while(nums[p1]!=0) {
//				p1++;
//			}
//			while(nums[p2]==0) {
//				p2++;
//			}
//			int temp = nums[p1];
//			nums[p1] = nums[p2];
//			nums[p2] = temp;
//			p1++;
//			p2++;
//		}
		// Leetcode optimized solution
		int idx = 0;
		for(int num:nums) {
			if(num!=0) {
				nums[idx++] = num;
			}
		}
		while(idx<n) {
			nums[idx++]=0;
		}
		System.out.println(Arrays.toString(nums));

	}

}
