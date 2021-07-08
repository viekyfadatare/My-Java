package String;

public class DuplicateStringValue {

	public static void main(String[] args) {

		String s1 = "mumbai";
		
		char[] ch = s1.toCharArray();
		
		for(int i=0;i<ch.length;i++) {	
			for(int j =i+1;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]);
				}
			}
		}
	}

}
