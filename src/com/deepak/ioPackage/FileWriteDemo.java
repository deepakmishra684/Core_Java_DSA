package com.deepak.ioPackage;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\MyFiles\\deepak.txt", true);
		fw.write(99);// adding a single character
		fw.write("nase si charh gai oi\n kuri nase si charh gai");
		fw.write("\n");
		char[] ch = { 'h', 'a', 'h' };
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		System.out.println("done");
		fw.close();
	}
}
