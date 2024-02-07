package com.dsa.algorithm.stack;

public class StackPracticeMain {
	
	public static String reverseString(String input) {
        Stack<Character> reverseStack = new Stack();
        for(int i = 0; i < input.length(); i++) {
            
            Character c = input.charAt(i);
            reverseStack.push(c);
        }
        String result = "";
        // System.out.println("size: " + reverseStack.size());
        int stackLength = reverseStack.size();
        for(int i = 0; i < stackLength; i++) {
            System.out.println("i: " + i); 
            System.out.println("size: " + reverseStack.size());
            result = result + reverseStack.pop().toString();
        }
        return result;
    }
	
	public boolean isBalancedParentheses(String input) {
        System.out.println("Input:  " + input);
		Stack<Character> bracketsStack = new Stack();
		if(input.length() == 1) return false;
		for(int i=0; i< input.length(); i++) {
			Character c = input.charAt(i);
			if(c == '(') {
				bracketsStack.push(c);
			} else if(c == ')') {
				Character popElem = bracketsStack.pop();
				if(popElem != null && popElem != '(')
				    return false;
			}
		}
		
		return bracketsStack.size() == 0;
	}

	public static void main(String[] args) {
		
	}

}
