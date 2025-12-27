package com.dsa.algorithm.rough.interview;

import java.util.Comparator;

public class K_Checked_UnckedException {
	
	
	class CheckedExcep extends Exception {
		

		private static final long serialVersionUID = 1L;
		
		public CheckedExcep() {
			super("Checked");
		}

		
	}
	
	class UnCheckedExcep extends RuntimeException {

		private static final long serialVersionUID = 1L;
		
		public UnCheckedExcep() {
			super("UnCheckedExcep");
		}

		
	}

	public static void main(String[] args) {
		
//		throw new UnCheckedExcep();
		
	}

}
