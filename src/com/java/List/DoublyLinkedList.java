package com.java.List;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

	private ListNode head;
	private ListNode tail;
	private int length;

	private class ListNode {

		private ListNode next;
		private ListNode previous;
		private int data;

		public ListNode(int data) {

			this.data = data;
		}
	}

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;

	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int length() {

		return length;
	}

	public void insertLast(int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		newNode.previous = tail;
		tail = newNode;
		length++;
	}

	public void inserFirst(int data) {

		ListNode newNode = new ListNode(data);
		if (isEmpty()) {

			tail = newNode;
		} else {
			head.previous = newNode;
			newNode.next = head;
			head = newNode;
			length++;
		}

	}

	public void displayForward() {
		if (head == null) {
			return;
		}

		ListNode frwCrrent = head;
		while (frwCrrent != null) {
			System.out.print(frwCrrent.data + " -> ");
			frwCrrent = frwCrrent.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public void displayBackward() {
		if (tail == null) {
			return;
		}

		ListNode bckwrdCrrent = tail;
		while (bckwrdCrrent != null) {
			System.out.print(bckwrdCrrent.data + " -> ");
			bckwrdCrrent = bckwrdCrrent.previous;
		}
		System.out.print("null");
		System.out.println();
	}

	public ListNode deleteFirst() {

		if (isEmpty()) {
			throw new NoSuchElementException(" Empty DLL");
		}
		ListNode temp = head;
		if (head == tail) {
			tail = null;
		} else {
			head.next.previous = null;
		}
		head = head.next;
		temp.next = null;
		length--;
		return temp;
	}

	public ListNode removeLast() {

		if (isEmpty()) {
			throw new NoSuchElementException(" Empty DLL");
		}
		ListNode temp = tail;
		if (head == tail) {
			head = null;
		} else {
			tail.previous.next = null;
		}
		tail = tail.previous;
		temp.previous = null;
		length--;
		return temp;

	}

	public static void main(String[] args) {

		DoublyLinkedList DLL = new DoublyLinkedList();
		DLL.insertLast(5);
		DLL.insertLast(10);
		DLL.insertLast(15);
		DLL.insertLast(20);
		DLL.displayForward();
		DLL.displayBackward();
		DLL.inserFirst(2);
		DLL.displayForward();
		DLL.deleteFirst();
		DLL.displayForward();
	}

}
