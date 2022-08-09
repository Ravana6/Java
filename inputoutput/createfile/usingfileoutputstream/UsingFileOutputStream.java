package com.josh.java.training.inputoutput.createfile.usingfileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {
	public static void main(String[] args) throws IOException {
		/*
		 * when we are using fileOutputStream we have to handle fileNotFoundExecption
		 */
		FileOutputStream fout = null;
		FileOutputStream fout1 = null;

		try {
//			FileOutputStream file2=new FileOutputStream("D:\\trainin\\second.txt");
			fout = new FileOutputStream("D:\\training\\file.txt");

			fout1 = new FileOutputStream("D:\\training\\file.txt", true);

		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} finally {
			fout.close();
			fout1.close();
		}
 
	}
}
