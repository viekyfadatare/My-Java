package Vikya;

import java.util.Scanner;

class printNumBetweenRange {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the starting Number");
int start = sc.nextInt();
System.out.println("Enter the end number");
int end=sc.nextInt();

if(start>end) {
	
	int temp =0;
	temp = start;
	start=end;
	end = temp;
}
while(start<=end) {
	System.out.println(start);
	start++;
	
}

	}

}
