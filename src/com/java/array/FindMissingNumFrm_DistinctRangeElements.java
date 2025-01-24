package com.java.array;

/** 
 * Given an array of n-1 distinct numbers in the range of 1 to N.Find the
 * missing number
 */
public class FindMissingNumFrm_DistinctRangeElements {

	public int findMissingNumr(int[] arr) {
		int n = arr.length + 1;
		int sum = (n * (n + 1)) / 2;
		for (int num : arr) {
			sum = sum - num;
		}
		return sum;
	}

	public static void main(String[] args) {

		FindMissingNumFrm_DistinctRangeElements fis = new FindMissingNumFrm_DistinctRangeElements();
		int[] arr = { 2, 4, 1, 8, 6, 3, 7 };
		System.out.println(fis.findMissingNumr(arr));

	}

}
