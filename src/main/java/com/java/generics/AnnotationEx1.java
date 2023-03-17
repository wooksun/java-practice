package com.java.generics;

public class AnnotationEx1 {
	public static void main(String[] args) {
		
	}
}

class Parent {
	void parentMethod() {}
}

class Child extends Parent{
	@Override
//	void parentmethod() {} 였다면, 조상메서드의 이름을 잘못적어 오류 메세지가 떴을것이다.
	void parentMethod() {}
}

