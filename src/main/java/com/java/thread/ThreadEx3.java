package com.java.thread;

public class ThreadEx3 {

	public static void main(String[] args) {
		ThreadEx3_1 t1 = new ThreadEx3_1();
		t1.run(); //ThreadEx2와 다르게 t1.start()를 호출하지 않음
	}

}

class ThreadEx3_1 extends Thread {
	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}