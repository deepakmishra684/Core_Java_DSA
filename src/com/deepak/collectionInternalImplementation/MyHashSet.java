package com.deepak.collectionInternalImplementation;

import java.util.HashMap;
import java.util.Iterator;

public class MyHashSet<E> {

	private transient HashMap<E, Object> map;

	// Dummy value to associate with an Object in the backing Map

	public MyHashSet() {
		map = new HashMap<>();
	}

	public MyHashSet(int initialCapacity, float loadFactor) {
		map = new HashMap<>(initialCapacity, loadFactor);
	}

	public MyHashSet(int initialCapacity) {
		map = new HashMap<>(initialCapacity);
	}

	public Iterator<E> iterator() {
		return map.keySet().iterator();
	}

	public boolean contains(Object o) {
		return map.containsKey(o);
	}

	@Override
	public String toString() {
		return "MyHashSet ["+ map + "]";
	}

	public boolean add(E o) {
		return map.put(o, "") == null;
	}

	public boolean remove(Object o) {
		return (map.remove(o) != null);
	}

	public static void main(String[] args) {
		MyHashSet set = new MyHashSet();
		set.add(0);
		set.add(1);
		set.add(2);
		set.add(2);
		System.out.println(set);
	}
}
