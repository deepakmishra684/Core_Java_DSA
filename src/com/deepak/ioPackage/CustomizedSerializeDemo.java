package com.deepak.ioPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
 	String userName = "Deepak";
    transient	String password = "kajal";

	private void writeObject(ObjectOutputStream os) throws IOException {
		os.defaultWriteObject();
		String pass = "@#$" + password;
		os.writeObject(pass);
	}

	private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
		is.defaultReadObject();
		String pass = (String) is.readObject();
		password = pass.substring(3);
	}
}

public class CustomizedSerializeDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account act = new Account();
		System.out.println("UserName :: " + act.userName + " && Password :: " + act.password);
		System.out.println("Start Serialization.....");
		FileOutputStream fos = new FileOutputStream("D:\\MyFiles\\mishra.txt");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(act);
		System.out.println("Start Deserialization....");
		FileInputStream fis = new FileInputStream("D:\\MyFiles\\mishra.txt");
		ObjectInputStream in = new ObjectInputStream(fis);
		Account at = (Account) in.readObject();
		System.out.println("User Name :: " + at.userName + " && Password :: " + at.password);

	}
}
