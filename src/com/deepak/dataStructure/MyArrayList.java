package com.deepak.dataStructure;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> {
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] elements;
	private int size = 0;
	private int capacity = 0;

	public MyArrayList() {
		this(DEFAULT_CAPACITY);
	}

	public MyArrayList(int initialCapacity) {
		if (initialCapacity < 0) {
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		}
		capacity = initialCapacity;
		elements = new Object[capacity];
	}

	// Add element to the end
	public boolean add(Object e) {
		if (size == capacity) {
			reallocate();
		}
		elements[size] = e;
		++size;
		return true;
	}

	// Insert element at index
	public void add(int index, Object e) {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		if (size == capacity) {
			reallocate();
		}
		for (int i = size; i > index; i--) {
			elements[i] = elements[i - 1];
		}
		elements[index] = e;
		++size;
	}

	// Get element at index
	public Object get(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return elements[index];
	}

	// Set element at index
	public Object set(int index, Object e) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		Object temp = elements[index];
		elements[index] = e;
		return temp;
	}

	// Remove element at index
	public Object remove(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		Object temp = elements[index];
		for (int i = index + 1; i < size; i++) {
			elements[i - 1] = elements[i];
		}
		--size;
		return temp;
	}

	// Check if contains element
	public boolean contains(Object e) {
		return indexOf(e) > 0;
	}

	// Get index of element
	public int indexOf(Object e) {
		if (e == null) {
			throw new NullPointerException();
		}
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(e)) {
				return i;
			}
		}
		return -1;
	}

	// remove element
	public boolean remove(Object e) {
		int index = indexOf(e);
		if (index == -1) {
			return false;
		}
		remove(index);
		return true;
	}

	public void clear() {
		elements = new Object[DEFAULT_CAPACITY];
		size = 0;
	}

	public Iterator<E> iterator() {
		return iterator();
	}

	public int size() {
		return size;
	}

	public void print() {
		int index = 0;
		Object temp = elements[0];
		while (temp != null) {
			System.out.print(" " + temp);
			++index;
			temp = elements[index];
		}
	}

	private void reallocate() {
		capacity = capacity * 3 / 2 + 1;
		elements = Arrays.copyOf(elements, capacity);
	}

	public static void main(String[] args) {
		MyArrayList l = new MyArrayList();
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(2, 10);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(9);
		l.add(10);
		l.add(10);
		l.add(9);
		l.add(10);

		l.print();
		System.out.println();
		System.out.println("Size: " + l.size + " Capacity: " + l.capacity);
	}
}
