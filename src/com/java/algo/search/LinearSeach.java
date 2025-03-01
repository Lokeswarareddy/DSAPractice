package com.java.algo.search;

public class LinearSeach {

	public int linearSearch(int arr[], int key) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {

			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int [] arr = {5,1,9,2,10,15,20};
		LinearSeach ls = new LinearSeach();
		System.out.println("Searched key Index : "+ls.linearSearch(arr, 10));
		System.out.println("Searched key Index : "+ls.linearSearch(arr, 50));
	}

}
