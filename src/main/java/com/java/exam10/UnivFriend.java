package com.java.exam10;

class UnivFriend extends Friend {//대학교 친구
	//field
	private String major;
	
	UnivFriend(String name, String phoneNum, String address,String major) {
		super(name, phoneNum, address);
		this.major = major;
		
	}
	//method
	//public void showUnivFriendInfo() {
	public void showFriendInfo() {
		super.showFriendInfo();//부모 클래스의 메소드를 가져오겠다
		System.out.println("직업 " + major);
	}
public void showBasicFriendInfo(){
	//이름 주소 전공
	System.out.println("이름: " + getName());
	System.out.println("주소: " + getAddress());
	System.out.println("전공: " + major);
	}
}
