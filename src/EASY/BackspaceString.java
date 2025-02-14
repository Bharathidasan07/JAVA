package EASY;

public class BackspaceString {

	public static void main(String[] args) {
		String s1 = "s#h#gg#f";
		String s2 = "gh#lm##f";
//		System.out.println(finalString(s1));
//		System.out.println(finalString(s1));
		int ps1=s1.length()-1,ps2=s2.length()-1;
		boolean chk = true;
		while(ps1>=0 || ps2>=0) {
			char s1c,s2c;
			ps1 = resolve(s1,ps1);
			ps2 = resolve(s2,ps2);
			s1c = s1.charAt(ps1);
			s2c = s2.charAt(ps2);
			if(s1c==s2c) {
				ps1--;
				ps2--;
			}else {
				chk = false;
			}
		}
		System.out.println(chk);

	}
	
	public static int resolve(String s, int p){
		if(s.charAt(p)=='#') {
			int backs = 2;
			while(backs<0) {
				p--;
				backs--;
				if(s.charAt(p)=='#') {
					backs+=2;
				}
			}
		}
		return p;
	}
	
	public static String finalString(String s) {
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()) {
			if(c!='#') {
				sb.append(c);
			}else {
				sb.deleteCharAt(sb.length()-1);
			}
		}
		return sb.toString();
	}

}
