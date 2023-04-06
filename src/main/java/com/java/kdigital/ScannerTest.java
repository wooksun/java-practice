package com.java.kdigital;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
//		변수 : 프로그램에서 처리할 데이터(상수)를 기억하는 기억장소를 말한다.
//		변수 이름은 영문자, 숫자, 특수문자 '_'만 가능, 첫 글자 반드시 문자로 시작.
//		변수는 변수를 선언한 후 최초로 사용하기 전에 반드시 초기화 시켜야 함.
//		예약어는 변수 이름으로 사용하면 안된다.
		
//		자료형 변수이름; (int num;)  //변수만 선언 => 변수에는 쓰레기가 들어있다. (뭐가 들어있는지 모름)
//		자료형 변수이름 = 초기치; (int num = 8(초기치);)
		
//		"="의 의미는 "=" 오른쪽의 데이터를 "=" 왼쪽의 기억장소에 대입 => 대입문
		int num = 8;
		System.out.println(num);
		
//		Class는 설계도다. 설계도만 있으면 아무것도 못함. -> 제품을 만들기 위해 인스턴스 객체가 상세 됨
		
//		Scanner - java.util -> Scanner는 java.util이라는 pakage안에 있는 class이다.
//		클래스이름 객체이름 = new 생성자(); -> 생성자 이름은 클래스 이름과 같다. (ex Scanner sc = new Scanner();)
		
		Scanner scanner = new Scanner(System.in); //사용자로부터 입력받음.
		
//		키보드로 입력받은 데이터를 변수에 저장한다.
		System.out.print("주소: "); //주소: 
		String addr = scanner.nextLine(); //주소: (사용자가 문자를 입력할 수 있도록, 문자열 String을 입력)
		System.out.print("이름: ");
		String name = scanner.nextLine();
		
//		next() : 한 단어 입력
//		nexxtLine() : 한 줄 입력 
//		next(), nextLine = 문자열 받음
//		Scanner로 입력하는 내용을 입력받을 경우 바로 변수에 저장되는 것 X, 키보드 버퍼라는 임시 기억장소에 저장된 후
//		메소드가 실행될 때 변수에 저장된다.
		
//		★ nextLine()은 키보드 버퍼가 비어있으면 입력을 기다리며 대기하지만, 키보드 버퍼가 비어있지 않으면,
//		키보드 버퍼의 내용을 끝까지 읽어들인다.
		
//		String addr = scanner.next(); -> 주소 : 서울시 종로구 관철동 을 입력했을 때, 
//		주소는 서울시까지 입력을 받고, 나머지 '종로구 관철동'은 키보드버퍼에 저장이 됨. -> 이름에 종로구 관철동이 들어가게 됨.
		
		System.out.println(name + "님은 " + addr + "에 삽니다.");
//		
		
		
	}

}
