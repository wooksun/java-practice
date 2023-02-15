package com.java.test01;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		
//		int[] score; -> int형 배열 참조변수 score를 선언하는 것.
		
//		score = new int[5]; -> 연산자 new에 의해 메모리의 빈 공간에 5개의 int형 데이터를 저장할 수 있는 공간 마련.
//		-> 각 배열요소는 자동적으로 int의 기본값인 0으로 초기화
//		대입연산자 '='에 의해 int형 배열 참조변수 score에 저장된다. (0x100)
		
//		배열의 길이와 인덱스
//		-> 인덱스 : index의 범위는 0부터 배열길이-1까지다.
		
//		----------------------------------------------------------
		
//		score의 길이는 5이므로 index 범위는 0~4이다. 범위를 넘는 7을 index로 해서 값을 출력하여 오류가 뜨는 예제를 해보았다.
		
//		int[] score = new int[5];
//		int k = 1;
//		
//		score[0] = 50;
//		score[1] = 60;
//		score[k+1] = 70;
//		score[3] = 80;
//		score[4] = 90;
//		
//		int tmp = score[k+2] + score[4];
//		
//		for(int i=0; i<5; i++) {
//			System.out.printf("score[%d]:%d%n", i, score[i]);
//		}
//		System.out.printf("tmp:%d%n", tmp);
//		System.out.printf("score[%d]:%d%n",7,score[7]);
		
//		----------------------------------------------------------

//		배열의 출력
//		int[] iArr = {100, 95, 80, 70, 60};
//		for(int i=0; i< iArr.length; i++) {
//			System.out.print(iArr[i]+",");
//		}
//		System.out.println();
//		----------------------------------------------------------

		
//		int[] iArr = {100, 95, 80, 70, 60};
//		System.out.println(Arrays.toString(iArr));
		
//		----------------------------------------------------------

//		배열의 출력
//		int[] iArr1 = new int[10];
//		int[] iArr2 = new int[10];
//		int[] iArr3 = {100, 95, 80, 70, 60};
//		char[] chArr = {'a', 'b', 'c', 'd'};
//		
//		for (int i=0; i<iArr1.length; i++) {
//			iArr1[i] = i + 1;
//		}
//		
//		for (int i=0; i<iArr2.length; i++) {
//			iArr2[i] = (int)(Math.random()*10) + 1;
//		}
//		
//		for (int i=0; i<iArr1.length; i++) {
//			System.out.print(iArr1[i]+",");
//		}
//		
//		System.out.println();
//		System.out.println(Arrays.toString(iArr2));
//		System.out.println(Arrays.toString(iArr3));
//		System.out.println(Arrays.toString(chArr));
//		System.out.println(iArr3);
//		System.out.println(chArr);
		
//		----------------------------------------------------------

//		배열의 복사
//		int[] arr = new int[5];
//		
//		for(int i=0; i<arr.length; i++) 
//			arr[i] = i + 1;
//			
//		System.out.println("[변경전]");
//		System.out.println("arr.length:"+arr.length);
//		
//		for(int i=0; i<arr.length;i++)
//			System.out.println("arr["+i+"]:"+arr[i]);
//		
//		int[] tmp = new int[arr.length*2];
//		
//		for(int i=0;i<arr.length;i++)
//			tmp[i] = arr[i];
//		arr = tmp;
//		
//		System.out.println("[변경 후]");
//		System.out.println("arr.length:"+arr.length);
//		
//		for(int i=0; i<arr.length;i++)
//			System.out.println("arr["+i+"]:"+arr[i]);
		
//		----------------------------------------------------------

//		System.arraycopy()를 이용한 배열의 복사 예제
//		char[] abc = {'A', 'B', 'C', 'D'};
//		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
//		System.out.println(abc);
//		System.out.println(num);
//		
//		char[] result = new char[abc.length+num.length];
//		System.arraycopy(abc, 0, result, 0, abc.length);
//		System.arraycopy(num, 0, result, abc.length, num.length);
//		System.out.println(num);
//		
//		System.arraycopy(abc, 0, num, 0, abc.length);
//		System.out.println(num);
//		
//		System.arraycopy(abc, 0, num, 6, 3);
//		System.out.println(num);
		
//		----------------------------------------------------------

//		배열의 총합과 평균 / 배열의 모든 요소를 더해서 총합과 평균을 구한다
//		int sum = 0; 
//		float average = 0f; 
		
		//		score[0], score[1], ...
//		int[] score = {100, 88, 100, 100, 90}; 		
//		for (int i=0; i < score.length; i++) {
//			sum += score[i]; 
//		}
//		average = sum / (float)score.length;
//		
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + average);
		
//		----------------------------------------------------------

//		최댓값과 최솟값 구하기
//		int[] score = {79, 88, 91, 33, 100, 55, 95};
//		
//		int max = score[0];
//		int min = score[0];
//		
//		for (int i=1; i<score.length; i++) {
//			if(score[i] > max) {
//				max = score[i];
//			}else if (score[i] < min) {
//				min = score[i];
//			}
//		}
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
		
//		----------------------------------------------------------

//		섞기 예제
//		int[] numArr = new int[10];
//		
//		for(int i=0; i<numArr.length; i++) {
//			numArr[i] = i;
//			System.out.print(numArr[i]);
//		}
//		System.out.println();
//		
//		for (int i=9; i< 100; i++) {
//			int n = (int)(Math.random() * 10);
//			int tmp = numArr[0];
//			numArr[0] = numArr[n];
//			numArr[n] = tmp;
//		}
//		for (int i=0; i < numArr.length; i++) {
//			System.out.print(numArr[i]);
//		}
//		
//		----------------------------------------------------------

//		로또 번호 뽑기 예제
		int[] ball = new int[45];
		for(int i=0; i < ball.length; i++) 
			ball[i] = i+1;
			
			int temp = 0;
			int j = 0;
			
			for (int i=0; i < 6; i++) {
				j = (int)(Math.random() * 45);
				temp = ball[i];
				ball[i] = ball[j];
				ball[j] = temp;
			}
			
			for(int i=0; i < 6; i++) 
				System.out.printf("ball[%d]=%d%n", i, ball[i]);
		
		
//		----------------------------------------------------------

//		불연속적인 값들로 구성된 배열 임의값 채우기 예제
//		int[] code = {-4, -1, 3, 6, 11};
//		int[] arr = new int[10];
//		
//		for(int i=0; i < arr.length; i++) {
//			int tmp = (int)(Math.random() * code.length);
//			arr[i] = code[tmp];
//		}
//		System.out.println(Arrays.toString(arr));
		
//		----------------------------------------------------------

//		int[] numArr = new int[10];
//		
//		for(int i=0; i < numArr.length; i++) {
//			System.out.print(numArr[i] = (int)(Math.random() * 10));
//		}
//		System.out.println();
//		
//		for(int i=0; i < numArr.length; i++) {
//			boolean changed = false;
//			
//			for(int j=0; j < numArr.length-1-i; j++) {
//				if(numArr[j] > numArr[j+1]) {
//					int temp = numArr[j];
//					numArr[j] = numArr[j+1];
//					numArr[j+1] = temp;
//					changed = true;
//				}
//			}
//			if(!changed) break;
//			
//			for(int k=0; k < numArr.length; k++)
//				System.out.print(numArr[k]);
//			System.out.println();
//		}
		
		
//		----------------------------------------------------------

//		int[] numArr = new int[10];
//		int[] counter = new int[10];
//		
//		for(int i=0; i < numArr.length; i++) {
//			numArr[i] = (int)(Math.random()*10);
//			System.out.print(numArr[i]);
//		}
//		System.out.println();
//		
//		for(int i=0; i<numArr.length; i++) {
//			counter[numArr[i]]++;
//		}
//		
//		for(int i=0; i<numArr.length; i++) {
//			System.out.println(i + "의 개수 : "+counter[i]);
//		}
		
		
//		----------------------------------------------------------

//		Stirng 배열 
//		String[] names = {"Kim", "Park", "Yi"};
//		
//		for(int i=0; i<names.length; i++) 
//			System.out.println("names["+i+"] :"+names[i]);
//		
//		String tmp = names[2];
//		System.out.println("tmp:"+tmp);
//		names[0] = "Yu";
//		
//		for(String trt : names)
//			System.out.println(str);
		
//		----------------------------------------------------------

//		String str = "java";
//		str = str + "8";
//		System.out.println(str);
	
//		----------------------------------------------------------
//		charAt 메서드

//		String str = "ABCDE";
//		char ch = str.charAt(3);
//		System.out.println(ch);
//		
//		----------------------------------------------------------
//		substring 메서드
//		String str = "012345";
//		String tmp = str.substring(1,5);
//		System.out.println(tmp);
		
//		----------------------------------------------------------

		
//		String str = "abc";
//		if(str.equals("abc")) {
//		}
		
//		----------------------------------------------------------

//		String src = "ABCDE";
//		
//		for(int i=0; i < src.length(); i++) {
//			char ch = src.charAt(i);
//			System.out.println("src.charAt(" + i +"):" + ch);
//		}
//		char[] chArr = src.toCharArray();
//		System.out.println(chArr);
		
//		----------------------------------------------------------

//		커맨드 라인을 통해 입력받기
//		if(args != null) {
//		System.out.println("매개변수의 개수:" +args.length);
//		for (int i=0; i < args.length; i++) {
//			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
//		}
//	}
		
//		----------------------------------------------------------

//		커맨드 라인을 통해 입력받기
//		if (args.length != 3) {
//			System.out.println("usage : java TestArray NUM1 OP NUM2");
//			System.exit(0);
//		}
//		
//		int num1 = Integer.parseInt(args[0]);
//		char op = args[1].charAt(0);
//		int num2 = Integer.parseInt(args[2]);
//		int result = 0;
//		
//		switch(op) {
//		case '+':
//			result = num1 + num2;
//			break;
//			
//		case '-':
//			result = num1 - num2;
//			break;
//			
//		case '*':
//			result = num1 * num2;
//			break;
//			
//		case '/':
//			result = num1 / num2;
//			break;
//			
//			default :
//				System.out.println("지원되지 않는 연산입니다.");
//		}
//		System.out.println("결과:" + result);
		
//		----------------------------------------------------------
		
//		다차원배열 예제
//		int[][] score = new int [4][3];
//		score[0][0] = 100;
//		System.out.println(score[0][0]);

		
//		----------------------------------------------------------

		
//		int[][] score = {
//				{100, 100, 100}
//			,	{20, 20, 20}
//			,	{30, 30, 30}
//			,	{40, 40, 40}
//		};
//		int sum = 0;
//		
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
//			}
//		}
//		
//		for(int[] tmp : score) {
//			for (int i : tmp) {
//				sum += i;
//			}
//		}
//		System.out.println("sum=" + sum);
		
//		----------------------------------------------------------

//		final int SIZE = 10;
//		int x = 0, y = 0;
//		
//		char[][] board = new char[SIZE][SIZE];
//		byte[][] shipBoard = {
//				{0, 0, 0, 0, 0, 0, 1, 0, 0},
//				{1,1,1,1,0,0,1,0,0},
//				{0,0,0,0,0,0,1,0,0},
//				{0,0,0,0,0,0,1,0,0},
//				{0,0,0,0,0,0,0,0,0},
//				{1,1,0,1,0,0,0,0,0},
//				{0,0,0,1,0,0,0,0,0},
//				{0,0,0,1,0,0,0,0,0},
//				{0,0,0,0,0,1,1,1,0},
//		};
//		
//		for(int i=1; i<SIZE; i++)
//			board[0][i] = board[i][0] = (char)(i+'0');
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		while(true) {
//			System.out.printf("좌표를 입력하세요. (종료는 00)>");
//			String input = scanner.nextLine();
//			
//			if(input.length()==2) {
//				x = input.charAt(0) - '0';
//				y = input.charAt(1) - '0';
//				
//				if(x==0 && y==0)
//					break;
//			}
//			
//			if(input.length()!=2 || x<=0 ||x>=SIZE ||y<=0 || y>=SIZE) {
//				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
//				continue;
//			}
//			
//			board[x][y] = shipBoard[x-1][y-1]==1 ? 'O' : 'X';
//			
//			for(int i=0; i<SIZE; i++)
//				System.out.println(board[i]);
//			System.out.println();
//		}
		
//		----------------------------------------------------------
		
//		final int SIZE = 5;
//		int x=0, y=0, num=0;
//		
//		int [][] bingo = new int [SIZE][SIZE];
//		Scanner scanner = new Scanner(System.in);
//		
//		for(int i=0; i<SIZE; i++)
//			for(int j=0; j<SIZE; j++)
//				bingo[i][j] = i*SIZE + j +1;
//		
//		for(int i=0;i<SIZE;i++) {
//			for(int j=0; j<SIZE; j++) {
//				x = (int) (Math.random() * SIZE);
//				y = (int) (Math.random() * SIZE);
//				int tmp = bingo[i][j];
//				bingo[i][j] = bingo[x][y];
//				bingo[x][y] = tmp;
//			}
//		}
//		
//		do {
//			for (int i=0; i<SIZE; i++) {
//				for(int j=0; j<SIZE; j++)
//					System.out.printf("%2d ", bingo[i][j]);
//				System.out.println();
//			}
//			System.out.println();
//			
//			System.out.printf("1~%d의 숫자를 입력하세요. (종료:0)>", SIZE*SIZE);
//			String tmp = scanner.nextLine();
//			num = Integer.parseInt(tmp);
//			
//			outer:
//				for(int i=0; i<SIZE;i++) {
//					for(int j=0; j<SIZE; j++) {
//						if(bingo[i][j]==num) {
//							bingo[i][j] = 0;
//							break outer;
//						}
//					}
//				}
//		} while(num!=0);
		
//		----------------------------------------------------------

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
