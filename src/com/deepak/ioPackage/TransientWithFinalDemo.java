package com.deepak.ioPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientWithFinalDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Customer serializeCust = new Customer(100, "Deepak", 117896);

		System.out.println("Serialization started....");
	
		FileOutputStream fo = new FileOutputStream("D:\\MyFiles\\customer.txt");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(serializeCust);

		System.out.println("***********************************************");
		System.out.println("Deserialization started.........");
		FileInputStream fs = new FileInputStream("D:\\MyFiles\\customer.txt");
		ObjectInputStream in = new ObjectInputStream(fs);
		Customer dserializeCust = (Customer) in.readObject();
		System.out.println("Printing customer values from " + "de-serialized object... \n"
		                     + dserializeCust);
	}
}