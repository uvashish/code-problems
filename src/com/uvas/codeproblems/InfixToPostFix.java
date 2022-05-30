package com.uvas.codeproblems;

import java.util.Stack;

public class InfixToPostFix {

	public static void main(String[] args) {
		String expression = "A+B*(C^D-E)";

		System.out.println("Given Expression :: " + expression);

		System.out.println("PostFix expression :: " + convertInfixToPostFix(expression));

	}

	public static String convertInfixToPostFix(String expression) {

		String postfix = "";
		Stack<Character> stack = new Stack<>();

		int index = 0;
		while (index < expression.length()) {

			Character ch = expression.charAt(index);

			if (operatorPrecedence(ch) > 0) {
				while (!stack.isEmpty() && operatorPrecedence(stack.peek()) >= operatorPrecedence(ch)) {
					postfix = postfix + stack.pop();
				}
				stack.push(ch);
			} else if (ch == ')') {
				char top = stack.pop();
				while (top != '(') {
					postfix = postfix + top;
					top = stack.pop();
				}
			} else if (ch == '(') {
				stack.push(ch);
			} else {
				postfix = postfix + ch;
			}

			index++;

		}

		while (!stack.isEmpty()) {
			char ch = stack.pop();
			postfix = postfix + ch;
		}
		return postfix;

	}

	private static int operatorPrecedence(char operator) {
		switch (operator) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}
}
