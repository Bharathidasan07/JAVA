package hard;

import java.util.*;

public class FourSum {

	public static void main(String[] args) {
		int[] nums = {1, 0, -1, 0, -2, 2};
		Arrays.sort(nums);
		int n = nums.length;
		List<List<Integer>> AL = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(i>0 && nums[i]==nums[i-1]) {
				continue;
			}
			for(int j=i+1;j<n;j++) {
				if(j>i+1 && nums[j]==nums[j-1]) {
					continue;
				}
				int k=j+1;
				int m=n-1;
				while(k<m) {
					int sum = nums[i]+nums[j]+nums[k]+nums[m];
					if(sum<0) {
						k++;
					}else if(sum>0) {
						m--;
					}else {
						AL.add(Arrays.asList(nums[i],nums[j],nums[k],nums[m]));
						k++;
						m--;
						while(k<m && nums[k]==nums[k-1]) {
							k++;
						}
					}
				}
			}
		}
		System.out.println(AL);
		
	}

}
