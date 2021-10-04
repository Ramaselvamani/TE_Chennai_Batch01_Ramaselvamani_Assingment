package com.ram.myapp.mymod;

import java.util.Scanner;

import com.ram.myapp.mymods.IvalidNumber;

public class ThrowKeywordTest {
	public static void main(String[] args) {

		ThrowKeyword obj = new ThrowKeyword();
		Scanner ref = new Scanner(System.in);
			System.out.println("enter a number");
			int a = ref.nextInt();
			try {
				obj.name(a);
			} catch (IvalidNumber e) {
				
			}
	}

}
