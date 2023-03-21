package com.java.thread;

public class ThreadEx12 {

	public static void main(String[] args) {
		ThreadEx12_1 t1 = new ThreadEx12_1();
		ThreadEx12_2 t2 = new ThreadEx12_2();
		t1.start();
		t2.start();
		
		try {
			t1.sleep(2000);
//			sleep()이 항상 현재 실행 중인 쓰레드에 대해 작동하기 때문에 'th1.sleep(2000)'과 같이 호출하였어도,
//			실제로 영향을 받는 것은 main메서드를 실행하는 main쓰레드이다.
//			그렇기에 t1이 가장 늦게 종료되지 않고, main이 가장 늦게 종료되는 것이다.
		}catch(InterruptedException e) {}
		
		System.out.print("<<main 종료>>");
	} //main
}

class ThreadEx12_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) 
			System.out.print("-");
		System.out.print("<<th1 종료>>");
	} //run()
}

class ThreadEx12_2 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) 
			System.out.print("|");
		System.out.print("<<t2 종료>>");
	} //run()
}
