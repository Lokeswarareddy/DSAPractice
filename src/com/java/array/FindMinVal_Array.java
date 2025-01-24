package com.java.array;

public class FindMinVal_Array {

	public int findMinVal(int arr[]) {

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		FindMinVal_Array FindMin = new FindMinVal_Array();
		int[] arr = { 5, 6, 3, 15, 1, 2 };
		System.out.println(FindMin.findMinVal(arr));

	}

}
