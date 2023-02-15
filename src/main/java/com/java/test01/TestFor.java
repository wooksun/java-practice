package com.java.test01;

import java.util.Scanner;

public class TestFor {

	public static void main(String[] args) {

//		기본적인 for문 예제 int i는 1부터 10까지 1씩 증가하는 예제
//		for (int i=1; i<=10; i++) {
//			System.out.println("I CAN DO IT");
//		}
		
//		--------------------------------------
		
//		쉼표를 통해 초기화와 증감식의 두 문장을 하나로 연결해서 쓰는 예제
//		for (int i=1, j=10; i<=10; i++, j--) {
//			System.out.println("화이팅");
//		}
		
//		--------------------------------------

//		int i가 1부터 5까지 찍히는 예제 / println은 세로로 출력되어 나온다.
//		for(int i=1; i<=5; i++)
//			System.out.println(i);
		
//		위와 같은 식이지만, print로 출력하여 12345의 값이 가로로 출력되어 나온다.
//		for(int i=1; i<=5; i++)
//			System.out.print(i);
//		--------------------------------------

//		for문 예제
//		sum은 합계를 저장하기 위한 변수
//		int sum = 0;
//		
//		for (int i=1; i<=10; i++) {
//			sum += i; //sum = sum + i;
//			System.out.printf("1부터 %2d 까지의 합 : %2d%n",i ,sum);
//		}
//		i가 1부터 10까지 더해지는 문장이며, sum+i가 실행된다. 실행되는 sum+i는 sum=sum+i의 식으로 sum+i가 sum에 저장되는 방식이다.
//		따라서 증감식은 0+1=1의 값은 sum에 저장되고, 저장된 sum의 값은 다음 증감식에서 다시 더해지게 된다 1+2=3, 3+3=6, 6+4=10, 1=+5=15...

//		--------------------------------------

//		i는 1부터 10까지 증가, j는 10부터 1까지 감소시키는 식 
//		for (int i=1, j=10; i<=10; i++, j--)
//			System.out.printf("%d \t %d%n", i, j);
		
//		위와 동일한 결과값을 나타내지만, 변수를 하나만 두어 출력할 수 있는 식이다.
//		for (int i=1; i<=10; i++) {
//			System.out.printf("%d \t %d%n", i, 11-i);
//		}
		
		
//		--------------------------------------

//		System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
//		System.out.println("-----------------------------------------------");
//		
//		for(int i=1; i<=10; i++)
//			System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n", i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
		
		
//		--------------------------------------

//		1번예제
//		for (int i=1; i<=5; i++) {
//			System.out.println("**********");
//		}
//		System.out.println("**********");을 다섯번 출력하는 것과 같은 값이 나온다.
		
//		2번예제
//		for (int i=1; i<=10; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
//		System.out.println("**********");을 출력한 것과 같은 값이 나온다.
		
//		3번예제
//		for문 중첩 예제
//		for (int i=1; i<=5; i++) {
//			for (int j=1; j<=10; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for문을 중첩시켜 5행과 10열을 만들 수 있다.
//		1번 예제와 2번 예제를 중첩시켜 결과물을 같게 만들 수 있다.
		
//		--------------------------------------

//		for 중첩문, 위의 예제는 5*10 이었다.
//		지금 예제는 순차적으로 별의 숫자가 1부터 5까지 찍히는 예제이다.
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		 
		
//		--------------------------------------

//		사용자가 입력한 값까지 라인의 수를 입력받아 별을 출력하는 예제
//		int num = 0;
//		
//		System.out.print("*을 출력할 라인의 수를 입력하세요.>");
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();
//		num = Integer.parseInt(tmp);
//		
//		for(int i=0; i<num; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		--------------------------------------

//		2부터 9까지의 구구단을 출력하는 예제
//		
//		for (int i=2; i<=9; i++) {
//			for (int j=1; j<=9; j++) {
//				System.out.printf("%d x %d = %d%n", i, j, i*j);
//			}
//		}
//		안쪽 for문은 하나의 단을 출력한다 / 바깥쪽 for문은 안쪽 for문을 8번 (2단부터 9단까지) 반복해서 출력하게 된다.
		
		
//		--------------------------------------

//		for (int i=1; i<=3; i++)
//			for(int j=1; j<=3; j++)
//				for(int k=1; k<=3; k++)
//					System.out.println(""+i+j+k);
		
//		--------------------------------------

//		
//		for (int i=1; i<=5; i++) {
//			for (int j=1; j<=5; j++) {
//				System.out.printf("[%d, %d]",i,j);
//			}
//			System.out.println();
//		}
		
//		--------------------------------------

		
//		for (int i=1; i<=5; i++) {
//			for (int j=1; j<=5; j++) {
//				if (i==j) {
//					System.out.printf("[%d, %d]", i, j);
//				}
//				else {
//					System.out.printf("%5c", ' ');
//				}
//			}
//			System.out.println();
//		}
		
//		--------------------------------------

		
		
		
		
		
		
		
		
		
		
		
	}

}
