package Vikya;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int start = sc.nextInt();
		System.out.println("Enter the end number");
		int end = sc.nextInt();
		
		if(start>end) {
			int temp = 0;
			temp = start;
			start = end;
			end= temp;
		}
			
		while(start<=end) {
			int i = 2;
			while(i<=start) {
				if(start%i==0) {
					break;
				}
				i++;
			}
			if(start == i) {
				System.out.println(start+"  is prime number");
			}
			start++;
		}		
		
	}

}
