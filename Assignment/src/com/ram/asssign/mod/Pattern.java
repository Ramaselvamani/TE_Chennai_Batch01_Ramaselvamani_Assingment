package com.ram.asssign.mod;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int str = 1;
		int mid = n / 2;
		int a = n / 2;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= a; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= str; k++) {
				System.out.print("*");
			}
			System.out.println();
			if (mid >= i) {
				str += 2;
				a--;
			} else if (mid < i) {
				str -= 2;
				a++;
			}
		}

	}

}
