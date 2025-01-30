package com.java.Queue;

import java.util.NoSuchElementException;

public class Queue {

	private ListNode front;
	private ListNode rear;
	private int length;

	private class ListNode {

		private ListNode next;
		private int data;

		public ListNode(int data) {
			this.next = null;
			this.data = data;
		}
	}

	public Queue() {

		this.front = null;
		this.rear = null;
		this.length = 0;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int size() {
		return length;
	}

	public void enQueue(int data) {
		ListNode newNode = new ListNode(data);
		if (isEmpty()) {
			front = newNode;
		} else {

			rear.next = newNode;
		}
		rear = newNode;
		length++;
	}

	public int deQueue() {

		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty!!!");
		}
		int result = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		length--;
		return result;
	}

	public void printQueue() {

		if (isEmpty()) {
			return;
		}

		ListNode temp = front;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int firstElement() {

		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty!!!");
		}
		return front.data;

	}

	public int lastElement() {

		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty!!!");
		}
		return rear.data;

	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		queue.printQueue();
		System.out.println("Length : " + queue.length);
		System.out.println(queue.deQueue());
		System.out.println("Length : " + queue.length);
		System.out.println(queue.deQueue());
		System.out.println("First Element : " + queue.firstElement());
		System.out.println("Last Element : " + queue.lastElement());

	}

}
