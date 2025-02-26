package medium;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {

	public static void main(String[] args) {
		int[] nums = {1,1,1};
		int k = 2;
		// This presum method is the optimized solution 
		int preSum = 0, count = 0;
		Map<Integer,Integer> HM = new HashMap<>();
		HM.put(0, 1);
		for(int i=0;i<nums.length;i++) {
			preSum+=nums[i];
			if(HM.containsKey(preSum-k)) {
				count=count+HM.get(preSum-k);
			}
			HM.put(preSum,HM.getOrDefault(preSum, 0)+1 );
		}
		System.out.println(count);
	}

}
