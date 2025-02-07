package EASY;

import java.util.Arrays;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "vishwavb";
		String reverse = "";
		for(int i=s.length()-1;i>=0;i--) {
			reverse+=s.charAt(i);
		}
		System.out.println(reverse);
		// The below method is suitable to change in place if char arr is given
		// Two pointer method
//		char[] arr = s.toCharArray();
//		int p1=0,p2=s.length()-1;
//		char temp;
//		while(p1<p2) {
//			temp = arr[p1];
//			arr[p1] = arr[p2];
//			arr[p2] = temp;
//			p1++;
//			p2--;
//		}
//		
//		System.out.println(Arrays.toString(arr));

	}

}
