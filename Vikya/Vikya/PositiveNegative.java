package Vikya;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int  num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		
	
		if(num1>0) {
			System.out.println(num1+" It is a Positive number");
		}else if(num1<0) {
			System.out.println(num1+" It is Negative Number");
			
		}else {
			System.out.println("It is Zero number");
		}
		
		
		if(num2>0) {
			System.out.println(num2+" is Positive number"); 
		}else if(num2<0) {
			System.out.println(num2+" is Negative Number");
		}
		else {
			System.out.println("It is Zero number");
		}	
		}
		
	}


