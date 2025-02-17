package EASY;

public class ValidPalindrome {

	public static void main(String[] args) {
		// This method uses inbuilt functions like isLetterOrDigit and toLowerCase
		// For this solution TC is 3ms
		String s = "A man, a plan, a canal: Panama";
		int p1=0,p2=s.length()-1;
//		while(p1<p2) {
//			if(!Character.isLetterOrDigit(s.charAt(p1))) {
//				p1++;
//				continue;
//			}
//			if(!Character.isLetterOrDigit(s.charAt(p2))) {
//				p2--;
//				continue;
//			}
//			
//			char s1 = Character.toLowerCase(s.charAt(p1));
//			char s2 = Character.toLowerCase(s.charAt(p2));
//			System.out.println(s1+" "+s2);
//			if(s1!=s2) {
//				System.out.println("Not palindrome");
//			}
//			p1++;
//			p2--;
//		}
//		System.out.println("Palindrome");
		
		// Without using Inbuilt functions
		
		while(p1<p2) {
			char t1 = s.charAt(p1);
			char t2 = s.charAt(p2);
			if(!((t1>=65 && t1<=90) || (t1>=97 && t1<=122) || (t1>=48 && t1<=57))) {
				p1++;
				continue;
			}
			if(!((t2>=65 && t2<=90) || (t2>=97 && t2<=122) || (t2>=48 && t2<=57))) {
				p2--;
				continue;
			}
			if((t1>=65 && t1<=90)) {
				t1 = (char) (t1+32);
			}
			if((t2>=65 && t2<=90)) {
				t2 = (char) (t2+32);
			}
			if(t1!=t2) {
				System.out.println("Not Palindrome");
			}
			p1++;
			p2--;
		}
		System.out.println("Palindrome");
	}

}
