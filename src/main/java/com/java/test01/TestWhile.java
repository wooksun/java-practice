package com.java.test01;

import java.util.Scanner;

public class TestWhile {

	public static void main(String[] args) {

//		while문 예제
//		int i = 5; 
		
//		i--!=0 은 i의 값이 0이 아닌 동안만 참이 됨, i값이 반복마다 1씩 감소한 후 0이 되면 조건식이 false로 인식되어 while문을 벗어남
//		while (i--!=0) {
//			System.out.println(i + " - I CAN DO IT.");
//		}
		
//		-----------------------------------------------------
		
//		int i = 11;
//		System.out.println("카운트 다운을 시작합니다.");
//		
//		while (i--!=0) {
//			System.out.println(i);
//			
//			for(int j=0; j<2_000_000_000; j++) {
//				;
//			}
//		}
//		System.out.println("GAME OVER");
		
//		-----------------------------------------------------

//		while문 숫자를 입력받고 각 자리의 합을 구하는 예제
		
//		int num=0, sum=0;
//		System.out.print("숫자를 입력하세요. (예:12345)>");
//		
//		Scanner scanner = new Scanner (System.in);
//		String tmp = scanner.nextLine();
//		num = Integer.parseInt(tmp);
//		
//		while (num!=0) {
//			sum += num%10;
//			System.out.printf("sum=%3d num=%d%n", sum, num);
//			num /= 10;
//		}
//		System.out.println("각 자리수의 합:"+sum);
		
//		-----------------------------------------------------

//		전위연산자로 더해지는 i와 sum간의 덧셈으로 1부터 몇까지 더하면 누적합계가 100을 넘지 않는 가장 큰 수인지 구하는 예제
//		int sum=0;
//		int i=0;
//		
//		while((sum += ++i)<= 100) {
//			System.out.printf("%d - %d%n", i, sum);
//		}
		
//		-----------------------------------------------------

//		int num;
//		int sum = 0;
//		boolean flag = true;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)>");
//		
//		while(flag) {
//			System.out.print(">>");
//			
//			String tmp = scanner.nextLine();
//			num = Integer.parseInt(tmp);
//			
//			if(num != 0) {
//				sum += num;
//			}else {
//				flag = false;
//			}
//		}
//		System.out.println("합계:"+sum);
		
//		-----------------------------------------------------

		
//		do while문 예제
//		1~100 사이의 랜덤의 값 answer값을 맞추기 위해 사용자가 정수를 입력하여 (input) 랜덤값을 맞추는 예제
//		int input = 0, answer = 0;
//		
//		answer = (int)(Math.random()*100)+1;
//		Scanner scanner = new Scanner(System.in);
//		
//		do {
//			System.out.print("1과 100사이의 정수를 입력하세요.>");
//			input = scanner.nextInt();
//			
//			if(input>answer) {
//				System.out.println("더 작은 수로 다시 시도해보세요.");
//			}else if(input<answer) {
//				System.out.println("더 큰 수로 다시 시도해보세요.");
//			}
//		}while(input!=answer);
//		System.out.println("정답입니다.");
		
//		-----------------------------------------------------
		
//		3,6,9가 포함되어 있으면 포함된 개수만큼 박수치는 예제
//		for(int i=1; i<=100; i++) {
//			System.out.printf("i=%d", i);
//			
//			int tmp = i;
//			
//			do {
//				if(tmp%10%3==0 && tmp%10!=0)
//					System.out.print("짝");
//			}while((tmp/=10)!=0);
//			System.out.println();
//		}
		
//		-----------------------------------------------------

//		break문 예제 / 1부터 더했을 때 100을 넘기는 수를 구하는 예제
//		int sum = 0;
//		int i = 0;
//		
//		while (true) {
//			if (sum>100) 
//				break;
//				++i;
//				sum += i;
//		}
//		System.out.println("i=" +i);
//		System.out.println("sum="+sum);

//		-----------------------------------------------------

//		for (int i=0; i<=10; i++) {
//			if (i%3==0)
//				continue;
//			System.out.println(i);
//		}
		
//		-----------------------------------------------------

		
//		int menu = 0, num = 0;
//		Scanner scanner = new Scanner(System.in);
//		
//		outer:
//			while(true) {
//				System.out.println("(1) square");
//				System.out.println("(2) square root");
//				System.out.println("(3) log");
//				System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");
//				
//				String tmp = scanner.nextLine();
//				menu = Integer.parseInt(tmp);
//				
//				if(menu==0) {
//					System.out.println("프로그램을 종료합니다.");
//					break;
//				}else if(!(1<=menu && menu <=3)) {
//					System.out.println("메뉴를 잘못 선택하셨습니다. (종료:0)");
//					continue;
//				}
//				
//				for(;;) {
//					System.out.print("계산할 값을 입력하세요. (계산종료:0, 전체종료:99)>");
//					tmp = scanner.nextLine();
//					num = Integer.parseInt(tmp);
//					
//					if(num==0) 
//						break;
//					if(num==99)
//						break outer;
//					
//					switch (menu) {
//					case 1:
//						System.out.println("result="+num*num);
//						break;
//					case 2:
//						System.out.println("result="+Math.sqrt(num));
//						break;
//					case 3:
//						System.out.println("result="+Math.log(num));
//						break;
//					}
//				}
//			}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
