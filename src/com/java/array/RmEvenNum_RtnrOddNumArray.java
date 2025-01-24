package com.java.array;

public class RmEvenNum_RtnrOddNumArray {

	// Remove Even numbers from an array and return Odd Number array

	public int[] removeEven(int[] arr) {

		int lenght = arr.length;

		int OddNumCount = 0;

		for (int i = 0; i < lenght; i++) {
			if (arr[i] % 2 != 0) {
				OddNumCount++;
			}
		}
		int[] oddNumArray = new int[OddNumCount];
		int indexId = 0;
		for (int i = 0; i < lenght; i++) {
			if (arr[i] % 2 != 0) {
				oddNumArray[indexId] = arr[i];
				indexId++;
			}
		}
		return oddNumArray;
	}

	public static void main(String[] args) {

		RmEvenNum_RtnrOddNumArray RENR = new RmEvenNum_RtnrOddNumArray();

		int[] input = { 3, 2, 4, 7, 10, 6, 5 };
		System.out.println("Before :");
		ArrayUtil.printArray(input);
		int[] output = RENR.removeEven(input);
		System.out.println("\nAfter :");
		ArrayUtil.printArray(output);

	}

}
