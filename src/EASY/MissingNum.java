package EASY;

import java.util.*;

public class MissingNum {

	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		List<Integer> AL = new ArrayList<>();
		Set<Integer> HS = new HashSet<>();
		int n = nums.length,mn,Asum=0,Nsum;
		
		//In this brute force approach we can find the missing sum but time complexity is 6ms
		// It can be reduced to 0ms that is given below
//		for(int i=0;i<n;i++) {
//			HS.add(nums[i]);
//		}
//		System.out.println(HS.toString());
//		for(int i=0;i<=n;i++) {
//			if(!HS.contains(i)) {
//				System.out.println(i);
//			}
//		}
		
		// total sum - given array sum
		// Eg: if n = 5 then sum = 15, given arr = {0,1,2,3,4} GAsum = 10 sum-GAsum= 5 MN = 5
		Nsum = (n*(n+1))/2;
		for(int e : nums) {
			Asum+=e; 
		}
		System.out.println(Nsum-Asum);
	}

}
