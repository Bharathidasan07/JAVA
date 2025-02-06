package EASY;

import java.util.*;

public class PatternUsingRecursion {

	public static void main(String[] args) {
		// input = 5
		/*
		 * _ _ _ _ 1
		 * _ _ _ 2 3 2
		 * _ _ 3 4 5 4 3
		 * _ 4 5 6 7 6 5 4
		 * 5 6 7 8 9 8 7 6 5
		 */
		// This method is brute force method
		Scanner s = new Scanner(System.in);
		int n,sp,inc=1,incE=1,dec=0,decE=0;
		System.out.print("Enter Input : ");
		n = s.nextInt();
		sp=n-1;
		// Recursion method
		// My method doesn't worked
//		pattern(sp,inc,incE,dec,decE);
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<sp;j++) {
//				System.out.print("  ");
//			}
//			for(int k=inc;k<=incE;k++) {
//				System.out.print(" "+k);
//			}
//			for(int l=dec;l>decE;l--) {
//				System.out.print(" "+l);
//			}
//			sp-=1;
//			inc+=1;
//			incE+=2;
//			dec+=2;
//			decE+=1;
//			System.out.println();
//		}
//		
		// Another YouTube method
		for(int i=1;i<=n;i++) {
			int num=i;
			for(int j=1;j<=n+i-1;j++) {
				if(j<=n-i) {
					System.out.print("-");
				}else if(j<=n) {
					System.out.print(num++);
				}else {
					System.out.print(--num-1);
				}
			}
			System.out.println();
		}
		
	}
	
	public static void pattern(int sp,int inc,int incE,int dec,int decE) {
		/*
		 * _ _ _ _ 1
		 * _ _ _ 2 3 2
		 * _ _ 3 4 5 4 3
		 * _ 4 5 6 7 6 5 4
		 * 5 6 7 8 9 8 7 6 5
		 */
		for(int j=0;j<sp;j++) {
			System.out.print("  ");
		}
		for(int k=inc;k<=incE;k++) {
			System.out.print(" "+k);
		}
		for(int l=dec;l>decE;l--) {
			System.out.print(" "+l);
		}
		System.out.println();
		pattern(sp-=1,inc+=1,incE+=2,dec+=2,decE+=1);
	}
	

}
