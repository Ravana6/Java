package com.josh.java.training.inputoutput.write.usingcharat;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class UsingScannerClass {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path where you have to write");
		String path = sc.nextLine();
		System.out.println("Enter the sentence");
		String sentence = sc.nextLine();

		FileOutputStream file = new FileOutputStream(path, true);
		for (int i = 0; i < sentence.length(); i++) {
			file.write(sentence.charAt(i));
		}
		System.out.println("Done");
	}
}
