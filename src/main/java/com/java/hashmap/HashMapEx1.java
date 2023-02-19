package com.java.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111"); //저장되지 않음.
		map.put("asdf", "1234"); //asdf라는 키가 중복되어 키(key)는 중복을 허용하지 않기 때문에, asdf-1234가 새로 추가되는 대신 기존의 값을 덮어썼다.
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 pw를 입력해주세요.");
			System.out.print("id :");
			String id = s.nextLine().trim();
			
			System.out.print("pw :");
			String pw = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다." + "다시 입력해주세요.");
				continue;
			}else {
				if(!(map.get(id)).equals(pw)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				}else {
					System.out.println("id와 pw가 일치합니다.");
					break;
				}
			}
		}//while
	}//main

}
