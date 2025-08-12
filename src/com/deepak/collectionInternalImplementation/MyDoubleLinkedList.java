package com.deepak.collectionInternalImplementation;

public class MyDoubleLinkedList {
	int size = 0;
	Node head = null;
	Node tail = null;

	static class Node {
		Object data;
		Node next;
		Node previouse;

		public Node(Object data) {
			this.data = data;
			next = null;
			previouse = null;
		}
	}

	public Node addAtStart(Object data) {
		Node newNode = new Node(data);
		if (size == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.previouse = newNode;
			head = newNode;
		}
		++size;
		return newNode;
	}

	public Node addAtLast(Object data) {
		Node newNode = new Node(data);
		if (size == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.previouse = tail;
			tail = newNode;
		}
		++size;
		return newNode;
	}

	public Node addAfter(Object data, Node preNode) {
		if (preNode == null) {
			return null;
		} else if (preNode == tail) {
			return addAtLast(data);
		} else {
			Node newNode = new Node(data);
			Node nextNode = preNode.next;
			newNode.next = nextNode;
			preNode.next = newNode;
			nextNode.previouse = newNode;
			newNode.previouse = preNode;
			++size;
			return newNode;
		}

	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(" " + temp.data);
			temp = temp.next;
		}

	}

	public static void main(String[] args) {
		MyDoubleLinkedList md = new MyDoubleLinkedList();
		Node preNode = md.addAtStart(3);
		md.addAtStart(2);
		md.addAtStart(1);
		md.addAtLast(4);
		md.addAtLast(5);
		md.addAfter(10, preNode);
		md.print();
	}
}