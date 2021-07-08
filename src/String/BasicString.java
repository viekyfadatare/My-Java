package String;

public class BasicString {

	public static void main(String[] args) {
   char [] ch = {'a','n','d','r','o','i','d'};
   
  // String s = new String(ch);
    String s = String.valueOf(ch);
   System.out.println(s);
	
   
   
   
   String s3 = "india";
   
   char a[] = s3.toCharArray();
   
   for(int i = 0; i<a.length;i++) {
	   System.out.println(a[i]);
   }
   
   System.out.println(s3.charAt(1));
   
 //  System.out.println(s3.charAt(6));
   
   System.out.println(s3.length());

	}

}
