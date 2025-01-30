package com.java.Stack;

import java.util.Stack;

public class ReverseString {

	public String reverse(String s) {

		Stack<Character> stack = new Stack<>();
		char[] chars = s.toCharArray();

		for (char c : chars) {
			stack.push(c);
		}
		for (int i = 0; i < s.length(); i++) {
			chars[i] = stack.pop();
		}
		return new String(chars);
	}

	public static void main(String[] args) {

		String str = "ABDCF";
		ReverseString rev = new ReverseString();
		System.out.println(str);
		System.out.println(rev.reverse(str));

	}

}
