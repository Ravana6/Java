package com.josh.java.training.inputoutput.append;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WirteInNewLineUsingPrintWrite {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		FileOutputStream file = new FileOutputStream("D:\\training\\write.txt", true);
		
//		FileWriter file=new FileWriter("D:\\training\\write.txt", true);
//		BufferedWriter bufferFile=new BufferedWriter(file);
		PrintWriter printFile = new PrintWriter(file);
		printFile.println("\nGood in java");
		printFile.print(false);
		printFile.println("Good in java");
		printFile.println("Good in java");
		printFile.println("Good in java");
		printFile.println("Good in java\n");
		printFile.println("Good in java");
		printFile.println("Good in java");
		printFile.println("Good in java");
		printFile.println("Good in java");
		printFile.println("Good in java");
		printFile.close();
	}
}
