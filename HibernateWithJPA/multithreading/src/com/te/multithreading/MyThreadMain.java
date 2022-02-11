package com.te.multithreading;

public class MyThreadMain {
	public static void main(String[] args) {
		Thread myThread = new MyThread();
		myThread.start();
		for (char i = 'a'; i < 'k'; i++) {
			System.out.println(i + "--" + Thread.currentThread().getName());

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
