package com.java.thread;

public class ThreadEx16 {

	public static void main(String[] args) {
		ThreadEx16_1 th1 = new ThreadEx16_1("*");
		ThreadEx16_1 th2 = new ThreadEx16_1("**");
		ThreadEx16_1 th3 = new ThreadEx16_1("***");
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend();
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch(InterruptedException e) {}
	}

}
