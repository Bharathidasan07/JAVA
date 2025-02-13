package EASY;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//silent listen heart earth
		
		String s1 = "silent";
		String s2 = "listen";
		int freq[] = new int[26];
		for(char c : s1.toLowerCase().toCharArray()) {
			int val = c-97;
			freq[val]+=1; 
		}
		System.out.println(Arrays.toString(freq));
		for(char c : s2.toLowerCase().toCharArray()) {
			int val = c-97;
			freq[val]-=1; 
		}
		System.out.println(Arrays.toString(freq));
		for(int i : freq) {
			if(i!=0) {
				System.out.println("Not Anagram");
			}
		}
//		int val = s1.charAt(0);
//		int val2 = 'z';
//		System.out.println(val2);

	}

}
