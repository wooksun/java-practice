package com.java.exam10;

import java.util.Scanner;
//이참조자료형안에 저장하고 읽어오겠다 라는 메서드들을 정의
class Controller {//친구 저장기능과 출력 기능
	private Friend[] friend;
	private  int indexOfFriend;
	final private int Max_FRIEND;//최대 크기를 고정해놓고-데이터값 변경 불가
	
	
	Controller(){
		
		indexOfFriend = 0;
		Max_FRIEND = 200;
		
		friend = new Friend[Max_FRIEND];//고등학교 대학교 친구를 친구라는 이름으로 관리 하겠다
		
}
	
	//친구 저장
	public void addFriend(int choice) {
		//System.out.println("친구 추가");-동작이 잘 작동되나 확인하는 용도로 사용 했다
		Scanner input = new Scanner(System.in);
		String name = "", phone ="", address ="",work ="",major="";
		boolean marry = false;
		
		System.out.print("이름을 입력하세요: ");
		name = input.nextLine();		
		
		System.out.print("전화번호를 입력하세요: ");
		phone = input.nextLine();
		
		System.out.print("주소을 입력하세요: ");
		address = input.nextLine();
		
		if(choice == 1){
			System.out.print("결혼여부(true/false)를 입력하세요: ");
			 marry = input.nextBoolean();
			 
		} else {
			System.out.println("결혼 O");
			friend[indexOfFriend++] = new MIdFriend(name,phone,address,marry);
		}
		
		if(choice == 2) {
			System.out.print("직업을 입력하세요: ");
			work = input.nextLine();
			
			 friend[ indexOfFriend++] = new HighFriend(name,phone,address,work);//다형성	
			
		}else if(choice==3) {
			System.out.print("전공을 입력하세요: ");
			major = input.nextLine();
			
			 friend[indexOfFriend++] = new UnivFriend(name,phone,address,work);//다형성	 
			System.out.println("");
		
		}//만약 중학교 친구도 추가되면 여기서 else if 하고 new 해주면 된다
		}
	
	//중학교 친구 정보출력
	public void showMIdFriendInfo() {
		for(int i = 0;i < indexOfFriend;i++) {
			if(friend[i] instanceof MIdFriend ) {
				friend[i].showFriendInfo();
			}
		}
	}
	//고교 친구 정보 출력
	public void showHighFriendInfo() {
		for(int i = 0;i < indexOfFriend;i++) {
			if(friend[i] instanceof HighFriend ) {
				friend[i].showFriendInfo();
			}
		}
			}
//	//대학 친구 정보 출력
	public void showUnivFriendInfo() {
		for(int i = 0;i < indexOfFriend ;i++) {
			if(friend[i] instanceof UnivFriend ) {
			friend[i].showFriendInfo();
			}
		}	
	}
	//모든 친구 출력
	public void showFriendInfo() {
		//System.out.println("친구 출력");	
		for(int i = 0;i < indexOfFriend;i++) {
			friend[i].showFriendInfo();//friend는 프렌드 영역만 접근할수 있어서 에러가 나고있다 
			//번호수에 맞춰서 자기가알아서 적용한다
		}
	}	
	//기본 정보 출력
	public void showBasicInfo() {
		for(int i = 0;i < indexOfFriend;i++) {
			friend[i].showBasicFriendInfo();
		}
	}
}














































