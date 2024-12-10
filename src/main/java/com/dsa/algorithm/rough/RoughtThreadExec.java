package com.dsa.algorithm.rough;

import java.util.concurrent.Callable;

class SampleCallable implements Callable<Integer> {

	@Override
	public Integer call()  {
		return 1;
	}
	
}

class Samplethread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread execution completed");
	}
}

public class RoughtThreadExec {

	public static void main(String[] args) throws Exception {
		Samplethread sThrea = new Samplethread();
		
		SampleCallable callThrd = new SampleCallable();
		Thread runThread = new Thread(()-> {
			System.out.println("Thread execution completed - direct");
		});
		
		sThrea.start();
		runThread.start();
		System.out.println(callThrd.call());
		
	}

}
