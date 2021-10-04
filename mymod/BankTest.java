package com.ram.myapp.mymod;

import java.util.Scanner;

public class BankTest extends Bank{

	public static void main(String[] args) {

		System.out.println(" Welcome to Union Bank Of India ");
		Scanner obj = new Scanner(System.in);
		System.out.println("enter amount to be deposit : ");
		long depositamt = obj.nextLong();
		System.out.println("enter amount to be withdrawn : ");
		long withdrawamt = obj.nextLong();
		
		BankTest ref = new BankTest();
	
		System.out.println(ref.getBalance());
		ref.deposite(depositamt);
		ref.withDraw(withdrawamt);
	}
}

