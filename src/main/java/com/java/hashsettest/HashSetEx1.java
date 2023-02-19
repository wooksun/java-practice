package com.java.hashsettest;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();
		
		for(int i=0; i < objArr.length; i++) {
			set.add(objArr[i]);  //HashSet에 objArr의 요소들을 저장한다.
		}
		//HashSet에 저장된 요소들을 출력한다.
		System.out.println(set);
	}
	//add메서드는 객체를 추가할 때 HashSet에 이미 같은 객체가 있으면 중복으로 간주하고 저장하지 않는다.
	//'1'이 두번 출력되었는데, 하나는 String 인스턴스이고 다른하나는 Integer인스턴스로 서로 다른 객체이다.(중복간주X)
	

}
