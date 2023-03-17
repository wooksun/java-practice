//package com.java.generics;
//
////@Depreacted가 붙은 대상을 사용하여 고의적으로 오류메시지가 나타나도록 함.
////오류메시지가 나타났지만, 컴파일도 실행됨.
//
//class NewClass {
//	int newField;
//	
//	int gerNewFiled() { return newField; }
//	
//	@Deprecated
//	int  lodField;
//	
//	@Deprecated
//	int getOldField() { return oldFiled; }
//}
//
//public class AnnotationEx2 {
//	public static void main(String[] args) {
//		NewClass nc = new NewClass();
//		
//		nc.oldField = 10; //@Depreacted가 붙은 대상을 사용
//		System.out.println(nc.getOldField()); //@Depreacted가 붙은 대상을 사용
//	}
//
//}
