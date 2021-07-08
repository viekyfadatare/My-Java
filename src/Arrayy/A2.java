package Arrayy;

public class A2 {

	public static void main(String[] args) {
		
		int a[] = {1,2,6,7,9,4,3,5};
		
		System.out.println("size of array is "+a.length);
		System.out.println("size of Index is "+(a.length-1));
		
		int b[] = new int [a.length];
		
		for(int i =0; i<b.length;i++) {
			b[i] = a[i];
					
		}
		
		
		for(int i =0; i<b.length;i++) {

			System.out.print( b[i]+"  ");
		}	
	}

}
