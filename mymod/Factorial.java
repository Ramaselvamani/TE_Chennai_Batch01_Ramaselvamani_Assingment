package com.ram.myapp.mymod;

//9	WAP to find the factorial of a given number using Recursion.

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int a) {
		int fact=1;
		for (int i = 1; i <=a; i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner ref =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=ref.nextInt();
		int result=fact(num);
		System.out.println(result);

	}

}
