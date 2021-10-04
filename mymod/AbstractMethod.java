package com.ram.myapp.mymod;

abstract class Bike{  
	  abstract void run();  
	}  
	class Splendor extends Bike{  
	void run(){
		System.out.println("running safely");
	}  
	}
public class AbstractMethod {

	public static void main(String[] args) {
		 Bike obj = new Splendor();  
		 obj.run();  

	}

}
