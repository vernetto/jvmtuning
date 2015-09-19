package com.pierre.heap;

public class LockGeneration {
	public static Object myMonitor = new Object();

	public static void main(String[] args) throws InterruptedException {
		T1 t1 = new T1();
		T2 t2 = new T2();
		t1.start();
		t2.start();
		for (;;) {
			Thread.sleep(1000);
		}
	}

}

class T1 extends Thread {

	@Override
	public void run() {
		System.out.println("T1 started");
		super.run();
		for (;;) {
			try {
				synchronized (LockGeneration.myMonitor) {
					Thread.sleep(1030);
				}
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class T2 extends Thread {

	@Override
	public void run() {
		System.out.println("T2 started");
		super.run();
		for (;;) {
			try {
				synchronized (LockGeneration.myMonitor) {
					Thread.sleep(1050);
				}
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}