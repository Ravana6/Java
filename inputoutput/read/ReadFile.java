package com.josh.java.training.inputoutput.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class ReadFile {
	public static void main(String[] args) {
         File file =null;
		FileInputStream fin;
		SimpleDateFormat lastModified=new SimpleDateFormat("dd/mm/yyy  hh:mm:ss a");
		String path = "C:\\Users\\Admin\\eclipse-workspace\\java_training\\src\\com\\josh\\java\\training\\Assignment\\OOPS\\Q1\\AccountDriver.java";
		try {
			file =new File(path);
			fin = new FileInputStream(path);
			System.out.println("File is ready to be read..!!");
			int a = fin.read();
			while (a != -1) {
				System.out.print((char) a);
				a = fin.read();
			} 

			fin.close();
			System.out.println("\nDone..!!!");
			System.out.println("last modified Date = "+lastModified.format(file.lastModified()));
		} catch (FileNotFoundException e) {
			System.out.println("Sorry file not found to be read");
		} catch (IOException e) {
			System.out.println("Unable to read..!!");
		}

	} 
}
