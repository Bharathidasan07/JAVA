package EASY;

public class BackspaceString {

	public static void main(String[] args) {
		String s = "s#h#gg#f";
		System.out.println(finalString(s));

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
