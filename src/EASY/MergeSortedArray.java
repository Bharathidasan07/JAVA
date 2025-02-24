package EASY;

import java.util.*;

public class MergeSortedArray {

	public static void main(String[] args) {
		//Here two Sorted arrays will be given we need put second array in first array in sorted order
		// n is len of a1 m is len of a2
		// n is the size of first arr and sec arr
		// eg. arr1 = {1,4,5,0,0,0} arr2 = {7,9,10}
		int[] arr1 = {1,4,8,0,0,0};
		int[] arr2 = {7,9,10};
		int n=3,m=3;
		int i=n-1,j=m-1,k=n+m-1;
		while(j>=0) {
			if(i>=0 && arr1[i]>arr2[j]) {
				arr1[k--] = arr1[i--];
			}else {
				arr1[k--] = arr2[j--];
			}
		}
		System.out.println(Arrays.toString(arr1));

	}

}
