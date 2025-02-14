package EASY;

import java.util.*;

public class LongestUniqueSubstring {

	public static void main(String[] args) {
		// Brute force
//		String s = "abacdefd";
//		int start=0,end=1,maxLen=1,len=1;
//		for(int i=0;i<s.length();i++) {
//			Set<Character> HS = new HashSet<>();
//			int ce=i;
//			for(int j=i;j<s.length();j++) {
//				if(HS.contains(s.charAt(j))) {
//					ce = j;
//					len = j-i;
//					break;
//				}else {
//					HS.add(s.charAt(j));
//				}
//			}
//			if(len>maxLen) {
//				maxLen = len;
//				start = i;
//				end = ce;
//			}
//		}
//		System.out.println(s.substring(start, end));
		//Sliding window method
		String s = "abcbdaac";
		int l=0,r=0,count=0;
		Map<Character,Integer> HM = new HashMap<>();
		while(r>s.length()) {
			if(HM.containsKey(s.charAt(r))) {
				int cc = r-l;
				if(cc > count) {
					count = cc;
				}
				if(HM.get(s.charAt(r))<r) {
					HM.put(s.charAt(r), r);
				}else {
					r = HM.get(s.charAt(r))+1;
				}
			}else {
				HM.put(s.charAt(r), r);
				r++;
			}
		}

	}

}
