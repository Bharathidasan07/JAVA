package EASY;

public class Palindrome {

	public static void main(String[] args) {
		String s = "abcdefedcba";
		int p1=0,p2=s.length()-1;
		boolean chk = true;
		while(p1<p2) {
			if(s.charAt(p1)!=s.charAt(p2)) {
				System.out.println("Not Palindrome");
				chk = false;
				break;
			}
			p1++;
			p2--;
		}
		if(chk) {
			System.out.println("Palindrome");
		}

	}

}
