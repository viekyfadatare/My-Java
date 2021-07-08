package Arrayy;

public class A13 {

	public static void main(String[] args) {

		int a[] = {12,20,3,19,2,4,5,6,4,8,6,12,45,12,36,25,7,32};

		
		for(int i =0;i<a.length;i++) {
			
			System.out.print(a[i]+"  ");
			
		}
		
		for(int i =0;i<a.length;i++) {
			
			for(int j =i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					}
			}
		}
		
		System.out.println();
		System.out.println();
		
	for(int i =0;i<a.length;i++) {
			
			System.out.print(a[i]+"  ");
			
		}
		

}
}
