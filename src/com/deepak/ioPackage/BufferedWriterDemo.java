package com.deepak.ioPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\MyFiles\\deepak.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(100);
		bw.newLine();
		char[] ch = { 'a', 'b', 'c', 'd' };
		bw.write(ch);
		bw.newLine();
		bw.write("mere mahboob");
		bw.newLine();
		bw.write("Qayamat teri ");
		bw.flush();
		System.out.println("done");
		bw.close();
	}
}
