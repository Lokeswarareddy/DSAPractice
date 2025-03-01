package com.java.algo.search;

public class BinarySearch {

	// Note : provide better search results on Sorted Array
	
	public int binarySearch(int arr[], int target) {

		int low = 0;
		int high = arr.length-1;

		while (low <= high) {

			int mid = (high + low) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (target < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 10, 20, 47, 59, 65, 75, 88, 99 };
		BinarySearch bs = new BinarySearch();
		System.out.println("Searched key Index : " + bs.binarySearch(arr, 65));
		System.out.println("Searched key Index : " + bs.binarySearch(arr, 100));

	}

}
