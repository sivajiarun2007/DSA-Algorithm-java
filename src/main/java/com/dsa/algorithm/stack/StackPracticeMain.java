package com.dsa.algorithm.stack;

public class StackPracticeMain {

	public static String reverseString(String input) {
		Stack<Character> reverseStack = new Stack();
		for (int i = 0; i < input.length(); i++) {

			Character c = input.charAt(i);
			reverseStack.push(c);
		}
		String result = "";
		// System.out.println("size: " + reverseStack.size());
		int stackLength = reverseStack.size();
		for (int i = 0; i < stackLength; i++) {
			System.out.println("i: " + i);
			System.out.println("size: " + reverseStack.size());
			result = result + reverseStack.pop().toString();
		}
		return result;
	}

	public boolean isBalancedParentheses(String input) {
		System.out.println("Input:  " + input);
		Stack<Character> bracketsStack = new Stack();
		if (input.length() == 1)
			return false;
		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i);
			if (c == '(') {
				bracketsStack.push(c);
			} else if (c == ')') {
				Character popElem = bracketsStack.pop();
				if (popElem != null && popElem != '(')
					return false;
			}
		}

		return bracketsStack.size() == 0;
	}

	public static void sortStack(Stack<Integer> stack) {
		Stack<Integer> soretedStack = new Stack<>();
		while (stack.peek() != null) {
			if (soretedStack.size() == 0) {
				soretedStack.push(stack.pop());
			} else {

				if (stack.peek() != null && soretedStack.peek() != null && stack.peek() < soretedStack.peek()) {
					int ssElement = soretedStack.pop();
					int orgElement = stack.pop();
					stack.push(ssElement);
					stack.push(orgElement);
					
				} else {
					soretedStack.push(stack.pop());
				}
			}
		}
		System.out.println("soretedStack.size()" + soretedStack.size());
		if (soretedStack.size() > 0) {
		    while(soretedStack.peek() != null) {
		        stack.push(soretedStack.pop());
		    }
		}

	}
	/** Enqueue using a stack
	
	public void enqueue(int value) {
        if(stack1.isEmpty()) {
            stack1.push(value);
        } else {
            while(stack1.peek() != null) {
                stack2.push(stack1.pop());
            }
            stack2.push(value);
            
            while(stack2.peek() != null) {
                stack1.push(stack2.pop());
            }
        }
        
    } **/

	public static void main(String[] args) {

	}

}
