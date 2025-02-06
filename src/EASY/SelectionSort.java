package EASY;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {9,3,1,4,2,7,5};
		System.out.println("Unsorted Array : "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			int min = arr[i],index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					index = j;
				}
			}
			int temp = arr[i];
			arr[i]=min;
			arr[index] = temp;
		}
		System.out.println("Sorted Array : "+Arrays.toString(arr));

	}

}
