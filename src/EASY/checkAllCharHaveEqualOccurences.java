package EASY;

import java.util.Arrays;

public class checkAllCharHaveEqualOccurences {

	public static void main(String[] args) {
		String s = "aabcbc";
		System.out.println(check(s));
	}
	
	private static boolean check(String s) {
		int[] arr = new int[26];
        for(char c: s.toCharArray()){
            arr[c-97]+=1;
        }
        System.out.println(Arrays.toString(arr));
        int count = s.charAt(0)-97;
        System.out.println(arr[count]);
        for(int i:arr){
            if(i!=0 && i!=arr[count]){
                return false;
            }
        }
        return true;
	}

}
