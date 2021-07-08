package Arrayy;
// how many duplicate value print 

public class A10 {

public static void main(String[] args) {
	int a[]= {10,20,15,13,11,47,11,10,11,15};
	countNum(a,a.length);
}
		//duplicate value print once
			public static void countNum(int arr[],int n) {

				
				
				boolean bool[]= new boolean[n];
				
				System.out.println("Duplicate  vlaue");
				
				for(int i=0;i< n ;i++) {
					
					if(bool[i]==true) {
						continue ;
						}
					int count =1;
					for(int j=i+1;j< n;j++) {
						
						if(arr[i]==arr[j]) {
							bool[j] = true;
							count++;
						}
					}
					if (count>1) {
						System.out.println(arr[i]+"  "+count);

					}
					

				
			}
}
}