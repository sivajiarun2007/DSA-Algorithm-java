package com.dsa.algorithm.rough;

class Key {
	String message;

	public Key(String message) {
		this.message = message;
	}
}

class WaiterThread extends Thread {

	Key key;
	String name;
	
	public WaiterThread(String name, Key key) {
		this.key = key;
		this.name = name;
	}
	
	@Override
	public void run() {
		
		synchronized (key) {
			System.out.println("The Thread " + name + "is started");
			System.out.println("The Thread " + name + "is going to wait now");
			try {
				key.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("The Thread " + name + "Completed");
		}
		
	}

}

class NotifierThread extends Thread {

	Key key;
	String name;
	
	public NotifierThread(String name, Key key) {
		this.key = key;
		this.name = name;
	}
	
	@Override
	public void run() {
		
		synchronized (key) {
			System.out.println("The Thread " + name + "is started");
			System.out.println("The Thread " + name + "is going to trigger notify");
			key.notifyAll();
			
			System.out.println("The Thread " + name + "Completed");
		}
		
	}

}

public class WaitNotifyImpl {

	public static void main(String[] args) throws InterruptedException {
		
		Key key = new Key("Key1");
		WaiterThread w1 = new WaiterThread("waiter 1", key);
		WaiterThread w2 = new WaiterThread("waiter 2", key);
		
		w1.start();
		w2.start();
		
		NotifierThread nt = new NotifierThread("notifier 1", key);
		Thread.sleep(1000);
		nt.start();

	}

}
