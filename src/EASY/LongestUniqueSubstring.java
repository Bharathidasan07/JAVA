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
		String s = "abcabcbb";
		int l=0,r=0,count=0;
		Map<Character,Integer> HM = new HashMap<>();
		while(r<s.length()) {
			char cCh = s.charAt(r);
			int preSeenIdx = HM.getOrDefault(cCh, -1);
			if(preSeenIdx >= l) {
				l = preSeenIdx + 1;
			}
			HM.put(cCh, r);
			System.out.println("Each iteration count "+(r-l+1));
			count = Math.max(count, r-l+1);
			System.out.println("count "+count);
			r++;
		}
		System.out.println(count);
		
		/*
		 * if(HM.containsKey(s.charAt(r))) {
				int cc = r-l;
				if(cc > count) {
					count = cc;
				}
				if(HM.get(s.charAt(r))>l) {
					 
					HM.put(s.charAt(r), r);
				}else {
					r = HM.get(s.charAt(r))+1;
				}
			}else {
				HM.put(s.charAt(r), r);
				r++;
			}
		 */

	}

}
