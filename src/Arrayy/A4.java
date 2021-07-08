package Arrayy;

import java.util.Scanner;

public class A4 {

	//sum of even index value
	//Product of odd index value
	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter the size of array");
int size = sc.nextInt();

int a[] = new int[size];

for(int i =0;i<a.length;i++) {
	System.out.println("Enter the  "+i+"nt"+" index");
	a[i]= sc.nextInt();
}

for(int i = 0;i<a.length;i++) {
	System.out.print(a[i]+" ");
	
}
System.out.println();
System.out.println();
int sum = 0;
int prod =1;

for(int i = 0;i<a.length; i++) {
	
	if(a[i]%2==0) {
		sum = sum +a[i];
	}else {
		prod = prod*a[i];
	}
	
}
System.out.println("sum of even index value is  "+sum);
		System.out.println("Prduct of odd index value is "+prod);
	}

}
