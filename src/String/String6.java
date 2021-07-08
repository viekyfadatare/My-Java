package String;

public class String6 {

	public static void main(String[] args) {

		String s1 = "i love my India";
		
		String s2[] = s1.split("y");
		
		
		for (int i = 0;i<s2.length;i++) {
			System.out.println(s2[i]);
		}
		
		
		String s3 = "         i love you";
		System.out.println(s3.trim());
	}

}
