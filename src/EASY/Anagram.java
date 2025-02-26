package EASY;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		//silent listen heart earth
		// This approach takes less time than Hashmap approach
//		String s1 = "silent";
//		String s2 = "listen";
//		int freq[] = new int[26];
//		for(char c : s1.toLowerCase().toCharArray()) {
//			int val = c-97;
//			freq[val]+=1; 
//		}
//		System.out.println(Arrays.toString(freq));
//		for(char c : s2.toLowerCase().toCharArray()) {
//			int val = c-97;
//			freq[val]-=1; 
//		}
//		System.out.println(Arrays.toString(freq));
//		for(int i : freq) {
//			if(i!=0) {
//				System.out.println("Not Anagram");
//			}
//		}
		// This approach works properly but it takes 18ms but there are solutions which take less than 
		// 0ms The above approach takes 5ms only if the range can be identified they use freq array 
		String s = "anagram", t= "aganmay";
		if(isAnagram(s,t)) {
			System.out.println("Given Strings are Anagram");
		}else {
			System.out.println("Given Strings are not Anagram");
		}
//		int val = s1.charAt(0);
//		int val2 = 'z';
//		System.out.println(val2);

	}
	public static boolean isAnagram(String s, String t) {
		Map<Character,Integer> HM = new HashMap<>();
        for(char c: s.toLowerCase().toCharArray()){
            HM.put(c,HM.getOrDefault(c,0)+1);
        }
        for(char c: t.toLowerCase().toCharArray()){
            HM.put(c,HM.getOrDefault(c,0)-1);
        }
        for(Map.Entry<Character,Integer> entry: HM.entrySet()){
            if(entry.getValue()!=0){
                return false;
            }
        }
        return true;
	}

}
