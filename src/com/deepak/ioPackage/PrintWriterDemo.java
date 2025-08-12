package com.deepak.ioPackage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\MyFiles\\deepak.txt");
		PrintWriter out = new PrintWriter(fw);
		out.write(100);
		out.println(100);
		out.println(true);
		out.println('c');
		out.println("SaiCharan");
		out.flush();
		System.out.println("done");
		out.close();
	}
}
