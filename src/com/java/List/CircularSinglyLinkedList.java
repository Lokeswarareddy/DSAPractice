package com.java.List;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {

	private ListNode last;
	private int length;

	private class ListNode {

		private ListNode next;
		private int data;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public CircularSinglyLinkedList() {
		last = null;
		length = 0;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int length() {

		return length;
	}

	public void createCSLL() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(5);
		ListNode l3 = new ListNode(10);
		ListNode l4 = new ListNode(15);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l1;
		last = l4;
	}

	public void display() {

		if (last == null) {
			return;
		}
		ListNode first = last.next;
		while (first != last) {

			System.out.print(first.data + " -> ");
			first = first.next;
		}
		System.out.print(first.data);
		System.out.println();
	}

	public void insertFirst(int data) {

		ListNode newNode = new ListNode(data);
		if (last == null) {
			last = newNode;
		} else {
			newNode.next = last.next;
		}
		last.next = newNode;
		length++;

	}

	public void insertLast(int data) {

		ListNode newNode = new ListNode(data);
		if (last == null) {
			last = newNode;
			last.next = last;
		} else {
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
		length++;

	}

	public ListNode removeFirst() {

		if (isEmpty()) {

			throw new NoSuchElementException("CSLL is already empty");
		}
		ListNode temp = last.next;
		if (last.next == last) {
			last = null;
		} else {
			last.next = temp.next;
		}
		temp.next = null;
		length--;
		return temp;
	}

	public static void main(String[] args) {

		CircularSinglyLinkedList CSLL = new CircularSinglyLinkedList();
		CSLL.createCSLL();
		CSLL.display();
		CSLL.insertFirst(12);
		CSLL.display();
		CSLL.insertLast(20);
		CSLL.display();
		CSLL.removeFirst();
		CSLL.display();

	}
}
