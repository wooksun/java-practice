package com.java.exam10;

import java.util.Scanner;

class Menu {//이참조 자료형안에displayMenu기능을 정의
	Controller controller;
	Menu(){
		 controller = new Controller();//컨트롤러의 메모리를 할당하고 컨트롤러에 에러가 나는이유는 
		//이와같이 선언하면 지역변수가 되서 필드로 선언해야 한다
	}
	
	public void displayMenu() {//이메서드가 호출되면 사용자로부터 원하는액션의 값을 키보드로 입력받는걸 구현해보려한다
		
		while(true) {//0번을 누르기전까지 무한반복 돌게끔 true값 구현해논다
		System.out.println("\n*****  메뉴 선택  ******");
		System.out.println("0. 프로그램 종료");//while 문을 빠져나가 프로그램 종료
		System.out.println("1. 중학교 친구 정보 저장.");
		System.out.println("2. 고교 친구 정보 저장.");
		System.out.println("3. 대학교 친구 정보 저장.");
		System.out.println("4. 중학교 친구 정보 출력.");
		System.out.println("5. 고교 친구 정보 출력.");//원하는 액션을
		System.out.println("6. 대학교 친구 정보 출력.");
		System.out.println("7. 모든 친구 정보 출력.");
		System.out.println("8. 기본 정보 출력.");
		
		System.out.print("원하는 항목 번호를 선택하세요>>> ");//메세지가 출력되고 번호입력 대기
		
		Scanner input = new Scanner(System.in);//입력 프로그램을 써준다
		//전달받아서 
		int choice = input.nextInt();//숫자열 값을 대기 후 입력값 리턴-문자열이오면 에러
		//전달받아서 그행위를 컨트롤러라고 하는 참조자료형을 정의해서
		switch(choice) {//사용자가 누른값은 choice에 담겨져있다 
		case 0:
			System.out.println("프로그램을 종료합니다.");
			return;//메소드 안에서 리턴은 무조건 벗어난다 리턴을 만나는 순간 디스플레이 메뉴를 벗어나 호출한곳으로 간다
		case 1: case 2: case 3:
			controller.addFriend(choice);//컨트롤러와 메뉴가 영역이 달라서 직접적인 호출이 불가하다 메모리가 할당되어 있지 않아서 
			//항상 서로다른영역에서는 참조변수.으로 접근해야함 사용하고 싶은 위치에서 메모리 할당
			break;
		case 4://중학교 친구 정보 출력
			controller.showMIdFriendInfo();
			break;
		case 5://고등학교
			controller.showHighFriendInfo();
			break;
		case 6://대학교
			controller.showUnivFriendInfo();
			break;
		case 7://모든친구 정보
			controller.showFriendInfo();
			break;
		case 8://기본정보 출력
			controller.showBasicInfo();
			break;
		default://0~3사이에 숫자가 아닐경우 이와 같은 번호를 보여주고 while로 올라가 번호를보여주고 입력을 받을때 까지
			//대리를 받고 숫자를 입력받고 다시 switch문으로 넘어온다
			System.out.println("잘못된 입력을 하셨습니다");
			System.out.println("번호를 확인하세요");
			break;
		}
		}
	}
}
