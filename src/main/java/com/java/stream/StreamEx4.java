package com.java.stream;
import java.util.*;
import java.util.stream.*;

public class StreamEx4 {
	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
				new String[] {"abc", "def", "jkl"},
				new String[] {"ABC", "GHI", "JKL"}
			);
		
//		Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::Stream);
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
		strStrm.map(String::toLowerCase) //모든 단어 소문자
			.distinct() //중복제거
			.sorted() //사전순으로 정렬
			.forEach(System.out::println);
		System.out.println();
		
		String[] lineArr = {
				"Believe or not It is true",
				"Do or do not There is no try",
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr); //스트림이 두개 생성
		lineStream.flatMap(line -> Stream.of(line.split(" +"))) //생성된 두개의 스트림이 flatMap을 통해 스트림을 하나로 합침. -> 결과들이 하나로 모임
			.map(String::toLowerCase) //모든 단어 소문자
			.distinct() //중복제거
			.sorted() //사전순 정렬
			.forEach(System.out::println);
		System.out.println();
		
		Stream<String> strStrm1 = Stream.of("AAA", "ABC", "bBb", "Dd");
		Stream<String> strStrm2 = Stream.of("bbb", "aaa", "ccc", "dd");
		
		Stream<Stream<String>> strStrmStrm = Stream.of(strStrm1, strStrm2);
		Stream<String> strStream = strStrmStrm
				.map(s-> s.toArray(String[]::new))
				.flatMap(Arrays::stream);
		strStream.map(String::toLowerCase)
			.distinct()
			.forEach(System.out::println);
	}

}
