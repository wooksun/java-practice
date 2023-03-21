package com.java.thread;

public class ThreadEx10 implements Runnable {
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		Thread t = new Thread(new ThreadEx10());
		t.setDaemon(true); //이 부분이 없으면 종료되지 않는다.
		//setDeamon메서드는 반드시 start()를 호출하기 전에 실행되어야 한다.
		t.start();
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000); //숫자 출력할 때 1초간 대기.(1이 찍히고 2가 찍히기까지의 시간)
			} catch(InterruptedException e) {} //catch가 예외를 잡아주는 역할을 하지만, {}안에 내용이 없어서 사실상 프로그램이 중단되는걸 막아주는 역할만 함.
			System.out.println(i);
			
			if(i==5)
				autoSave = true;
		}
		
		System.out.println("프로그램을 종료합니다.");
	} //main
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(3 * 1000); //3초마다
			} catch(InterruptedException e) {}
			
			//autoSave의 값이 true이면 autoSave()를 호출한다.
			if(autoSave) {
				autoSave();
			}
		}
	} //run()

	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}
