package Vikya;

import java.util.Scanner;

class BetweenEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int start=sc.nextInt();
		System.out.println("Enter the End Number");
		int end = sc.nextInt();
		
		while(start<=end) {
			
			if(start%2==0) {
				System.out.println(start+" is Enev number");
			}else {
				System.out.println(start+" is odd number");
			}
			start++;
		
		}
		
				

	}

}
