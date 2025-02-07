package medium;

import java.util.*;

public class TotalBasktForAllApples {

	public static void main(String[] args) {
		// here the basket size is given and array(Size of apple) is given
		// we need to find how many baskets required to empty the array
		
		int[] arr = {5,3,8,2,6,8,15,9,6,6};
		int size = 15;
		Arrays.sort(arr);
		int count=0,sum=0,p1=0,p2=arr.length-1;
		if(arr[p2]>size) {
			System.out.println("Basket size is small");
		}
		while(arr[p2]<=size && p1<p2) {
			if(sum+arr[p2]==size) {
				count++;
				p2--;
				sum=0;
			}else if(sum+arr[p2]>size) {
				if(sum+arr[p1]>=size) {
					count++;
					p1++;
					sum=0;
				}else {
					sum+=arr[p1];
				}
			}else {
				sum+=arr[p2];
			}
		}
		System.out.println(count);

	}

}
