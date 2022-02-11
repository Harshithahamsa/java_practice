package com.te.multithreading;

public class MyThreadInterfaceMain {
	public static void main(String[] args) {
		Runnable runnable = new MyThreadInterface();
		Thread thread = new Thread(runnable);
		thread.start();
		for (char i = 'l'; i < 'z'; i++) {
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
