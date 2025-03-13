package EASY;

public class SecondLargestNum {

	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 1};
		System.out.println("Second Largest Number : "+secondLargest(arr));

	}
	
	/*
	   Explanation:
			We keep track of the largest and second largest elements.
			If a new number is larger than largest, update largest and shift the old largest to secondLargest.
			If a number is smaller than largest but larger than secondLargest, update secondLargest.
			If secondLargest is still Integer.MIN_VALUE, it means all elements were the same, so return -1.
	   Complexity Analysis:
			Time Complexity: O(n) (only one loop).
			Space Complexity: O(1) (no extra space used).
	 */
	
	public static int secondLargest(int[] arr) {
		if(arr.length<2) {
			return -1;
		}
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>largest) {
				secondLargest = largest;
				largest = num;
			}else if(num>secondLargest && num!=largest) {
				secondLargest = num;
			}
		}
		return (secondLargest==Integer.MIN_VALUE)?-1:secondLargest;
	}

}
