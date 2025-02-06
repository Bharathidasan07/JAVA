package medium;

import java.util.*;

public class SumOfSquareNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c;
		System.out.println("Enter the Value : ");
		c = s.nextInt();
		
		// here in this brute force approach works for small values not for large values
		// Time limit exceeds
		
//		if(c==0||c==1) {
//			System.out.println("True");
//		}
//		for(int i=0;i<c/2;i++) {
//			for(int j=i;j<c/2;j++) {
//				int sum = i*i;
//				sum+=j*j;
//				if(sum == c) {
//					System.out.println("At "+i+","+j);
//					System.out.println("True");
//				}
//			}
//		}
		// Two pointer approach is better to solve this
		long p1=0,i=1,p2 = (long) Math.sqrt(c),flag=0;
		while(p1<p2) {
			long sum = (p1*p1)+(p2*p2);
			if(sum<c) {
				p1++;
			}else if(sum>c){
				p2--;
			}else {
				flag = 1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}

}
