package Arrayy;

public class A14 {

	public static void main(String[] args) {

int a[]= {1,6,8,7,3,9,14,3,5,02,78,60};

for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
			int temp = a[i];
			a[i]=a[j];
			a[j] = temp;			
		}	
	}
	
		
	}
System.out.println();
for(int i =0;i<a.length;i++) {
	System.out.println(a[i]);
}
}
		
	}


