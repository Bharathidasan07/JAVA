package medium;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		//Given an array we should rotate it for k times
		// This approach is my approach which satisfies all testcase
		int[] nums = {1,2,3,4,5,6,7,8,9}; 
		int k = 18;
		rotateArray(nums,k);
		System.out.println(Arrays.toString(nums));

	}
	
	public static void rotateArray(int[] nums, int k) {
		
		int n = nums.length;
		if(k%n==0) {
			return;
		}
		// first i mod the k with len of nums because the rotation greater than k will be done within len
		// all possibilities come under this condition
		k=k%n;
		// temp array is created to store the elements with len k. i am going to sawp all the elements 
		// after nums[k] to temp
		int[] temp = new int[k];
		int l=n-k;
		for(int i=0;i<k;i++) {
			temp[i] = nums[l++];
		}
		System.out.println(Arrays.toString(temp));
		//The elements from 0 to k swap to end using two pointer
		int p1 =n-1,p2=n-k-1;
		while(p2>=0) {
			nums[p1]=nums[p2];
			p1--;
			p2--;
		}
		//Replacing the temp elements in first half of the array
		for(int i=0;i<k;i++) {
			nums[i]=temp[i];
		}
		// Now the array will be rotated
		
	}

}
