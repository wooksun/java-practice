package com.java.thread;

public class ThreadEx8 {
	public static void main(String[] args) {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
//		th1과 th2 모두 main메서드에서 생성하였기 때문에, main메서드를 실행하는 쓰레드의 우선순위인 5를 상속받았다.
		
		th2.setPriority(7);
//		th2의 우선순위를 7로 변경한 다음 start()를 호출해서 쓰레드를 실행
		
		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th2(|) : " + th2.getPriority());
		th1.start();
		th2.start();
	}

}

class ThreadEx8_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
			for(int x=0; x<10000000; x++);
		}
	}
}

class ThreadEx8_2 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) { //우선순위가 높아지면 한번에 작업이 끝나버릴 수 있기 때문에, 아무 일도 하지않는 반복문을 추가. (작업을 지연시키기 위한 for문)
			System.out.print("|");
			for(int x=0; x<10000000; x++);
		}
	}
}
