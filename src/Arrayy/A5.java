package Arrayy;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int a[]= new int[size];
		
		for(int i = 0;i<a.length;i++) {
			System.out.println("enter the  vlaues of "+i+"nth"+"  index");
			a[i]=sc.nextInt();
		}
		
		
		for(int i =0; i<a.length;i++) {

			System.out.print(a[i]+"  ");
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			
			int k=2;
			while(k<=a[i]) {
				if(a[i]%k==0) {
					break;
				}
				k++;
				
			}
			if(k==a[i]) {
				System.out.println(a[i]+" is a prime number");
			}
			
		}
	}

}
