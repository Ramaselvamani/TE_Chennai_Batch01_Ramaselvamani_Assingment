package com.ram.myapp.mymod;

/*
5	WAP to calculate the Simple Interest and Input by the user.
Simple Interest = (P × R × T)/100  
where P = Principal Amount, R = Rate per Annum, T = Time (years)  
*/

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		float p, r, t, sinterest;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Principal : ");
		p = scan.nextFloat();
		System.out.print("Enter the Rate of interest : ");
		r = scan.nextFloat();
		System.out.print("Enter the Time period : ");
		t = scan.nextFloat();
		scan.close();
		sinterest = (p * r * t) / 100;
		System.out.print("Simple Interest is: " + sinterest);
	}
}
