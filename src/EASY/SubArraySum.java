package EASY;

import java.util.*;

public class SubArraySum {
			// Here the question is we need to find the sum for the given subArray in 2D Matrix
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},
					   {5,6,7,8},
					   {9,10,11,12},
					   {13,14,15,16}};
		
		// Pre-processing Array
		// Here the pre-processing array is created using two nested for loop
		// This can be done using single nested for loop
//		for(int i=0;i<arr.length;i++) {
//			for(int j=1;j<arr.length;j++) {
//				arr[i][j]=arr[i][j]+arr[i][j-1];
//			}
//		}
//		for(int j=0;j<arr.length;j++) {
//			for(int i=1;i<arr.length;i++) {
//				arr[i][j]=arr[i][j]+arr[i-1][j];
//			}
//		}
		
		// Pre-processing Array using single nested for loop
		// for this we need another array
		int[][] nArr = new int[arr.length +1][arr[0].length +1];
		for(int i=1;i<=arr.length;i++) {
			for(int j=1;j<=arr[0].length;j++) {
				nArr[i][j]=arr[i-1][j-1]+nArr[i][j-1]+nArr[i-1][j]-nArr[i-1][j-1];
			}
		}
		
		//Sub Array Sum 
		for(int[] row: nArr) {
			System.out.println(Arrays.toString(row));
		}
		// Start i,j = 03 end i,j = 23
		// if we use nArr then the below if else conditions no need to be used 
		int si=0,sj=3,ei=2,ej=3;
//		int sas=arr[ei][ej];
//		if(si>0) {
//			sas-=arr[ei-1][ej];
//		}
//		if(sj>0) {
//			sas-=arr[ei][ej-1];
//		}
//		if(si>0 && sj>0) {
//			sas+=arr[ei-1][ej-1];
//		}
//		
//		System.out.println(sas);
		
		//When using nArr method
		si++;
		sj++;
		ei++;
		ej++;
		int result = nArr[ei][ej]-nArr[si-1][ej]-nArr[ei][sj-1]+nArr[si-1][ei-1];
		System.out.println(result);
		
		//System.out.println(Arrays.deepToString(arr));

	}

}
