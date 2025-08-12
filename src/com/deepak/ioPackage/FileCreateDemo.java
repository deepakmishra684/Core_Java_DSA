package com.deepak.ioPackage;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println("********************************************");
		File f1 = new File("FileDirectory");
		f1.mkdir();
		File f2 = new File("FileDirectory", "demo.txt");
		f2.createNewFile();
		System.out.println(f2.exists());
		System.out.println("**************************************************");
		File f3 = new File("D:\\MyFiles", "deepak.txt");
		f3.createNewFile();
		System.out.println(f3.exists());
	}
}
