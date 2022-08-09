package com.josh.java.training.inputoutput.programs;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class programForFile {
	public static void main(String[] args) throws FileNotFoundException ,IOException{
		String path ="D:\\\\training\\\\program.txt";
           File file =new File(path);
           FileOutputStream fileOutputStream=new FileOutputStream(file);
           BufferedOutputStream bufferFile =new BufferedOutputStream(fileOutputStream);
           
          /*writing using print writer*/
           PrintWriter printFile=new PrintWriter(bufferFile);
           printFile.println("This is karthik suresh ");
           printFile.println("good in java");
           printFile.println("good in program");
           
           //reading using file input stream or buffered input stream
           
           FileInputStream readFile=new FileInputStream(path);
           BufferedInputStream bufferReadFile =new BufferedInputStream(readFile);
           int firstChar=bufferReadFile.read();
           while(firstChar!=-1)
           {
        	   System.out.println((char)firstChar);
        	   firstChar=bufferReadFile.read();
           }
           bufferReadFile.close();

	}
}
