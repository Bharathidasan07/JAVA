package medium;

import java.util.*;

public class ThreeSum {

	public static void main(String[] args) {
		// My first approach is not suitable for all test case
		// but it is a nice algo to convince interviewer 
//		List<List<Integer>> AL = new ArrayList<>();
//		Map<Integer,Integer> HM = new HashMap<>();
//		int[] nums = {-1,0,1,0};
//		int target = 0;
//		HM.put(nums[0], 0);
//		for(int i=2;i<nums.length;i++) {
//			List<Integer> List = new ArrayList<>();
//			int compliment = target - (nums[i-1]+nums[i]);
//			if(HM.containsKey(compliment)) {
//				List.add(compliment);
//				List.add(nums[i-1]);
//				List.add(nums[i]);
//				if(!AL.contains(List)) {
//					AL.add(List);
//				}
//			}
//			HM.put(nums[i-1], i-1);
//		}
//		System.out.println(AL);
		// Brute force solution which exceeds the time limit for large input
		/* like 82597,-9243,62390,83030,-97960,-26521,-61011,83390,-38677,12333,75987,
		 * 46091,83794,19355,-71037,-6242,-28801,324,1202,-90885,-2989,-95597,-34333,
		 * 35528,5680,89093,-90606,50360,-29393,-27012,53313,65213,99818,-82405,-41661,
		 * -3333,-51952,72135,-1523,26377,74685,96992,92263,15929,5467,-99555,-43348,-41689,
		 * -60383,-3990,32165,65265,-72973,-58372,12741,-48568,-46596,72419,-1859,34153,62937,
		 * 81310,-61823,-96770,-54944,8845,-91184,24208,-29078,31495,65258,14198, ........
		*/
//		int[] nums = {-1,0,1,2,-1,-4};
//		Arrays.sort(nums);
//        List<List<Integer>> AL = new ArrayList<>();
//        int target = 0;
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                for(int k=j+1;k<nums.length;k++){
//                    if(nums[i]+nums[j]+nums[k]==0){
//                        List<Integer> List = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
//                        if(!AL.contains(List)){
//                            AL.add(List);
//                        }
//                    }                    
//                }
//            }
//        }
//        return AL;
		// Second approach to use Hashmap
		// This second approach also Time Limit exceeds
//		int[] nums = {-1,0,1,2,-1,-4};
//		List<List<Integer>> AL = new ArrayList<>();
//		int target = 0;
//		Arrays.sort(nums);
//		for(int i=0;i<nums.length;i++){
//			Map<Integer,Integer> HM = new HashMap<>();
//            for(int j=i+1;j<nums.length;j++){
//            	int compliment = target - (nums[i]+nums[j]);
//            	if(HM.containsKey(compliment)) {
//            		List<Integer> List = new ArrayList<>(Arrays.asList(nums[i],nums[j],compliment));
//            		if(!AL.contains(List)){
//            			AL.add(List);
//            		}
//            	}
//            	HM.put(nums[j], j);
//            }
//		}
//		System.out.println(AL);
		// final optimal leetcode solution
		int[] nums = {-1,0,1,2,-1,-4};
		int n =  nums.length;
		List<List<Integer>> AL = new ArrayList<>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(i>0 && nums[i] == nums[i-1]) {
				continue;
			}
			int j=i+1;
			int k=n-1;
			while(j<k) {
				int sum = nums[i]+nums[j]+nums[k];
				if(sum<0) {
					j++;
				}else if(sum>0) {
					k--;
				}else {
					AL.add(Arrays.asList(nums[i],nums[j],nums[k]));
					j++;
					k--;
					while(j<k && nums[j]==nums[j-1]) {
						j++;
					}
				}
			}
		}
		System.out.println(AL);
		
	}

}
