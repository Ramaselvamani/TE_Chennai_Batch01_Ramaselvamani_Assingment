package com.ram.myapp.mymod;

/*
11	WAP to design a String class that perform String
Method(Equal, Reverse the string, change case).
*/

public class StringMethod {
	
	public static void main(String[] args) {
		String str = "All Is Good";
		  String str1 = "All Is Well";
	        StringBuilder str2 = new StringBuilder();
	        str2.append(str1);
	        str2.reverse();
	        System.out.println(str.toUpperCase());
	        System.out.println(str.toLowerCase());
	        System.out.println(str.equals(str1));
	        System.out.println(str2);
	}

}
