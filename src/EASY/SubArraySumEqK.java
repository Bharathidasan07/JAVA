package EASY;

import java.util.*;

public class SubArraySumEqK {
			// Here the question is, we need find all the subArrays which has a sum of k 
			// new comment added
	public static void main(String[] args) {
		int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
		int k=3,count=0,preSum=0;
//		Map<Integer,Integer> HM = new HashMap<>();
//		HM.put(0, 1);
//		for(int i=0;i<arr.length;i++) {
//			preSum+=arr[i];
//			if(HM.containsKey(preSum-k)) {
//				count=count+HM.get(preSum-k);
//			}
//			HM.put(preSum, HM.getOrDefault(preSum, 0)+1);
//		}
//		System.out.println(count);
		int subArrayCount=0;
		for(int i=0;i<arr.length;i++) {
			int cSum = arr[i];
			if(cSum==k) {
				subArrayCount++;
			}
			for(int j=i+1;j<arr.length;j++) {
				cSum+=arr[j];
				if(cSum==k) {
					subArrayCount++;
				}
			}
		}
		System.out.println(subArrayCount);
	}

}
