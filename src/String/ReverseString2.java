package String;

public class ReverseString2 {

	public static void main(String[] args) {

		String s1 = "heyy i love  my india";
		
		String[] s2 = s1.split(" ");
		
		String value = "";
		
		for(int i = 0; i<s2.length;i++) {
			
			value = s2[i]+"  "+value;
		}
		System.out.println(value);
		
		
	}

}
