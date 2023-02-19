package com.java.hashsettest;

import java.util.HashSet;

public class HashSetEx3 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		//add 메서드는 객체를 추가할 때 HashSet에 이미 같은 객체가 있으면 중복으로 간주. 저장하지 않음
		//여기서 set.add(new Person("David", 10));은 name과 age의 값이 같음에도 불구하고 서로 다른것으로 인식하여 두번 출력되었다. 
		//
		
		System.out.println(set);
	}

}

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age;
	}
}
