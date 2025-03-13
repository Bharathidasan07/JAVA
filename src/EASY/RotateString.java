package EASY;

public class RotateString {

	public static void main(String[] args) {
		//String s = "abcde", goal = "cdeab";
		String s = "bbbacddceeb", goal = "ceebbbbacdd";
		System.out.println(myBruteForceApproach(s,goal));
		System.out.println(rotateString(s,goal));

	}
	//String s = "bbbacddceeb", goal = "ceebbbbacdd";
	// my brute force approach doesn't work for the above test case 
	// for the repeated characters it doesn't work properly
	private static boolean myBruteForceApproach(String s, String goal) {
		if(s.length()!=goal.length()) {
			return false;
		}
		int rotate = 0;
        for(int i=0;i<goal.length();i++){
            if(s.charAt(0)==goal.charAt(i)){
                rotate = goal.length()-i;
            }
        }
        for(int i=0;i<rotate;i++){
            if(s.charAt(i)!=goal.charAt(i+(goal.length()-rotate))){
                return false;
            }
        }
        for(int i=rotate;i<goal.length();i++){
            if(s.charAt(i)!=goal.charAt(i-rotate)){
                return false;
            }
        }
		return true;
	}
	
	// This is the chatGPT Approach which satisfies all test cases
	private static boolean rotateString(String s, String goal) {
		if(s.length()!=goal.length()) {
			return false;
		}
		String doubleS = s+s;
		if(doubleS.contains(goal)) {
			return true;
		}
		return false;
	}

}
