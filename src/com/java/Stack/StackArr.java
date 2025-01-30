package com.java.Stack;

public class StackArr {

	private int top;
	private int arr[];

	public StackArr() {
		arr = new int[10];
	}

	public StackArr(int capacity) {
		top = -1;
		arr = new int[capacity];
	}

	public void push(int data) {
		top++;
		arr[top] = data;
	}

	public int pop() {

		int result = arr[top];
		top--;
		return result;
	}

	public int peek() {
		int result = arr[top];
		return result;
	}

	public boolean isEmpty() {

		return top < 0;
	}

	public boolean isFull() {
		return top == size();
	}

	public int size() {

		return top + 1;
	}

	public static void main(String[] args) {

		StackArr str = new StackArr();
		str.push(10);
		str.push(20);
		str.push(30);
		str.push(40);
		System.out.println(str.peek());
		System.out.println(str.pop());
		System.out.println(str.pop());
		System.out.println(str.pop());

	}

}
