package String;

public class ChechEqualString {

	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = "java";
		
		if(s1.equals(s2)) {
			System.out.println("It having the same address");
		}else {
			System.out.println("It is not same");
		}
		
		String s3 = new String("sql");
		String s4 = new String("sql");
		
		if(s3==s4) {
			
			System.out.println("Yes it is equal");
		}else {
			System.out.println("It is not Equal");
		}


	}

}
