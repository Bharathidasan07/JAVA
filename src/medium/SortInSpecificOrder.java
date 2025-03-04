package medium;

import java.util.Arrays;

public class SortInSpecificOrder {

	public static void main(String[] args) {
		long[] arr = {16547, 22023, 15266, 10725, 4241, 23586, 32484, 14763, 17885, 15011, 25456, 6686,
				20361, 7381, 15989, 1659, 2922, 31372, 13449, 11477, 23512, 9993, 7417, 21525, 17834,
				18205, 12125, 9024, 10850, 29330, 12144, 28152};
		System.out.println(Arrays.toString(sort(arr)));
	}
	
	private static long[] sort(long[] arr) {
		int p1=0,p2=arr.length-1;
        while(p1<p2){
            long oddBig=0,evenBig=0;
            int oddIdx=0,evenIdx=0;
            for(int i=p1;i<=p2;i++){
                if(arr[i]%2!=0 && arr[i]>oddBig){
                    oddBig = arr[i];
                    oddIdx = i;
                }
                if(arr[i]%2==0 && arr[i]>evenBig){
                    evenBig = arr[i];
                    evenIdx = i;
                }
            }
            if(oddBig!=0) {
            	long temp=arr[p1];
                arr[p1]=oddBig;
                arr[oddIdx]=temp;
            }
            
            if(evenBig!=0) {
            	long temp=arr[p2];
                arr[p2]=evenBig;
                arr[evenIdx]=temp;
            }
            
            
            p1++;
            p2--;
        }
        return arr;
	}

}
