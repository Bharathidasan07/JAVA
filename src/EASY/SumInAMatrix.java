package EASY;

import java.util.*;

public class SumInAMatrix {
			
	public static void main(String[] args) {
		
		// First brute force approach which failed in some test cases
		// arr = [[7,2,1],[6,4,2],[6,5,3],[3,2,1]]
		// i find max element in each row from that which is max added in the
		// result. like wise second largest in each row is compared and added and so on
		
//		int[][] arr = {{7,2,1},{6,4,2},{6,5,3},{3,2,1}};
//		int colLen = arr[0].length;
//		int end = colLen;
//		int rowLen = arr.length;
//		int rowBig,result = 0,colBig;
//		for(int l=0;l<end;l++) {
//			colBig = 0;
//			for(int i=0;i<rowLen;i++) {
//				rowBig = 0;
//				int rowi=0,coli=0;
//				for(int j=0;j<colLen;j++) {
//					if(arr[i][j]>rowBig) {
//						rowBig = arr[i][j];
//						rowi=i;
//						coli=j;
//					}
//				}
//				arr[rowi][coli]=0;
//				System.out.println(Arrays.deepToString(arr));
//				if(rowBig>colBig) {
//					colBig = rowBig;
//				}
//				System.out.println(colBig);
//			}
//			System.out.println();
//			result+=colBig;
//			System.out.println(result);
//		}
//		
//		System.out.println(result);
		
		// This solution is most optimized solution with time complexity of 13 ms
		
		int[][] arr = {{7,2,1},{6,4,2},{6,5,3},{3,2,1}};
		int rowLen = arr.length, colLen = arr[0].length;
		int result=0;
		
		for(int i=0;i<rowLen;i++) {
			Arrays.sort(arr[i]);
		}
		
		for(int i=0;i<colLen;i++) {
			int maxInCol = 0;
			for(int j=0;j<rowLen;j++) {
				if(arr[j][i]>maxInCol) {
					maxInCol = arr[j][i]; 
				}
			}
			result+=maxInCol;
		}
		System.out.println(result);
		
		// ChatGPT generated solution i optimized it and showed above
		
//		 int m = nums.length, n = nums[0].length;
//	        int result = 0;
//
//	        // Step 1: Sort each row in non-decreasing order
//	        for (int i = 0; i < m; i++) {
//	            Arrays.sort(nums[i]);
//	        }
//
//	        // Step 2: Pick the max in each column and sum up
//	        for (int j = 0; j < n; j++) {
//	            int maxInCol = 0;
//	            for (int i = 0; i < m; i++) {
//	                maxInCol = Math.max(maxInCol, nums[i][j]);
//	            }
//	            result += maxInCol;
//	        }
//
//	        return result;
		
		
		
//		int colBig,rowBig,result=0;
//        int rowLen = nums.length;
//        int colLen = nums[0].length;
//        int end = colLen;
//        for(int l=0;l<end;l++){
//            colBig = 0;
//            for(int i=0;i<rowLen;i++){
//                rowBig = 0;
//                int rowi=0,colj=0;
//                for(int j=0;j<colLen;j++){
//                    if(nums[i][j]>rowBig){
//                        rowBig = nums[i][j];
//                        rowi=i;
//                        colj=j;
//                    }
//                }
//                nums[rowi][colj]=0;
//                if(rowBig>colBig){
//                    colBig = rowBig;
//                }
//            }
//            result+=colBig; 
//        }
//        return result;
		
	}

}
