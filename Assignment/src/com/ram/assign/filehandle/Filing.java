package com.ram.assign.filehandle;

import java.io.File;
import java.io.IOException;

public class Filing {
	public static void main(String[] args) {
		
		File file = new File("H:\\paul\\hey.jpg");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
