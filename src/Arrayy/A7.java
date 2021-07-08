package Arrayy;


public class A7 {

	public static void main(String[] args) {
		

		int a[]= {11,22,33,44,55,66,44,67,41,};
		
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+"  ");
		}
		
		System.out.println();
		
		int even[] = new int[a.length];
		int odd[] =  new int[a.length];
	
		
		int e = 0,od=0;
		
		for(int i =0;i<a.length;i++) {
			if(a[i]%2==0) {
				even[i]=a[i];
				e++;
			}else {
				odd[i]=a[i];
				od++;
			}
			
		}
		
		for(int i =0;i<a.length;i++) {
			if(even[i]>0) {
		System.out.print(even[i]+"  ");
			}
		}System.out.println(); 
		
		System.out.println("count of even number is "+e);
		
		System.out.println();
		
		for(int i =0;i<a.length;i++) {
			if(odd[i]>0) {
		System.out.print(odd[i]+"  ");
			}
		}
		System.out.println();
		System.out.println("count of odd number is  "+od);

	}

}
