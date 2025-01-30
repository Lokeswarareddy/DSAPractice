package com.java.Stack;

import java.util.Stack;

import com.java.array.ArrayUtil;

public class NextGreaterElement {

	public int[] nextGreaterElement(int[] arr) {

		int[] result = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = arr.length - 1; i >= 0; i--) {

			if (!stack.isEmpty()) {

				while (!stack.isEmpty() && stack.peek() <= arr[i]) {

					stack.pop();
				}
			}
			if (stack.isEmpty()) {
				result[i] = -1;
			} else {
				result[i] = stack.peek();
			}
			stack.push(arr[i]);
		}
		return result;
	}

	public static void main(String[] args) {

		NextGreaterElement nextGrtEle = new NextGreaterElement();
		int[] result = nextGrtEle.nextGreaterElement(new int[] { 4, 7, 3, 4, 8, 1 });
		ArrayUtil.printArray(result);

	}

}
