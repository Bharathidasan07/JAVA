package EASY;

import java.util.*;

public class ApplesInBasket {

	public static void main(String[] args) {
		// the basket size is given and the array of apple(size) also given
		// how many apples can fit into that basket
		
		Scanner s = new Scanner(System.in);
		int basktSize= 5150,arrSize =6;
		int[] arr = {900,950,800,1000,700,800};
//		System.out.print("Enter the Size of the basket : ");
//		basktSize = s.nextInt();
//		System.out.print("Enter the Array Size : ");
//		arrSize = s.nextInt();
//		arr = new int[arrSize];
//		System.out.print("Enter Array Elements : ");
//		for(int i=0;i<arrSize;i++) {
//			arr[i] = s.nextInt();
//		}
		Arrays.sort(arr);
		System.out.println("Sorted Array : "+Arrays.toString(arr));
		
		// here i used two pointer approach but it is not needed for this question we can simply
		// add elements one by one and check if sum>=basktSize then break it works
//		int p1=0,p2=arrSize-1,sum=0,count=0;
//		while(p1<=p2) {
//				if(sum+arr[p2]<=basktSize) {
//					sum+=arr[p2];
//					count++;
//					p2--;
//				}else {
//					if(sum+arr[p1]<=basktSize) {
//						sum+=arr[p1];
//						count++;
//						p1++;
//					}else {
//						break;
//					}
//				}
//		}
		
		// simple for loop execution
		int sum=0,count=0;
		for(int i=0;i<arr.length;i++) {
			if(sum+arr[i]>basktSize) {
				break;
			}else if(sum+arr[i]==basktSize) {
				sum+=arr[i];
				count+=1;
				break;
			}else {
				sum+=arr[i];
				count+=1;
			}
		}
		System.out.println(sum);
		System.out.println(count);

	}

}
