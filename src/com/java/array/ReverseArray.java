package com.java.array;

public class ReverseArray {

	public int[] reverseArray(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		return arr;
	}

	public static void main(String[] args) {
		ReverseArray rvsrArr = new ReverseArray();
		int[] arr = { 2, 11, 5, 10, 7, 8,9 };
		ArrayUtil.printArray(arr);
		rvsrArr.reverseArray(arr, 0, arr.length - 1);
		ArrayUtil.printArray(arr);
	}

}
