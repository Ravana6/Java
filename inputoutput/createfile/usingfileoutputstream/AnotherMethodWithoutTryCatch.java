package com.josh.java.training.inputoutput.createfile.usingfileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AnotherMethodWithoutTryCatch {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		FileOutputStream file3 = new FileOutputStream("D:\\training\\file3");
		System.out.println("file created successfully");
		file3.close();
	}
}
 