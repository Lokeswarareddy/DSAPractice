package com.java.array;

public class Palindrome_Array {

	public boolean palindrome(String str) {

		char[] strArray = str.toCharArray();
		int start = 0;
		int end = strArray.length - 1;
		while (start < end) {
			if (strArray[start] != strArray[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		Palindrome_Array palidrome = new Palindrome_Array();
		System.out.println(palidrome.palindrome("madam"));
		System.out.println(palidrome.palindrome("reddy"));

	}

}
