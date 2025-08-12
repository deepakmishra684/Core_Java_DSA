package com.deepak.java8coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethod {
	
	public static void main(String[] args) {
		List<String> list= Arrays.asList("Deepak","Shivam","Rahul","Pooja","Madhuri","Rahul");
		System.out.println(list.get(3));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.indexOf("Shivam"));
		System.out.println(list.lastIndexOf("Rahul"));
		System.out.println(list.set(3, "Priya"));
		System.out.println(list.reversed());
		System.out.println(list.subList(2, 4));
		List<String> list2=new ArrayList<String>();
		System.out.println(list2.add("kk"));
		list2.addFirst("Mohan");
		System.out.println(list2);
		list2.addLast("Mohan");
		System.out.println(list2);
		
	}

}
