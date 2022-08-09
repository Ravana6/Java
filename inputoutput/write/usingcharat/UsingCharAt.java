package com.josh.java.training.inputoutput.write.usingcharat;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingCharAt {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		 * creating a file using file output stream
		 */
		FileOutputStream file = new FileOutputStream("D:\\training\\write.txt");

		String sentence = "This is karthik suresh";

		for (int i = 0; i < sentence.length(); i++) {
			file.write(sentence.charAt(i));
		}

		file.flush();
		file.close();
	}
}
