package com.java.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaEx8 {

	public static void main(String[] args) {
		//메서드 참조
		//람다식이 하나의 메서드만 호출하는 경우 '메서드 참조'라는 방법으로 람다식을 간략히 할 수 있다.
	
		//람다식
		//Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		//위의 람다식을 메서드 참조
//		Function<String, Integer> f = Integer::parseInt;
		
		//람다식
		//BiFunction<String, String, Boolean> f = (s1, s2) -> s1.equals(s2);
		//위의 람다식을 메서드 참조
//		BiFunction<String, String, Boolean> f = String::equals;
		
		//생성자
//		MyClass obj = new MyClass();
		//람다식
//		Function<String, Boolean> f = (x) -> obj.equals(x);
		//메서드 참조
//		Function<String, Boolean> f2 = obj::equals;
		
		
		
		//하나의 메서드만 호출하는 람다식은
		//'클래스이름::메서드이름'
		//'참조변수::메서드이름' 으로 바꿀 수 있다.
		
		
		
		//생성자의 메서드 참조
		//람다식
//		Supplier<MyClass> s = () -> new MyClass();
		//메서드참조
//		Supplier<MyClass> s = MyClass::new;
		
		
		//매개변수가 있는 생성자, 매개변수의 개수에 따라 알맞은 함수형 인터페이스를 사용.
		//람다식
//		Function<Integer, MyClass> f = (i) -> new MyClass(i);
		//메서드참조
//		Function<Integer, MyClass> f2 = MyClass::new;
		
		
		
		//배열을 생성할 때
		//람다식
//		Function<Integer, int[]> f = x -> new int[x];
		//메서드참조
//		Function<Integer, int[]> f2 = int[]::new;
		
	}

}


