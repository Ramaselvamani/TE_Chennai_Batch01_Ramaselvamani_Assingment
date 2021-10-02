package com.ram.assign.filehandle;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreation {
	public static void main(String[] args) {
  
		/* Folder Creation */
		File folder = new File("H:\\paul");
		folder.mkdir();

		/* File Creation */
		File file = new File("H:\\paul\\ram.txt");
		try {
			file.createNewFile();

			/* File Writing */
			FileWriter writer = new FileWriter(file);
			writer.write("File writing successfully done...!");
			writer.flush();

			/* File Reading */
			FileReader reader = new FileReader(file);
			int i = reader.read();

			/*
			 * while(i != -1) { System.out.print((char) i); i = reader.read(); }
			 */

			Scanner scan = new Scanner(file);
			while (scan.hasNext()) {
				System.out.println(scan.nextLine());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
