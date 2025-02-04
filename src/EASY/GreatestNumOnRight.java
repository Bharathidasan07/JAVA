package EASY;

import java.util.*;

import java.util.Arrays;

public class GreatestNumOnRight {

	public static void main(String[] args) {
		int[] arr = {17,18,5,4,6,1};
		int n = arr.length,temp,max=-1;
		//Here the Gre num after that num so the best way is iterating from last see the code below
		for(int i=n-1;i>=0;i--) {
			temp = arr[i];
			arr[i] = max;
			if(temp>max) {
				max = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		// This brute force approach took more time
//        for(int i=0;i<n;i++){
//            int Cmax = 0;
//            for(int j=i+1;j<n;j++){
//                if(arr[j]>Cmax){
//                    Cmax = arr[j];
//                }
//            }
//            arr[i]=Cmax;
//        }
//        arr[n-1]=-1;
//        System.out.println(Arrays.toString(arr));
		
		
	}

}
