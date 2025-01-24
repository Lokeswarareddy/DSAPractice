package com.java.array;

public class FindMaxVal_Array {

	public int findMaxVal(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		FindMaxVal_Array FindMin = new FindMaxVal_Array();
		int[] arr = { 5, 6, 3, 15, 1, 2 };
		System.out.println(FindMin.findMaxVal(arr));

	}

}
