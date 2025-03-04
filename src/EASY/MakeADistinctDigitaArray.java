package EASY;

import java.util.*;

public class MakeADistinctDigitaArray {

	public static void main(String[] args) {
		int[] nums = {131, 11, 48};
		System.out.println(Arrays.toString(distinctArray(nums)));

	}
	private static int[] distinctArray(int[] nums) {
		Set<Integer> HS = new HashSet<>();
		for(int num:nums) {
			int temp = num;
			while(temp!=0) {
				int val = temp%10;
				HS.add(val);
				temp=temp/10;
			}
		}
		int[] arr = new int[HS.size()];
		int i=0;
		for(int num:HS) {
			arr[i++] = num;
		}
		return arr;
	}

}
