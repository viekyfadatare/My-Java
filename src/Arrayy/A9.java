package Arrayy;

public class A9 {
//duplicate value
	public static void main(String[] args) {

		
		int a[]= {10,20,15,13,11,47,11,10,15};
		
		for(int i =0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
