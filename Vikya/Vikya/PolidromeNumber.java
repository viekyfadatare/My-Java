package Vikya;

import java.util.Scanner;

public class PolidromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int value = num;
		
		int rev = 0;
		
		while(num!=0) {
			
			int digit = num%10;
			
			
			rev = (rev*10)+digit;
			
			num = num/10;
		}
		if(value==rev) {
			System.out.println(rev+ " is Polidrome number");
		}else {
			System.out.println(rev+" is not Polidrome number");
		}
		
				
	}

}
