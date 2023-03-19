package com.java.thread;

public class ThreadEx1 {

	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1(); //Thread의 자손 클래스의 인스턴스 생성
		
		Runnable r = new ThreadEx1_2();//Runnable을 구현한 클래스의 인스턴스 생성
		Thread t2 = new Thread(r); //생성자 Thread(Runnable target)
		
		//Thread t2 = new Thread(new ThreadEx1_2()); //위의 두 줄을 한 줄로 간단히 한 코드
		
//		start() -> start()를 호출해야만 쓰레드가 실행된다.
		t1.start(); //쓰레드 t1을 실행시킨다.
		t2.start(); //쓰레드 t2를 실행시킨다.
	}

}

class ThreadEx1_1 extends Thread {
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName()); //조상인 Thread의 getName()을 호출
//			Thread를 상속받은 ThreadEx1_1에서는 간단히 getName()을 호출할 수 있음
		}
	}
}

class ThreadEx1_2 implements Runnable {
	public void run() {
		for(int i=0; i<5;i++) {
//			Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
			System.out.println(Thread.currentThread().getName());
//			Runnable을 구현한 ThreadEx1_2에 멤버라고는 run()밖에 없기 때문에, getName()을 호출하려면 'Thread.currentTread().getName()'와 같이 해야함.
		}
	}
}
