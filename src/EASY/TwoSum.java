package EASY;

import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		int target = 0;
		List<List<Integer>> AL = new ArrayList<>();
		Map<Integer,Integer> HM = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int compliment = target - nums[i];
			if(HM.containsKey(compliment)) {
				AL.add(Arrays.asList(i,HM.get(compliment)));
			}
			HM.put(nums[i], i);
		}
		System.out.println(AL);
	}

}
