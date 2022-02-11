package com.te.multithreading;

public class MyThreadInterface implements Runnable{

	@Override
	public void run() {
		
		for (int i = 15; i < 30; i++) {
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
