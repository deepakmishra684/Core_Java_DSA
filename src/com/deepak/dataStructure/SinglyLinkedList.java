package com.deepak.dataStructure;

public class SinglyLinkedList {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	Node head;

	// Insert at the beginning
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	// Insert at the end
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	// Insert at specific position (0-based)
	public void insertAtPosition(int index, int data) {
		if (index < 0 || index > getSize()) {
			System.out.println("Invalid Position");
			return;
		}
		if (index == 0) {
			insertAtBeginning(data);
			return;
		}

		Node newNode = new Node(data);
		Node temp = head;
		for (int i = 0; i < index - 1; ++i) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	// Delete by value
	public void deleteByValue(int key) {
		if (head == null)
			return;

		if (head.data == key) {
			head = head.next;
			return;
		}

		Node temp = head;
		while (temp.next != null && temp.next.data != key) {
			temp = temp.next;
		}
		if (temp.next != null) {
			temp.next = temp.next.next;
		} else {
			System.out.println("Value not found");
		}

	}

	// Delete at a specific position (0-based)
	public void deleteAtPosition(int index) {
		if (head == null || index < 0 || index >= getSize()) {
			System.out.println("Invalid position");
			return;
		}

		if (index == 0) {
			head = head.next;
			return;
		}
		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}

		temp.next = temp.next.next;
	}

	// Search a value
	public boolean search(int key) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == key)
				return true;
			temp = temp.next;
		}
		return false;
	}

	// Display the list
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	// Get size of the list
	public int getSize() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			++count;
			temp = temp.next;
		}
		return count;
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();

		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtBeginning(5);
		list.insertAtPosition(1, 15);
		list.display(); // 5 -> 15 -> 10 -> 20 -> null

		list.deleteByValue(10);
		list.display(); // 5 -> 15 -> 20 -> null

		list.deleteAtPosition(1);
		list.display(); // 5 -> 20 -> null

		System.out.println("Contains 20? " + list.search(20)); // true
		System.out.println("Contains 100? " + list.search(100)); // false

		list.display(); // 20 -> 5 -> null

		System.out.println("Size: " + list.getSize()); // 2
	}

}
