package com.uvas.codeproblems;

import java.util.Stack;

public class EvaluatePostfixNotationSingleDigitOperand {

	public static void main(String[] args) {

		String expression = "34^";

		System.out.println("Given Expression :: " + expression);
		String exp = InfixToPostFix.convertInfixToPostFix(expression);

		System.out.println("postfix expression :: " + exp);

		System.out.println("Evaluate Result :: " + evaluatePostFix(exp));

	}

	private static double evaluatePostFix(String expression) {
		Stack<Double> stack = new Stack<>();

		for(int i =0; i<expression.length(); i++) {
			char c = expression.charAt(i);
			if(isOperator(c)) {
				double a = stack.pop();
				double b = stack.pop();
				Double r = evaluate(a,b,c);
				System.out.println(r);
				stack.push(r);
			}else {
				Double num = Double.parseDouble(String.valueOf(c));
				stack.push(num);
			}
		}
		return stack.pop();
	}
	
	private static boolean isOperator(char c) {
		return c == '+' || c == '-' || c == '*' || c == '/' || c == '-' || c == '^';
	}
	
	private static Double evaluate(double a, double b, char op) {

		switch (op) {
			case '+':
				return b + a;
			case '-':
				return b - a;
			case '*':
				return b * a;
			case '/':
				if (a == 0)
					throw new UnsupportedOperationException("Cannot divide by zero");
				return b / a;
			case '^':
				return Math.pow(b, a);
		}
		return 0.0;

	}

}
