package com.java.hashsettest;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i=0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) +1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
	}
	
	//번호를 크기순으로 정렬하기 위해 Collections 클래스의 sort(List list)를 사용
	//sort(List list)는 List인터페이스를 필요로 함
	//-> LinkedList클래스의 생성자 LinkedList(Collection c)를 이용해서 HashSet에 저장된 객체들을 LinkedList에 담아서 처리.

}
