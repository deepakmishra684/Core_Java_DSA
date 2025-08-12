package com.deepak.ioPackage;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Account1 implements Externalizable {
	String userName = "Deepak Mishra";
	String password = "sukankshee";

	public Account1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		String pwd = "#$%" + password;
		out.writeObject(pwd);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		String pwd = (String) in.readObject();
		password = pwd.substring(3);

	}

}

public class ExternalizableDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account1 act = new Account1();
		System.out.println("UserName :: " + act.userName + " && Password :: " + act.password);
		System.out.println("Start Serialization.....");
		FileOutputStream fos = new FileOutputStream("D:\\MyFiles\\mishra.txt");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(act);
		System.out.println("Start Deserialization....");
		FileInputStream fis = new FileInputStream("D:\\MyFiles\\mishra.txt");
		ObjectInputStream in = new ObjectInputStream(fis);
		Account1 at = (Account1) in.readObject();
		System.out.println("User Name :: " + at.userName + " && Password :: " + at.password);

	}
}
