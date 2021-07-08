package Vikya;

import java.util.Scanner;

public class StrongNumber {
	
	
	public static int fact(int digit) {
		int fact = 1;
		while(digit>0) {
		fact = fact*digit;
		digit--;
	}
		return fact;
				
				
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check it is strong number or not");
		int num = sc.nextInt();
		
		int value = num;
		int sum = 0;
		
		while(num!=0) {
			int digit = num%10;
			int  fact = fact(digit);
			 sum = sum+ fact;
			 
			 num =num/10;
			
		}
		if(value==sum) {
			System.out.println(value+" this is strong number");
		}else {
			System.out.println("this is not strong number");
		}

		
	}
}
