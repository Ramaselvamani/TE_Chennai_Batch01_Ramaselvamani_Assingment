package com.ram.asssign.mod;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=n; j>i; j--) {
					System.out.print(" ");
			}
			for(int k=1; k<=(2*i-1); k++) { 
						System.out.print("*");
			}
			System.out.print("\n");
		}
		/*for(int i=n; i>=1; i--) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1); k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}*/
	}

}
