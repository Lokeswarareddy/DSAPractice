package com.java.Stack;

import java.util.Stack;

public class ValidParanthesesProb {

	public boolean isValidParantheses(String param) {

		Stack<Character> stack = new Stack<>();

		for (char c : param.toCharArray()) {

			if (c == '{' || c == '(' || c == '[') {

				stack.push(c);
			} else {

				if (stack.isEmpty()) {
					return false;
				} else {
					char top = stack.peek();

					if (c == '}' && top == '{' 
							|| c == ')' && top == '(' 
							|| c == ']' && top == '[') {

						stack.pop();
					} else {
						return false;
					}
				}
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		
		ValidParanthesesProb vldParams = new ValidParanthesesProb();
		System.out.println(vldParams.isValidParantheses("{[()]}"));

	}

}
