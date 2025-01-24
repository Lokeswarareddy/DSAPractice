package com.java.array;
/*
 * Given an array of integers, write a function to move all 0's to end of array and while maintaining 
 * the relative order of the non-zero elements
 * here 'i' pointing to non-zero elements and 'j' pointing to zero elements
 */
public class MoveAllZeroEndOfArray {

	public void moveZeros(int arr[]) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			if (arr[j] != 0) {
				j++;
			}
		}
	}

	public static void main(String[] args) {

		MoveAllZeroEndOfArray move = new MoveAllZeroEndOfArray();
		int[] arr = { 8, 1, 0, 2, 1, 0, 3 };
		//int[] arr = {0, 1, 0, 4, 1, 0,2 };
		ArrayUtil.printArray(arr);
		move.moveZeros(arr);
		ArrayUtil.printArray(arr);

	}

}
