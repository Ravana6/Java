package com.josh.java.training.inputoutput.write.usingbytesarray;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class UsingScannerClass {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path where you have to write");
		String path = sc.nextLine();
		System.out.println("Enter the Sentence");
		String sentence = sc.nextLine();

		/* creating file */
		FileOutputStream file = new FileOutputStream(path, true);

		/* converting String to Array */
		byte bytesArrays[] = sentence.getBytes();

		file.write(bytesArrays);
		file.close();
		System.out.println("Done");
//D:\\training\\write.txt Good in java
	}
}
