package com.deepak.designPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDeserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("obj.ser"));
		out.writeObject(Singelton.getSingleInstance());
		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("obj.ser"));
		Singelton newInstance = (Singelton) in.readObject();

		System.out.println(Singelton.getSingleInstance() == newInstance); // false — Broken

	}

}
