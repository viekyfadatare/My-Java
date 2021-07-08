package Arrayy;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Etner thesize of array");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		for(int i = 0;i<a.length;i++) {
			System.out.println("Enter the value for"+i+"nt   index");
			a[i]= sc.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0;i<a.length; i++) {
			System.out.print(a[i]+"  ");
		}
		
		System.out.println();
		int sum =0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0&&i!=0) {
				sum = sum +a[i];
			}
		}
		System.out.println("sum of even index value   "+sum);
				
	}

}
