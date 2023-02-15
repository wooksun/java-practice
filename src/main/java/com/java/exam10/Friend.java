package com.java.exam10;
//부모클래스로 사용할 목적으러 정의한 참조자료형

 abstract class Friend {//공통 특징
	//추상메서드가 없더라도 추상클래스를 정의할수는 있다
	//그럼 추상클래스만을 정의하면 어떤의미를 가질까:단독으로 사용할 목적으로 사용할 클래스가 아니란걸 의미한다
	//즉 new Friend 하면 에러를 내고 상속에 관계에서 부모클래스로 사용하고자 할때 클래스에 abstract키워드로 정의한다
	//field
	private String name; //이름
	private String phoneNum; //폰번호
	private String address; //주소
	
	//Constructor생성자를 정의하자 필드가 있으니
	Friend(String name,String phoneNum,String address){//필드를 초기화 전달받을 데이터를 정의한다
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	//method
	public void showFriendInfo() {
		System.out.println("이름: " + name);
		System.out.println("폰번호: " + phoneNum);
		System.out.println("주소: " + address);
		
	}//getter and setter을 선언해주고 간접접근을 가능하게 해준다
	public String getName() {//제네러이터 게터 엔드 세터
		return name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public String getAddress() {
		return address;
	}
	abstract public void showBasicFriendInfo();//추상에소드 참조자료형안에 추상메서드가 정의되었으면 참조자료형도 추상클래스로
	//정의를 해줘야한다 추상메소드라고 불리우는 얘는 {}표기안함
	//abstract를 달아주면 오버라이딩 목적으로 정의한 메소드 에요
	//오버라이딩의 기능은 이용하려고 이름만 정의해둔다
}