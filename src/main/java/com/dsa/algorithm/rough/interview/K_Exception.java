package com.dsa.algorithm.rough.interview;

public class K_Exception {

	public static void main(String[] args) {
		
		try {
			
//		} catch (OutOfMemoryError e) { -- errors can be caught but is notnrecpmmended to do
		} catch (NullPointerException e) {
			throw new NullPointerException();
//			System.out.println("Hi");
		}
		
		
//		IOException  -- Checked Exception
//		NullPointerException -- Uncked exceptoion that is a runtime exception
	}

}
