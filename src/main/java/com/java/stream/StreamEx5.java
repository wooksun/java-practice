package com.java.stream;
import java.util.*;
import java.util.stream.*;

public class StreamEx5 {
	public static void main(String[] args) {
		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
		};
		
		Stream.of(strArr).forEach(System.out::println);
		
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length()==0); //true, false
		Optional<String> sWord = Stream.of(strArr)
				.filter(s->s.charAt(0)=='s').findFirst();
		
		System.out.println("noEmptyStr="+noEmptyStr);
		System.out.println("sWor="+sWord.get());
		
		//Stream<String[]>을 IntStream으로 변환
		//단어의 길이를 Int로 변환 -> Inheritance = 11, sum = 3 등등
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b) -> a+1); //단어의 수
		int sum = intStream2.reduce(0, (a,b) -> a+b); //총 단어 길이의 합
		
		OptionalInt max = intStream3.reduce(Integer::max); //길이가 제일 긴 단어
		OptionalInt min = intStream4.reduce(Integer::min); //길이가 제일 짧은 단어
		
		System.out.println("count="+count);
		System.out.println("sum="+sum);
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
