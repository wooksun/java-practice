//package com.java.lambda;
//@FunctionalInterface
//interface MyFunction {
//	void myMethod(); //public abstract void myMethod();
//}
//
//public class LambdaEx2 {
//	public static void main(String[] args) {
//		MyFunction f = ()->{}; //MyFunction f = (MyFunction) ( ()->{});
//		Object obj = (MyFunction) ( ()->{}); //Object타입으로 형변환이 생략됨
//		String str = ((Object)(MyFunction) ( ()->{})).toString();
//		
//		System.out.println(f);
//		System.out.println(obj);
//		System.out.println(str);
//		
////		System.out.println(()->{}); //에러. 람다식은 Object타입으로 형변환이 안됨
//		System.out.println((MyFunction) (()-> {}));
//		
////		System.out.println((MyFunction)( ()-> {}).toString()); //에러
//		System.out.println(((Object)(MyFunction) ( ()-> {})).toString());
//	}
//
//}
//
////일반적인 익명 객체라면,
////객체의 타입이 '외부클래스이름$번호'와 같은 형식으로 타입이 결정
//
////람다식의 타입은,
////'외부클래스이름$$Lambda$번호'와 같은 형식으로 됨.
