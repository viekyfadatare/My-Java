package Vikya;

import java.util.Scanner;

class BhawaPractice {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number");
		 	int num = sc.nextInt();
		 	if(num %2==0) {
		 		System.out.println(num+"  is a Even Number");
		 		
		 	}else {
		 		System.out.println(num+"  is Odd number");
		 	}
	}

}
