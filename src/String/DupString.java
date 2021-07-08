package String;

public class DupString {

	public static void main(String[]args) {

		String s1 = "malayalam";
		
		char[] ch = s1.toCharArray();
		
		for(int i =0;i<ch.length;i++) {
			
			for(int j=i+1;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					
					System.out.println(ch[j]);
					
					for(int j2=j+1;j2<ch.length;j2++) {
						
						if(ch[j]==ch[j2]) {
							
							ch[j2]=' ';
						}
					}
					
				}
			}
			
		}
	}
}
