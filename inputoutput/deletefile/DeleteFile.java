package com.josh.java.training.inputoutput.deletefile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DeleteFile {
	public static void main(String[] args) {

		FileInputStream fin;
		String path = "D:\\training\\de.txt";
		try {
			fin = new FileInputStream(path);
			System.out.println("File is ready to be read..!!");
			int a = fin.read();
			String data="";
			while (a != -1) {
			 
				data=data + (char) a;
				a = fin.read();
			}
			System.out.println(data);

			fin.close();
			System.out.println("\nDone..!!!");
			File deleteFile=new File(path);
			deleteFile.delete();
		} catch (FileNotFoundException e) {
			System.out.println("Sorry file not found to be read");
		} catch (IOException e) {
			System.out.println("Unable to read..!!");
		}

	} 
}
 