package EASY;

import java.util.*;

public class SubArraySum {
			// Here the question is we need to find the sum for the given subArray in 2D Matrix
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},
					   {5,6,7,8},
					   {9,10,11,12},
					   {13,14,15,16}};
		
		// Preprocessing Array
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				arr[i][j]=arr[i][j]+arr[i][j-1];
			}
		}
		for(int j=0;j<arr.length;j++) {
			for(int i=1;i<arr.length;i++) {
				arr[i][j]=arr[i][j]+arr[i-1][j];
			}
		}
		
		//Sub Array Sum 
		for(int[] row: arr) {
			System.out.println(Arrays.toString(row));
		}
		// Start i,j = 03 end i,j = 23
		int si=0,sj=3,ei=2,ej=3;
		int sas=arr[ei][ej];
		if(si>0) {
			sas-=arr[ei-1][ej];
		}
		if(sj>0) {
			sas-=arr[ei][ej-1];
		}
		if(si>0 && sj>0) {
			sas+=arr[ei-1][ej-1];
		}
		
		System.out.println(sas);
		
		//System.out.println(Arrays.deepToString(arr));

	}

}
