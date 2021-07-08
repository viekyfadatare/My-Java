package Arrayy;

public class A1 {
	public static void main(String[] args) {
		
	
 int a[] = {1,3,5,7,8,4,6,2};
 System.out.println("Lengthb of arrya is "+a.length);
 System.out.println("Length of index is "+(a.length-1));

 
 
	for(int i =0;i<a.length;i++) {
		if(a[i]%2==1){
		System.out.println(a[i]);
	}
	}
	
	System.out.println();

	 int b[] = new int[5];
	 
	 b[0] =  10;
	 b[1] = 20;
	 b[2] = 30;
	 b[3] = 40 ;
	 b[4] = 50;
			 
	 for(int i =0;i<b.length;i++) {
		 System.out.println(b[i]);
	 }
	}
}