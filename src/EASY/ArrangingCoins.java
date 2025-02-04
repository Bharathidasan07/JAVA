package EASY;

import java.util.*;

public class ArrangingCoins {

	public static void main(String[] args) {
		// here the brute force approach works for small numbers but not for large
		int n, sc=0 , num=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter N : ");
		n = s.nextInt();
//		for(int i=1;i<n;i++) {
//			num+=i;
//			if(num>n) {
//				break;
//			}
//			sc+=1;
//		}
//		System.out.println(sc+" steps can be formed");
//		System.out.println(Integer.MAX_VALUE);
		// Mathematical approach
		int result = (int) (Math.sqrt((8*n)+1)-1)/2;
		System.out.println(result);
	}

}
