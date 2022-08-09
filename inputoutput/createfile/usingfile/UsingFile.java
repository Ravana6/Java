package com.josh.java.training.inputoutput.createfile.usingfile;

import java.io.File;
import java.io.IOException;

public class UsingFile {
	public static void main(String[] args) {

		try {

			File file1 = new File("D:\\training\\firstfile.txt");
			if (file1.createNewFile()) {
				System.out.println("file created Successfully");
			} else {
				System.out.println("File already present");
			}
		} catch (IOException e) {
			System.out.println("Unable to create..." + e);
		}

	} 
}
