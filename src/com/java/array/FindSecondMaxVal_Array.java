package com.java.array;

public class FindSecondMaxVal_Array {

	public int FindSecondMaxVal(int[] arr) {
		int fmax = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > fmax) {
				smax = fmax;
				fmax = arr[i];
			} else if (arr[i] > smax && arr[i] != fmax) {
				smax = arr[i];
			}
		}
		return smax;
	}

	public static void main(String[] args) {

		FindSecondMaxVal_Array FSecondMaxVal = new FindSecondMaxVal_Array();
		int[] arr = { 13, 34, 2, 34, 33, 1, 50, 32, 34 };
		System.out.println(FSecondMaxVal.FindSecondMaxVal(arr));

	}

}
