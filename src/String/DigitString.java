package String;

public class DigitString {

	public static void main(String[] args) {

		String s1 = "Armed By AK47 and Groja184 to win Battle ";
		
		char [] ch= s1.toCharArray(); 
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]>='0'&&ch[i]<='9') {
				
				System.out.println(ch[i]);
				System.out.println();
			}
		}
		
	}

}
