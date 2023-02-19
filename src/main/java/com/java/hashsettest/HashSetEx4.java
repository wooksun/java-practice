package com.java.hashsettest;

import java.util.HashSet;

public class HashSetEx4 {

	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));

		System.out.println(set);
	}

}

class Person2 {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age==tmp.age;
		}
		
		return false;
	}
	
	public int hashCode() {
		return (name+age).hashCode();
	}
	
	public String toString() {
		return name+ ":" +age;
	}
}

//결과는 HashSetEx3과 같다.
//여기서 주목해야 할 점은 equals()와 hashCode()의 활용이다. 
//String 클래스에서 같은 내용의 문자열에 대한 equals()의 호출결과가 true인 것과 같이, Pesrson2 클래스에서도 name과 age가 서로 같으면 true를 반환하도록 equals()를 오버라이딩 하였다.
//hashCode()는 String 클래스의 hashCode()를 이용하여 구현. 