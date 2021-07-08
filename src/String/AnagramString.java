package String;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		  String s1 = "race" ;
		  String s2 = "care";
		  
		  if(s1.length()!=s2.length()) {
			  System.out.println("It is not Anagram");
		  }else {
			  
			  char[] ch1 = s1.toCharArray();
			  char[] ch2 = s2.toCharArray();
			  
			  Arrays.sort(ch1);
			  Arrays.sort(ch2);
			  
			  if(Arrays.equals(ch1, ch2)) {
				  System.out.println("It is anagram");
			  }else {
				  System.out.println("It is not anagram");
			  }


		  }
		
	}

}
