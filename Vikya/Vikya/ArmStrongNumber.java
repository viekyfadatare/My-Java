package Vikya;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check it is Arm strong or not");
		int num = sc.nextInt();
		
		int count =0;
		
		int n = num;
		
		while(n>0) {
			
			count++;
			n = n/10;
			
		}
		
		n = num;
		int sum =0;
		
		while(n!=0) {
			
			int digit = n%10;
			int prod = 1;
			int p = count;
			while(p>0) {
				
				prod = prod*digit;
	
				p--;
			}
			sum = sum+prod;
			n=n/10;
		}
		if(num==sum) {
			System.out.println(num+" is a Armstrong number");
		}else {
			System.out.println(num+"  is not a ArmStrong Number");
		}
	}

}
