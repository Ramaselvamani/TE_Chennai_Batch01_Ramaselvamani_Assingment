package com.ram.myapp.mymod;

//17	WAP to Handle the user defined Exception using throw keyword.

import com.ram.myapp.mymods.*;

public class ThrowKeyword {

	public void name(int number) throws IvalidNumber {
		
		if(number%2==0){  
		        System.out.println("even number");  
		    }else{  
		        throw new IvalidNumber("odd number"); 
		    }
		}
}
