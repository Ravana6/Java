package com.josh.java.training.inputoutput.write.usingbytesarray;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingBytesArray {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		 * creating a file using file output stream
		 */
		FileOutputStream file = new FileOutputStream("D:\\training\\write.txt");

		String sentence = "This is karthik suresh";

		/* creating bytes array to store the sentence using getBytes() method */

		byte[] bytesArray = sentence.getBytes();

		file.write(bytesArray);
		file.flush();
		file.close();

	}
}
