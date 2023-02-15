package com.java.exam10;

class MIdFriend extends Friend{//중학교 친구
	private boolean marry;
	
	MIdFriend(String name, String phoneNum, String address, boolean marry) {
		super(name, phoneNum, address);
		this.marry = marry;
	}

	public void showFriendInfo() {
		super.showFriendInfo();//부모 클래스의 메소드를 가져오겠다
		System.out.println("결혼 여부 " + marry);
	}
	public void showBasicFriendInfo(){
		//이름/폰번호/주소/결혼여부.
		System.out.println("이름: " + getName() );
		System.out.println("폰번호: " + getPhoneNum() );
		System.out.println("주소: " + getAddress());
		System.out.println("결혼 여부 "+ marry);
	}
}
