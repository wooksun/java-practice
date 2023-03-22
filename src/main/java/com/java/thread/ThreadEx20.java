package com.java.thread;

public class ThreadEx20 {

	public static void main(String[] args) {
		Runnable r = new RunnableEx20();
		new Thread(r).start(); //ThreadGroup에 의해 참조되므로 gc대상이 아니다.
		new Thread(r).start(); //ThreadGroup에 의해 참조되므로 gc대상이 아니다.
	}
}

class Account {
	private int balance = 1000; //private으로 해야 동기화가 의미있다.
	
	public int getBalance() {
		return balance;
	}
	
	//잔고가 출금하려는 금액보다 큰 경우에만 출금하도록 되어있음.
	//synchronized를 사용함으로써 ThreadEx19와 달리 출력에 balance:-음수 값이 출력되지 않는다.
	public synchronized void withdraw(int money) { 
		if(balance >= money) {
			try { Thread.sleep(1000);} catch(InterruptedException e) {}
			balance -= money;
			}
		}//withdraw
	}

class RunnableEx20 implements Runnable {
	Account acc = new Account();
	
	public void run() {
		while(acc.getBalance() > 0) {
			//100, 200, 300중의 한 값을 임의로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance:"+acc.getBalance());
		}
	} //run()
}


