package com.deepak.dataStructure;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
	int data;
	Node head;
	Node tail;
	int size = 0;

	private static class Node {
		Object data;
		Node next;
		Node previouse;

		public Node(Node previouse, Object data, Node next) {
			this.data = data;
			this.next = next;
			this.previouse = previouse;
		}
	}

	// Add at start(head)
	public void addAtStart(Object data) {
		Node newNode = new Node(null, data, head);
		if (head == null) {
			tail = newNode;
		} else {
			head.previouse = newNode;
		}
		head = newNode;
		++size;
	}

	// Add at End(tail)
	public void addAtEnd(Object data) {
		Node newNode = new Node(tail, data, null);
		if (tail == null) {
			tail = newNode;
		} else {
			tail.next = newNode;
		}
		tail = newNode;
		++size;
	}

	// insert at index
	public void add(int index, Object data) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Invalid index");
		}

		if (index == 0) {
			addAtStart(data);
			return;
		}
		if (index == size) {
			addAtEnd(data);
			return;
		}
		Node target = getNode(index);
		Node prev = tail.previouse;

		Node newNode = new Node(prev, data, target);
		prev.next = newNode;
		target.previouse = newNode;
		++size;
	}

	public Object removeFirst() {
		if (head == null) {
			throw new NoSuchElementException("List is Empty");
		}

		Object element = head.data;
		head = head.next;
		if (head != null) {
			head.previouse = null;
		} else {
			tail = null;
		}
		--size;
		return element;
	}

	public Object removeLast() {
		if (tail == null) {
			throw new NoSuchElementException("List is empty");
		}

		Object element = tail.data;
		tail = tail.previouse;
		if (tail != null) {
			tail.next = null;
		} else {
			head = null;
		}
		--size;
		return element;
	}

	public Object remove(int index) {
		return "";
	}

	private Node getNode(int index) {
		if (index < (size / 2)) { // Traverse from head
			Node current = head;
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
			return current;
		} else { // Traverse from tail
			Node current = tail;
			for (int i = size - 1; i > index; i--) {
				current = current.previouse;
			}
			return current;
		}
	}
}
