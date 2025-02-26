package EASY;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		// My brute force solution. This method takes more time
		System.out.println(singleNumberUsingAL(nums));
		// This is the optimized solution
		System.out.println(singleNumberUsingExOr(nums));
		// Recursive Method
		System.out.println(singleNumberUsingRec(nums,0));
		

	}
	public static int singleNumberUsingRec(int[] nums, int i) {
		if(nums.length==1) {
			return nums[i];
		}
		if(i==nums.length-1) {
			return nums[i];
		}
		if(nums[i]==nums[i+1]) {
			return singleNumberUsingRec(nums,i+2);
		}else {
			return nums[i];
		}
	}
		
	public static int singleNumberUsingExOr(int[] nums) {
		int result = 0;
		for(int num:nums) {
			result^=num;
		}
		return result;
	}
	
	public static int singleNumberUsingAL(int[] nums) {
		List<Integer> AL = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			if(AL.contains(nums[i])) {
				AL.remove(Integer.valueOf(nums[i]));
			}else {
				AL.add(nums[i]);
			}
		}
		int num = AL.get(0);
		return num;
	}
}
