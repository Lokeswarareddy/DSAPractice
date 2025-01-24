package com.java.array;

public class FindThirdMaxVal_Array {

	public int FindThirdMaxVal(int[] arr) {
		int fmax = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		int tmax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > fmax) {
				tmax = smax;
				smax = fmax;
				fmax = arr[i];
			} else if (arr[i] > smax && arr[i] != fmax) {
				tmax =smax;
				smax = arr[i];
			} else if (arr[i] > tmax && arr[i] != smax) {
				tmax = arr[i];
			}
		}
		return tmax;
	}

	public static void main(String[] args) {

		FindThirdMaxVal_Array FThirdMaxVal = new FindThirdMaxVal_Array();
		int[] arr = { 13, 34, 2, 34, 33, 1, 50, 32, 34 };
		System.out.println(FThirdMaxVal.FindThirdMaxVal(arr));

	}

}
