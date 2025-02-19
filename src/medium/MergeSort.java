package medium;

import java.util.*;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {5,1,1,2,0,0};
		System.out.println("Unsorted Array : "+Arrays.toString(arr));
		divideInPlace(arr,0,arr.length);
//		System.out.println("Sorted Array : "+Arrays.toString(divide(arr)));
		System.out.println("Sorted Array : "+Arrays.toString(arr));
	}
	
	public static int[] divide(int[] nums) {
		if(nums.length==1) {
			return nums;
		}
		
		int mid = nums.length/2;
		int[] left = divide(Arrays.copyOfRange(nums, 0,mid));
		int[] right = divide(Arrays.copyOfRange(nums, mid,nums.length));
		
		return merge(left,right);
	}
	
	public static int[] merge(int[] first, int[] second) {
		int[] joined = new int[first.length+second.length];
		int i=0,j=0,k=0;
		
		while(i<first.length && j<second.length) {
			if(first[i]<second[j]) {
				joined[k++] = first[i++];
			}else {
				joined[k++] = second[j++];
			}
		}
		
		while(i<first.length) {
			joined[k++] = first[i++];
		}
		while(j<second.length) {
			joined[k++] = second[j++];
		}
		
		return joined;
	}
	
	public static void divideInPlace(int[] nums,int s, int e) {
		if(e-s==1) {
			return;
		}
		
		int mid = s+(e-s)/2;
		divideInPlace(nums, s,mid);
		divideInPlace(nums, mid,e);
		
		mergeInPlace(nums,s,mid,e);
	}
	
	public static void mergeInPlace(int[] nums, int s,int m, int e) {
		int[] joined = new int[e-s];
		int i=s,j=m,k=0;
		while(i<m && j<e) {
			if(nums[i]<nums[j]) {
				joined[k++] = nums[i++];
			}else {
				joined[k++] = nums[j++];
			}
		}
		
		while(i<m) {
			joined[k++] = nums[i++];
		}
		while(j<e) {
			joined[k++] = nums[j++];
		}
		
		for(k=0;k<joined.length;k++) {
			nums[s+k] = joined[k];
		}
	}

}
