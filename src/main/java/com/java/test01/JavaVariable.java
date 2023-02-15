package com.java.test01;

public class JavaVariable { //JavaVariable - 변수

	public static void main(String[] args) {
		int year = 5; //이 부분이 변수의 초기화
		int age = 15; 
		int tmp = 0; //year와 age의 값이 서로 옮겨질 수 있도록 하는 중간다리 변수
		
		System.out.println("year:" + year + " age:" + age);
		
		tmp = year; //tmp라는 빈 값에 year의 값 5을 넣음
		year = age; //year를 age로 값으로 받음 15
		age = tmp; //age를 year의 값을 받은 tmp의 5을 받음
		
		System.out.println("year:" + year + " age:" + age);
		
		
//		System.out.println(year);
//		System.out.println(age);
		
	}

}
