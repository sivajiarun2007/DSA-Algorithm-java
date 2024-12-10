package com.dsa.algorithm.cloning;


class Cloning implements Cloneable {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class CloneImpl {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cloning cln = new Cloning();
		
		Cloning cln1 = (Cloning) cln.clone();
		
		System.out.println(cln);
		System.out.println(cln1);
		
	}

}
