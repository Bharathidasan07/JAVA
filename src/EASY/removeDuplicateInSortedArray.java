package EASY;

import java.util.*;

public class removeDuplicateInSortedArray {
			//[0,0,1,1,1,2,2,3,3,4]
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		int j=0,cnum=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=cnum) {
				arr[j]=cnum;
				cnum=arr[i];
				j++;
			}
		}
		arr[j]=arr[arr.length-1];
		System.out.println(Arrays.toString(arr));
		System.out.println(j);
		
	}

}
