package Arrayy;

public class A11 {

	public static void main(String[] args) {

		int a [] = {10,20,15,03,2,04,6,151,46,4,12,4}; 
		
		int e=0; 
		int od=0;

		int even[]= new int [e];
		int odd[]= new int [od];

		for(int i =0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				e++;
			}else {
				od++;
		}
		}
		
		for(int i =0;i<a.length;i++) {
			if(a[i]%2==0){
				e--;
				even[e]=a[i];
				
			}else {
				od--;
				odd[od]= a[i];
			}
			
		}

		System.out.println("Even number is");
		for(int i =0;i<even.length;i++) {
			System.out.print(even[e]);
		}
		System.out.println();
		System.out.println("odd number is");
		
		for(int i =0;i<odd.length;i++) {
			System.out.print(odd[od]);
		}
	}

}
