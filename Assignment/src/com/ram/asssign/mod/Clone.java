package com.ram.asssign.mod;

public class Clone implements Cloneable {
int ival;
double dval;

Clone(int ival, double dval){
	this.ival=ival;
	this.dval=dval;
	
}
public static void main(String[] args) throws CloneNotSupportedException {
	Clone ref = new Clone(2,5.6);
	System.out.println(ref);
	System.out.println(ref.ival +" " +ref.dval);
	
	try {
		Object obj = ref.clone();
		Clone ree = (Clone) obj;
		
		System.out.println(ree);
		System.out.println(ree.ival +" " +ree.dval);
		
	} catch (Exception e) {
	System.out.println("clone not support");
	}
	
}
}
