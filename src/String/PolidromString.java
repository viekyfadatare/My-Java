package String;

public class PolidromString {
	public static void main(String[] args) {
		
		String s1 = "malayalam";
		
		String s2 = s1;
		
		char [] ch = s1.toCharArray();
		
		String s3 = "";
		
		for(int i = 0 ;i<ch.length;i++) {
			s3 = ch[i]+s3;
		}
		
		if(s3.equals(s2)) {
			System.out.println("Given string is Polidrom");
		}else {
			System.out.println("Given String is not Polidrom");
		}
			
	}

}
