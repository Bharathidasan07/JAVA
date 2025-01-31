package medium;

import java.util.*;

public class LargestNumber {
			/*
			 * For this question first i need to solve more easy question and some medium 
			 * questions this question include more things to do lets do after some time
			 * Input: nums = [3,30,34,5,9]
			 * Output: "9534330"
			 */
			
	public static void main(String[] args) {
		int[] nums = {3,30,34,5,9};
		Map<Integer,Integer> HM = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int temp = nums[i];
			while(temp!=0) {
				int rem = temp%10;
				HM.put(rem, HM.getOrDefault(rem, 0)+1);
				temp/=10;
			}
		}

	}

}
