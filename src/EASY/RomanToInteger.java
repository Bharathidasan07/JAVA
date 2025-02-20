package EASY;

import java.util.*;

public class RomanToInteger {

	public static void main(String[] args) {
		String s = "MCMXCIV";
		int i=0,n=s.length(),count=0;
        
		//My Brute force
//		while(i<n){
//            if(s.charAt(i)=='I'){
//                if(i==n-1){
//                    count+=1;
//                    break;
//                }
//                if(s.charAt(i+1)=='V'){
//                    count+=4;
//                    i+=2;
//                }else if(s.charAt(i+1)=='X'){
//                    count+=9;
//                    i+=2;
//                }else{
//                    count+=1;
//                    i++;
//                }
//            }else if(s.charAt(i)=='X'){
//                if(i==n-1){
//                    count+=10;
//                    break;
//                }
//                if(s.charAt(i+1)=='L'){
//                    count+=40;
//                    i+=2;
//                }else if(s.charAt(i+1)=='C'){
//                    count+=90;
//                    i+=2;
//                }else{
//                    count+=10;
//                    i++;
//                }
//            }else if(s.charAt(i)=='C'){
//                if(i==n-1){
//                    count+=100;
//                    break;
//                }
//                if(s.charAt(i+1)=='D'){
//                    count+=400;
//                    i+=2;
//                }else if(s.charAt(i+1)=='M'){
//                    count+=900;
//                    i+=2;
//                }else{
//                    count+=100;
//                    i++;
//                }
//            }else if(s.charAt(i)=='V'){
//                count+=5;
//                i++;
//            }else if(s.charAt(i)=='L'){
//                count+=50;
//                i++;
//            }else if(s.charAt(i)=='D'){
//                count+=500;
//                i++;
//            }else if(s.charAt(i)=='M'){
//                count+=1000;
//                i++;
//            }
//        }
		// leetcode optimal solution
		Map<Character,Integer> HM = new HashMap<>();
		HM.put('I', 1);
		HM.put('V', 5);
		HM.put('X', 10);
		HM.put('L', 50);
		HM.put('C', 100);
		HM.put('D', 500);
		HM.put('M', 1000);
		for(i=0;i<n;i++) {
			if(i<n-1 && HM.get(s.charAt(i))<HM.get(s.charAt(i+1))) {
				count-=HM.get(s.charAt(i));
			}else {
				count+=HM.get(s.charAt(i));
			}
		}
        System.out.println(count);

	}

}
