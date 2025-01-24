package com.java.array;

public class ArrayUtil {

	public static void main(String[] args) {

		ArrayUtil arrutl = new ArrayUtil();
		arrutl.arrayDemo();

	}

	public void arrayDemo() {
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 1;
		arr[2] = 8;
		arr[3] = 2;
		arr[4] = 10;
		printArray(arr);
	}

	public void printArray(int[] arr) {
		int n = arr.length;
		System.out.println("Array Length : "+n);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
