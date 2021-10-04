package com.ram.myapp.mymod;

//12 WAP to handle the Exception using try and multiple catch block.

public class Exception {

	public static void main(String[] args) {
		int[] ar = new int[3];
		try {
			System.out.println(ar[3]);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException handle");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException handle");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException handle");
		}

	}

}
