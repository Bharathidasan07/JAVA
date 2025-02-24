package EASY;

import java.util.*;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9};
		boolean chk = false;
		//This Question is simple to solve 
		//just check whether number already present in HM then Contains duplicate 
		Map<Integer,Integer> HM = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(HM.containsKey(nums[i])) {
				chk = true;
				break;
			}else {
				HM.put(nums[i], i);
			}
		}
		if(chk) {
			System.out.println("Contains Duplicates");
		}else {
			System.out.println("No Duplicates");
		}
	}

}
