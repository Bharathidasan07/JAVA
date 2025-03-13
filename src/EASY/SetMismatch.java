package EASY;

import java.util.*;

public class SetMismatch {

	public static void main(String[] args) {
		 int[] nums = {2,2};
		 System.out.println(Arrays.toString(setMismatch(nums)));
	}
	// My approach is also similar but i used two extra variable and a loop
	// but my approach takes 9ms the below approach takes 11ms
	private static int[] setMismatch(int[] nums) {
		int n = nums.length;
		int sum = n*(n+1)/2,sum1=0;
		int[] output = new int[2];
		Set<Integer> HS = new HashSet<>();
		for(int num:nums) {
			if(HS.add(num)) {
				sum1+=num;
			}else {
				output[0] = num;
			}
		}
		output[1] = sum-sum1;
		return output;
	}

}
