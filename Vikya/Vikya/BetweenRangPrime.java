package Vikya;

import java.util.Scanner;

public class BetweenRangPrime {
	

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Starting Number");
	int start = sc.nextInt();
	System.out.println("Enter the end Number");
	int end = sc.nextInt();
	   
	
	if(start>end) {
		
		int temp =0;
		temp = start;
		start=end;
		end = temp;
	}
	while(start<=end) {
		int i =2;
	while(i<=start) {
		if(start%i==0) {
			break;
		}
		i++;
		
	}
	
	if(i==start) {
		System.out.println(start+" this is Prime Number");
	}else {
		System.out.println(start+" this is Not Prime Number");
	}
	start++;
}
		
		
	}
		
		
}	

