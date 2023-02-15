package com.java.exam10;

class HighFriend extends Friend {//고등학교 친구(상속의 구조)
	//field
	private String work;//직업
	
	
	HighFriend(String name, String phoneNum, String address,String work) {
		//자식클래스에서 부모클래스를 초기화 시켜줘야하는 의무를 가진다
		super(name, phoneNum, address);
		this.work = work;
		
	}
	//method
	//public void showHighFriendInfo() {//showHighFriendInfo를 메서드 오버라이딩 구조로 만들면 자식의 메소드에도 호출
	public void showFriendInfo() {//로 바꿔주면 메서드 오버라이딩 구조로 만들어준거다 부모에 정의되어저 있는 메서드와 똑같이
		//자식에 자료형에 정의하는 것
		super.showFriendInfo();//부모의 메서드를 호출
		System.out.println("직업: " + work);
	} 
	public void showBasicFriendInfo(){//오버라이딩 관계로 만들어줬다
		// 이름/폰번호
		System.out.println("이름: " + getName() );//Friend 에있는 접근제어private 때문에 접근을 할수없어서 에러를 낸다 
		System.out.println("폰번호: " + getPhoneNum() );//해결방안:protected로 선언해서 필드를 공유하도록 해줫지만 이렇게되면
		//문제점이 발생할수있다 같은 패키지않에 정의되어있는 참조자료형이 있다고 하면 이변수값 읽어가겠다 라고하면
		//읽어가진다 그래서 이방법은 사용하지 않고 메서드를 정의하는 방식으로 값만읽어갈수 있게 정의를 해준다
	}
}
