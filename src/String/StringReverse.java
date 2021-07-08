package String;

public class StringReverse {

	public static void main(String[] args) {

		String s1 = "SPIDER";
		
		char[] ch = s1.toCharArray();
		
		String s2 = "";
		
		for(int i =0;i<ch.length;i++) {
			
			s2 = ch[i]+s2;
		}
		
		System.out.println(s2);
		
	}
	

}
