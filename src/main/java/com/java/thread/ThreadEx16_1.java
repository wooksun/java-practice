package com.java.thread;

public class ThreadEx16_1 implements Runnable {
	boolean suspended = false;
	boolean stopped = false;
	
	Thread th;
	
	ThreadEx16_1(String name) {
		th = new Thread(this, name); 
	}
	
	public void run() {
		String name = th.getName();
		
		while(!stopped) {
			if(!suspended) {
				System.out.println(name);
				try {
					Thread.sleep(1000); //interrupt()가 호출되면 예외가 발생한다.
				} catch(InterruptedException e) {
					System.out.println(name + " - interrupted");
				}
			}else {
				Thread.yield();
			}
		}
		System.out.println(name + " - stopped");
	}
	
	public void suspend() {
		suspended = true;
		th.interrupt();
		System.out.println(th.getName() + " - interrupt() bt suspend()");
	}
	
	public void stop() {
		stopped = true;
		th.interrupt();
		System.out.println(th.getName() + " - interrupt() bt stop()");
	}
	
	public void resume() {suspended = false; }
	public void start() { th.start(); }

}
