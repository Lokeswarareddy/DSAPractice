package com.java.array;

public class Resize_array {

	public int[] resizeArray(int[] arr, int capacity) {

		int newArrSize = arr.length + capacity;
		int[] newArr = new int[newArrSize];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}

	public static void main(String[] args) {
		Resize_array resz = new Resize_array();
		int[] arr = { 8, 1, 2 };
		// int[] arr = {0, 1, 0, 4 };
		ArrayUtil.printArray(arr);
		ArrayUtil.printArray(resz.resizeArray(arr, 5));
	}
}
