package com.java.test01;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
//		int i = 10;
//		float f = 20.0f;
//		
//		float result = f + i;
//		System.out.println(f);
		
//		-------------------------
		
//		int x=5, y=5;
//		System.out.println(x++);
//		후위형 연산자이기 때문에 x인 5의 값이 출력 됨 = 5
//		System.out.println(++y);
//		전위형 연산자이기 때문에 y의 5에 1이 더해져서 출력됨 = 6
//		System.out.println("x=" + x + ", y="+y);
//		전위와 후위 모두 출력은 6으로 됨 x=6, y=6
		
//		-------------------------

		
//		int i = -10;
//		i = +i;
//		System.out.println(i);
//		-+ 10이기 때문에 -10이 출력된다.
//		
//		i = -10;
//		i = -i;
//		System.out.println(i);
//		--10이기 때문에 +10 즉 10이 출력된다.
		
//		-------------------------

		
//		int a = 10;
//		int b = 4;
//		
//		System.out.printf("%d + %d = %d%n", a,b,a+b);
//		System.out.printf("%d - %d = %d%n", a,b,a-b);
//		System.out.printf("%d * %d = %d%n", a,b,a*b);
//		System.out.printf("%d / %d = %d%n", a,b,a/b);
//		원래라면 2.5라는 값이 나와야 하지만 int는 정수형이므로 소수점 이하 자리는 생략되어 2라는 정수가 출력된다.
//		System.out.printf("%d / %f = %f%n", a,(float)b,a/(float)b);
//		float으로 형변환하여 값은 2.5가 나옴
//		-------------------------

//		byte를 정수형으로 표현하기엔 값이 커서 (byte)(a*b)로 형변환을 해준다
//		byte가 int보다 값이 작기 때문에 자동 형변환이 불가하여 직접 형변환을 해주도록 한다.
//		그리고 값은 300이 나와야 하는데 byte가 형변환하는 과정에서 값손실이 일어나 44라는 값이 출력된다.
//		byte a = 10;
//		byte b = 30;
//		byte c = (byte)(a*b);
//		System.out.println(c);
		
//		-------------------------
//		System.out.printf("10 == 10.0f \t %b%n", 10==10,0f);
//		System.out.printf("'0'==0 \t %b%n", '0'==0);
//		System.out.printf("'A'==65 \t %b%n", 'A'==65);
//		System.out.printf("'A'>'B' \t %b%n", 'A'>'B');
//		System.out.printf("'A'+1 != 'B' \t %b%n", 'A'+1 != 'B');

		
//		-------------------------
		
//		String str = new String("abc");
//		boolean result = str.equals("abc");
//		
//		System.out.println(str);
		
		
//		-------------------------

//		논리연산자 예제
//		int x = 0;
//		char ch = ' ';
//		
//		x=15;
//		System.out.printf("x=%2d, 10 < x&&x < 20 =%b%n", x, 10 < x&&x < 20);
//		
//		x = 6;
//		System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x%%6!=0 =%b%n", x, x%2==0||x%3==0&&x%6!=0);
//		System.out.printf("x=%2d, (x%%2==0 || x%%3==0 &&x%%6!=0 =%b%n", x, (x%2==0||x%3==0)&&x%6!=0);
//		
//		ch='1';
//		System.out.printf("ch='%c', '0' <= ch && ch <= '9' =%b%n", ch, '0'<=ch&&ch<='9');
//		
//		ch='a';
//		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' =%b%n", ch, 'a'<=ch&&ch<='z');
//		
//		ch='A';
//		System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z' =%b%n", ch, 'A'<=ch&&ch<='Z');
//		
//		ch='q';
//		System.out.printf("ch='%c', ch=='q' || ch=='Q' =%b%n", ch, ch=='q'||ch=='Q');
//		
//		ch='r';
//		System.out.printf("ch='%c', 'a' <= ch && ch <= 'g' =%b%n", ch, 'a'<=ch&&ch<='g');
		
//		-------------------------

//		사용자로부터 하나의 문자를 입력받아서 숫자인지 영문자인지 확인하는 예제
//		Scanner scanner = new Scanner(System.in);
//		char ch = ' ';
//		
//		System.out.printf("문자를 하나 입력하세요.>");
//		
//		String input = scanner.nextLine();
//		ch = input.charAt(0);
//		
//		if('0'<= ch && ch<= '9') {
//			System.out.printf("입력하신 문자는 숫자입니다.%n");
//		}
//		
//		if(('a'<= ch && ch<= 'z') || ('A'<=ch&&ch<='Z')) {
//			System.out.printf("입력하신 문자는 영문자입니다.%n");
//		}
		
//		-------------------------

//		조건연산자
//		조건연산자 -> result = (x>y) ? x:y;에서 x는 참, y는 거짓을 의미한다.
//		만약 x의 값이 5고 y의 값이 3일 때 x는 true 즉 참이 된다. 그렇다면 result의 값은 x값 5가 된다.
//		하지만 y의 값이 6으로 x>y식이 false 즉 거짓이 된다면, result의 값은 y의 값 6이 들어가게 된다.
//		이렇듯 조건식이 참(true)이라면 result에 참이 저장되고, 거짓(false)이라면 result에 거짓이 저장된다.
		
//		int x, y, z;
//		int absX, absY, absZ;
//		char signX, signY, signZ;
//		
//		x=10;
//		y=-5;
//		z=0;
//		
//		absX = x >= 0 ? x : -x;
//		absY = y >= 0 ? y : -y;
//		absZ = z >= 0 ? z : -z;
//		
//		signX = x > 0 ? '+' : (x==0 ? ' ' : '-');
//		signY = y > 0 ? '+' : (y==0 ? ' ' : '-');
//		signZ = z > 0 ? '+' : (z==0 ? ' ' : '-');
//		
//		System.out.printf("x=%c%d%n", signX, absX);
//		System.out.printf("y=%c%d%n", signY, absY);
//		System.out.printf("z=%c%d%n", signZ, absZ);
//		
		
//		-------------------------

		
		
		
		
		
		
		
		
	}

}
