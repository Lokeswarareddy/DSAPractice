package com.java.algo.search;

public class SearchInstnPstnInGvnSortedArray {

	// Note : provide better search results on Sorted Array
	
	public int searchInsrtionPstn(int[] arr, int target) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] == target) {
				return mid;
			}
			if (target < arr[mid]) {

				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 10, 20, 47, 59, 65, 75, 88, 99 };
		SearchInstnPstnInGvnSortedArray sip = new SearchInstnPstnInGvnSortedArray();
		System.out.println("Insert key Index Position : " + sip.searchInsrtionPstn(arr, 66));
		System.out.println("Insert key Index Position : " + sip.searchInsrtionPstn(arr, 100));
	}

}
