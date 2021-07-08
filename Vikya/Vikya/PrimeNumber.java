package Vikya;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to cheack whether it is Prime or not");
		int num = sc.nextInt();
		
		int i =2;
		while(i<=num) {
			
			if(num%i==0) {
				break;
			}
			i++;
		}
		if(i==num) {
			System.out.println(num+" is Prime Number");
		}else {
			System.out.println("is Not Prime");
		}
				
	}
}
