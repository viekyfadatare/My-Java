package Vikya;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {

		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the number to get fatorial");
		int num = sc.nextInt();//4=4*3*2*1
		
		int i =1;
		int result=1;
		while(i<=num) {
			
			result = result*i;
			i++;
		}
		System.out.println("Factorial of "+num+" is "+result);
	}

}
